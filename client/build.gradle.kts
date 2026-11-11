plugins {
    java
    id("com.github.sherter.google-java-format") version "0.9"
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withSourcesJar()
}

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/generated")
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:3.14.7")
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("io.gsonfire:gson-fire:1.8.4")
    implementation("org.threeten:threetenbp:1.7.0")
    implementation("io.swagger:swagger-annotations:1.5.24")
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("org.springframework:spring-beans:5.3.20")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.withType<Test> {
    useJUnitPlatform()
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
    val bunnyCreds = (project.findProperty("BunnyCdn") as? String) ?: ""

    val type = when {
        version.toString().contains("beta", ignoreCase = true) -> "Beta"
        version.toString().contains("nightly", ignoreCase = true) -> "Nightly"
        version.toString().contains("rc", ignoreCase = true) -> "RC"
        else -> ""
    }

    val finalUrl = uri("sftp://maven-master.regulaforensics.com:22/RegulaDocumentReaderWebClient/$type")

    publishing {
        publications {
            create<MavenPublication>("client") {
                artifactId = "webclient"
                version = project.version.toString().split('-')[0]

                from(components["java"])
            }
        }

        repositories {
            maven {
                name = "regulaforensics"
                url = finalUrl
                credentials {
                    username = regulaforensicsMavenUser
                    password = regulaforensicsMavenPassword
                }
            }

            maven {
                name = "BunnyCDN"
                url =
                    uri("https://storage.bunnycdn.com/maven-production-regulaforensics-sz/RegulaDocumentReaderWebClient/$type/")

                credentials(HttpHeaderCredentials::class) {
                    name = "AccessKey"
                    value = bunnyCreds
                }

                authentication {
                    create<HttpHeaderAuthentication>("header")
                }
            }
        }
    }

    tasks.register("runMavenClean") {
        val typeParam = (project.findProperty("type") as? String) ?: ""
        val regulaforensicsMavenPassword: String by project
        val regulaforensicsMavenUser: String by project
        val bunnyCreds = (project.findProperty("BunnyCdn") as? String) ?: ""

        val scriptDir = project.rootProject.file("scripts")

        doLast {
            if (typeParam.isNotEmpty() &&
                regulaforensicsMavenUser.isNotEmpty() &&
                regulaforensicsMavenPassword.isNotEmpty() &&
                bunnyCreds.isNotEmpty()
            ) {
                println("Conditions met, executing maven_clean.sh")

                project.exec {
                    workingDir = scriptDir
                    commandLine(
                        "bash",
                        "maven_clean.sh",
                        typeParam,
                        regulaforensicsMavenUser,
                        regulaforensicsMavenPassword,
                        bunnyCreds
                    )
                }

            } else {
                println("Skipping execution: Some parameters are missing.")
            }
        }
    }
}
