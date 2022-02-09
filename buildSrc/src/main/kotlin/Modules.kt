import org.gradle.api.artifacts.Dependency
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

enum class Modules(val path: String) {
    Test(":test-internal"),
    Utils(":utils"),
    Application(":application"),
    Domain(":domain"),
    Data(":data"),
    Remote(":remote"),
    Local(":local"),
    Sample(":features:sample"),
    ;
}

fun KotlinDependencyHandler.project(module: Modules): Dependency? = implementation(project(module.path))
fun KotlinDependencyHandler.projectApi(module: Modules): Dependency? = api(project(module.path))
