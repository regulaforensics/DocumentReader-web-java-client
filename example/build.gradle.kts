plugins {
    java
    application
}


application {
    mainClass.set("com.regulaforensics.docreader.client.example.Main")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation(project(":client", "default"))
}