import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.jvm.tasks.Jar
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.maven
import org.gradle.kotlin.dsl.withType
import org.gradle.plugins.signing.SigningExtension

fun Project.setupMavenPublication() {
    plugins.apply("maven-publish")

    extensions.getByType<PublishingExtension>().run {
        repositories {
            maven("${rootProject.rootDir}/artifacts/maven")
        }
    }
}
