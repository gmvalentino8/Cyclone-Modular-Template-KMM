setupMultiplatform()

plugins {
    id("kotlinx-serialization")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                project(Modules.Domain)
                project(Modules.Utils)
                implementation(Dependencies.Kotlinx.serializationJson)
                implementation(Dependencies.Kotlinx.dateTime)
                implementation(Dependencies.Kotlinx.coroutinesCore) {
                    version { strictly(Versions.kotlinCoroutines) }
                }
            }
        }

        commonTest {
            dependencies {
                project(Modules.Test)
            }
        }
    }
}
