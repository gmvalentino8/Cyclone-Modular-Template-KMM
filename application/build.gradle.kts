setupMultiplatform()

kotlin {
    sourceSets {
        commonTest {
            dependencies {
                project(Modules.Test)
            }
        }
    }
}
