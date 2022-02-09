setupMultiplatform()

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                project(Modules.Domain)
                project(Modules.Utils)
                implementation(Dependencies.Cyklone.core)
                implementation(Dependencies.Cyklone.stateMachine)
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
