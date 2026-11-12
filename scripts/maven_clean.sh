#!/bin/bash

#1 - type (Release, Temp, Beta, Nightly or Stage)
#2 - package for remove (RegulaDocumentReaderGit/com/regula/documentreader/api or com/regula/face/core/basic)

TYPE=$1
LOGIN=$2
PASSW=$3
BUNNY_CREDS=$4
DELETE_OLDER=15

# Protect Release builds
if [ "$(echo "$TYPE" | tr '[:upper:]' '[:lower:]')" == "release" ]; then
    echo "Release packages cannot be cleaned."
    exit 0
elif ["$(echo "$TYPE" | tr '[:upper:]' '[:lower:]')" == "nightly" ]; then
    $TYPE="Nightly"
elif ["$(echo "$TYPE" | tr '[:upper:]' '[:lower:]')" == "rc" ]; then
        $TYPE="RC"
elif ["$(echo "$TYPE" | tr '[:upper:]' '[:lower:]')" == "beta" ]; then
        $TYPE="Beta"
fi

# --- Server Environments ---
    FTP_HOST="maven-master.regulaforensics.com"
    FTP_USER="$LOGIN"
    FTP_PASS="$PASSW"
    FTP_BASE_URL="https://maven-master.regulaforensics.com/RegulaDocumentReaderWebClient/$TYPE"
    FTP_PATH="RegulaDocumentReaderWebClient/$TYPE/"

BUNNY_BASE_URL="https://storage.bunnycdn.com/maven-production-regulaforensics-sz/RegulaDocumentReaderWebClient/${TYPE}"


# --- Update XML & Generate Hashes ---
update_metadata_and_hashes() {
    local version="$1"
    local file="maven-metadata.xml"
    local date_str=$(date '+%Y%m%d%H%M%S')

    if [ ! -f "$file" ]; then
        echo "Error: $file does not exist for update."
        return 1
    fi

    # Update XML metadata
    xmlstarlet ed --inplace \
        --delete "/metadata/versioning/versions/version[contains(text(),'$version')]" \
        --var dateValue "'$date_str'" \
        --update '/metadata/versioning/latest' \
        --expr '/metadata/versioning/versions/version[last()]/text()' \
        --update '/metadata/versioning/release' \
        --expr '/metadata/versioning/versions/version[last()]/text()' \
        --update '/metadata/versioning/lastUpdated' \
        --expr '$dateValue' \
        "$file"

    # Generate checksums
    md5sum "$file" > "$file.md5"

    openssl dgst -sha1 -out "$file.sha1" "$file"
    sed -i 's/SHA1(maven-metadata.xml)= //g' "$file.sha1"

    openssl dgst -sha256 -out "$file.sha256" "$file"
    sed -i 's/SHA2-256(maven-metadata.xml)= //g' "$file.sha256"

    openssl dgst -sha512 -out "$file.sha512" "$file"
    sed -i 's/SHA2-512(maven-metadata.xml)= //g' "$file.sha512"
}



# FTP: Deletes via lftp and updates FTP maven-metadata
delete_ftp_version() {
    local version="$1"
    echo "  [FTP] Updating metadata and deleting version: $version"

    local temp_work_dir=$(mktemp -d)
    cd "$temp_work_dir" || return

    # Download current metadata from FTP
    wget -q "$FTP_BASE_URL/$PACKAGE/maven-metadata.xml" -O maven-metadata.xml

    if [ -f maven-metadata.xml ]; then
        update_metadata_and_hashes "$version"

        # Delete directory & re-upload updated metadata
        lftp -u "$FTP_USER,$FTP_PASS" "$FTP_HOST" << EOF
cd $FTP_PATH
mrm $version/*
rmdir $version
mput maven-metadata.*
bye
EOF
        echo "  [FTP] Successfully cleaned version $version."
    else
        echo "  [FTP] Warning: Could not download maven-metadata.xml from FTP."
    fi

    cd - > /dev/null || return
    rm -rf "$temp_work_dir"
}

# Bunny CDN : Deletes via HTTP REST API and updates Bunny maven-metadata
delete_bunny_version() {
    local version="$1"
    echo "  [Bunny CDN] Updating metadata and deleting version: $version"

    local temp_work_dir=$(mktemp -d)
    cd "$temp_work_dir" || return

    # Download current metadata from Bunny CDN
    curl -sS -X GET "$BUNNY_BASE_URL/maven-metadata.xml" \
        -H "AccessKey: $BUNNY_CREDS" \
        -o maven-metadata.xml

    if [ -f maven-metadata.xml ] && [ -s maven-metadata.xml ]; then
        update_metadata_and_hashes "$version"

        # 1. Delete directory via Bunny API
        curl -sS -X DELETE "$BUNNY_BASE_URL/$version/" \
            -H "AccessKey: $BUNNY_CREDS" > /dev/null

        # 2. Upload updated metadata files to Bunny CDN
        for ext in "" ".md5" ".sha1" ".sha256" ".sha512"; do
            local file_to_upload="maven-metadata.xml${ext}"
            if [ -f "$file_to_upload" ]; then
                curl -sS -X PUT "$BUNNY_BASE_URL/$file_to_upload" \
                    -H "AccessKey: $BUNNY_CREDS" \
                    --data-binary "@$file_to_upload" > /dev/null
            fi
        done
        echo "  [Bunny CDN] Successfully cleaned version $version."
    else
        echo "  [Bunny CDN] Warning: Could not fetch valid maven-metadata.xml from Bunny CDN."
    fi

    cd - > /dev/null || return
    rm -rf "$temp_work_dir"
}


# --- Search and Trigger Logic ---

process_ftp_storage() {
    echo "=== Processing FTP Storage ==="
    lftp -c "open -u '$FTP_USER,$FTP_PASS' '$FTP_HOST'; cd '$FTP_PATH'; ls -l" | while read -r line; do
        if [[ $line == d* ]]; then
            local date_str=$(echo "$line" | awk '{print $6, $7, $8}')
            local version=$(echo "$line" | awk '{print $9}')
            
            local folder_date=$(date -d "$date_str" +%s 2>/dev/null)
            local current_date=$(date +%s)

            if [ -n "$folder_date" ]; then
                local age=$(( (current_date - folder_date) / 86400 ))
                echo "FTP Version: $version | Age: $age days"

                if [ "$age" -gt "$DELETE_OLDER" ]; then
                    echo "delete_ftp_version "$version""
                fi
            fi
        fi
    done
}

process_bunny_storage() {
    echo "=== Processing Bunny CDN Storage ==="
    
    local response=$(curl -sS -X GET "$BUNNY_BASE_URL/" \
        -H "AccessKey: $BUNNY_CREDS" \
        -H "Accept: application/json")

    echo "$response" | jq -r '.[]? | select(.IsDirectory == true) | "\(.ObjectName)\t\(.LastChanged)"' \
    | while IFS=$'\t' read -r version last_changed; do
        if [ -n "$version" ]; then
            local iso_date=$(echo "$last_changed" | cut -d'T' -f1)
            local folder_date=$(date -d "$iso_date" +%s 2>/dev/null)
            local current_date=$(date +%s)

            if [ -n "$folder_date" ]; then
                local age=$(( (current_date - folder_date) / 86400 ))
                echo "Bunny Version: $version | Age: $age days"

                if [ "$age" -gt "$DELETE_OLDER" ]; then
                    echo "delete_bunny_version "$version""
                fi
            fi
        fi
    done
}


# --- Execution ---
process_ftp_storage
process_bunny_storage