setupMultiplatform()

plugins {
    id("kotlinx-serialization")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                project(Modules.Application)
                project(Modules.Data)
                implementation(Dependencies.Kotlinx.coroutinesCore) {
                    version { strictly(Versions.kotlinCoroutines) }
                }
                implementation(Dependencies.Kotlinx.dateTime)
                implementation(Dependencies.Ktor.clientCore)
                implementation(Dependencies.Ktor.clientJson)
                implementation(Dependencies.Ktor.clientLogging)
                implementation(Dependencies.Ktor.clientSerialization)
            }
        }

        commonTest {
            dependencies {
                project(Modules.Test)
            }
        }

        androidMain {
            dependencies {
                implementation(Dependencies.Ktor.clientAndroid)
            }
        }

        iosMain {
            dependencies {
                implementation(Dependencies.Ktor.clientIos)
            }
        }
    }
}
