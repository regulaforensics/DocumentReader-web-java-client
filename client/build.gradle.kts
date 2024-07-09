plugins {
    java
    id("com.github.sherter.google-java-format") version "0.9"
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
    withSourcesJar()
}

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/generated")
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:3.14.7")
    implementation("com.squareup.okhttp3:logging-interceptor:3.14.7")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("io.gsonfire:gson-fire:1.8.4")
    implementation("org.threeten:threetenbp:1.4.3")
    implementation("io.swagger:swagger-annotations:1.5.24")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
}

tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

/* ----------- Publishing config ------------------- */
// supressed for local development
// if you need to publish from local machine, create `gradle.properties` file in a project root and add 3 vairables:
// - version
// - regulaforensicsMavenUser
// - regulaforensicsMavenPassword
if (project.hasProperty("regulaforensicsMavenUser")) {

    val regulaforensicsMavenPassword: String by project
    val regulaforensicsMavenUser: String by project

    publishing {
        publications {
            create<MavenPublication>("client") {
                artifactId = "webclient"
                from(components["java"])
            }
        }
        repositories {
            maven {

                val releasesRepoUrl = uri("sftp://maven.regulaforensics.com:22/RegulaDocumentReaderWebClient")
                val betaRepoUrl = uri("sftp://maven.regulaforensics.com:22/RegulaDocumentReaderWebClient/Beta")
                val nightlyRepoUrl = uri("sftp://ftp.regula.local:22/RegulaDocumentReaderWebClient")

                name = "regulaforensics"
                url = if (version.toString().contains("beta")) betaRepoUrl
                        else if(version.toString().contains("nightly")) nightlyRepoUrl
                        else releasesRepoUrl
                credentials {
                    username = regulaforensicsMavenUser
                    password = regulaforensicsMavenPassword
                }
            }
        }
    }
}
