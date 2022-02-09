setupMultiplatform()

plugins {
    id("com.squareup.sqldelight")
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
                implementation(Dependencies.SqlDelight.runtime)
                implementation(Dependencies.SqlDelight.coroutineExtensions)
                implementation(Dependencies.Settings.core)
            }
        }

        androidMain {
            dependencies {
                implementation(Dependencies.SqlDelight.androidDriver)
            }
        }

        iosMain {
            dependencies {
                implementation(Dependencies.SqlDelight.nativeDriver)
            }
        }
    }
}

sqldelight {
    database("UserDatabase") {
        packageName = "io.github.gmvalentino8.local.db"
        dialect = "sqlite:3.25"
    }
}
