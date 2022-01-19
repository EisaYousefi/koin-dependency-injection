package dependencies

object Dependencies {
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    val lifecycle_viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    val lifecycle_livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    val activity_ktx = "androidx.activity:activity-ktx:${Versions.activity_ktx}"
    val koin_android = "io.insert-koin:koin-android:${Versions.koin}"
    val kotlin_coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinx_coroutines_core}"
    val kotlin_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinx_coroutines_android}"
    val kotlin_standard_library = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    val room_runtime = "androidx.room:room-runtime:${Versions.room}"
    val room_ktx = "androidx.room:room-ktx:${Versions.room}"
    val room_kapt = "androidx.room:room-compiler:${Versions.room}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofit_converter_moshi = "com.squareup.retrofit2:converter-moshi:${Versions.converter_moshi}"
    val retrofit_moshi_kotlin = "com.squareup.moshi:moshi-kotlin:${Versions.moshi_kotlin}"
    val retrofit_okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    val retrofit_logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor}"
}