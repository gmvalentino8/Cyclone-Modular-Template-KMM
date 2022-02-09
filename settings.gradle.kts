rootProject.name = "Cyklone-Template"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://oss.sonatype.org/content/repositories/snapshots")
    }
}

include(":features:sample")
include(":application")
include(":utils")
include(":test-internal")
include(":domain")
include(":data")
include(":remote")
include(":local")
include(":ios")
