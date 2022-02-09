setupMultiplatform()

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("kotlin-parcelize")
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                project(Modules.Utils)
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
