object Versions {
    const val androidMinSdk = 24
    const val androidCompileSdk = 30
    const val androidTargetSdk = androidCompileSdk
    const val kotlin = "1.5.31"
    const val gradle = "7.0.0-beta05"
    const val kotlinCoroutines = "1.5.2-native-mt"
    const val kotlinxDateTime = "0.3.1"
    const val kotlinxSerializationJson = "1.2.1"
    const val cyklone = "0.0.1"
    const val ktor = "1.6.5"
    const val sqlDelight = "1.5.3"
    const val multiplatformSettings = "0.8.1"
    const val androidxTest = "1.4.0"
    const val androidxJunit = "1.1.3"
    const val turbine = "0.7.0"
    const val kotest = "4.6.3"
    const val kotlinterGradle = "3.4.5"
    const val kermit = "1.0.0"
}

object Dependencies {
    object Gradle {
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val kotlinter = "org.jmailen.gradle:kotlinter-gradle:${Versions.kotlinterGradle}"
        const val sqlDelight = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"
    }

    object Kotlinx {
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
        const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.kotlinxDateTime}"
        const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinxSerializationJson}"
    }

    object Cyklone {
        const val core = "io.github.gmvalentino8:cyklone:${Versions.cyklone}"
        const val stateMachine = "io.github.gmvalentino8:cyklone-statemachine:${Versions.cyklone}"
    }

    object Ktor {
        const val serialization = "io.ktor:ktor-serialization:${Versions.ktor}"
        const val clientCore = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val clientJson = "io.ktor:ktor-client-json:${Versions.ktor}"
        const val clientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        const val clientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
        const val clientAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
        const val clientIos = "io.ktor:ktor-client-ios:${Versions.ktor}"
        const val clientMock = "io.ktor:ktor-client-mock:${Versions.ktor}"
    }

    object SqlDelight {
        const val runtime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
        const val coroutineExtensions = "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"
        const val androidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
        const val nativeDriver = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
        const val sqliteDriver = "com.squareup.sqldelight:sqlite-driver:${Versions.sqlDelight}"
    }

    object Settings {
        const val core = "com.russhwolf:multiplatform-settings:${Versions.multiplatformSettings}"
        const val test = "com.russhwolf:multiplatform-settings-test:${Versions.multiplatformSettings}"
    }

    object Logger {
        const val kermit = "co.touchlab:kermit:${Versions.kermit}"
    }

    object Test {
        const val androidxJunit = "androidx.test.ext:junit:${Versions.androidxJunit}"
        const val androidxTestRunner = "androidx.test:runner:${Versions.androidxTest}"
        const val androidxTestRules = "androidx.test:rules:${Versions.androidxTest}"
        const val turbine = "app.cash.turbine:turbine:${Versions.turbine}"
        const val kotest = "io.kotest:kotest-assertions-core:${Versions.kotest}"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"
    }
}
