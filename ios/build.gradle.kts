setupMultiplatform(BuildTarget.Ios)

plugins {
    id("com.chromaticnoise.multiplatform-swiftpackage") version "2.0.3"
}

kotlin {
    ios {
        compilations.forEach {
            it.kotlinOptions.freeCompilerArgs += arrayOf("-linker-options", "-lsqlite3")
        }
        binaries.framework {
            baseName = "CykloneTemplate"
            isStatic = false
            transitiveExport = true
            linkerOpts.add("-lsqlite3")
            Modules.ios().forEach { export(project(it.path)) }
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                Modules.ios().forEach { projectApi(it) }
            }
        }
    }

    multiplatformSwiftPackage {
        buildConfiguration {
            when (val config = getProperty("BUILD_CONFIGURATION", "debug")) {
                "debug" -> debug()
                "release" -> release()
                else -> named(config)
            }
        }
        swiftToolsVersion("5.4")
        targetPlatforms {
            iOS { v("14") }
        }
        outputDirectory(File(rootProject.rootDir, ".artifacts"))
    }
}
