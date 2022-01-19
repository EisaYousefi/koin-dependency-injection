package dependencies

object Build {
    val build_tools = "com.android.tools.build:gradle:${Versions.gradle}"
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val koin_gradle_plugin = "io.insert-koin:koin-gradle-plugin:${Versions.koin}"
//    val junit5 = "de.mannodermaus.gradle.plugins:android-junit5:1.3.2.0"
}