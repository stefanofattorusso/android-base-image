object ApplicationId {
    const val id = "com.stefattorusso.baseimage"
}

object Modules {
    const val app = ":app"
    const val core = ":core"
    const val common = ":common"
    const val featureHome = ":features:home"
    const val featureGrid = ":features:grid"
    const val dataLocal = ":data:local"
    const val dataModel = ":data:model"
    const val dataRemote = ":data:remote"
    const val dataRepository = ":data:repository"
    const val navigation = ":navigation"
    const val domain = ":domain"
}

object Releases {
    const val versionCode = 1
    const val versionName = "1.0"
}

object Versions {
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29
    const val androidJunit = "1.1.0"
    const val androidTestRunner = "1.1.2-alpha02"
    const val appCompat = "1.1.0"
    const val archCoreTest = "2.0.0"
    const val constraintLayout = "1.1.3"
    const val coreKtx = "1.1.0-alpha04"
    const val coroutines = "1.1.1"
    const val dagger = "2.24"
    const val databinding = "3.3.2"
    const val espressoCore = "3.2.0-alpha02"
    const val fragmentTest = "1.1.0-alpha06"
    const val glide = "4.9.0"
    const val gradle = "3.5.2"
    const val gson = "2.8.5"
    const val junit = "4.12"
    const val kotlin = "1.3.50"
    const val lifecycle = "2.1.0-alpha04"
    const val lifecycleRuntime = "2.2.0-alpha01"
    const val mockk = "1.9.2"
    const val mockwebserver = "2.7.5"
    const val navigation = "2.1.0"
    const val okHttp = "3.12.1"
    const val recyclerview = "1.0.0"
    const val retrofit = "2.6.2"
    const val retrofitGson = "2.4.0"
    const val room = "2.1.0-alpha06"
    const val timber = "4.7.1"
}

object Libraries {
    // ROOM
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomRunTime = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    // RETROFIT
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val httpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    // GLIDE
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    // DAGGER
    const val runtime = "com.google.dagger:dagger:${Versions.dagger}"
    const val android_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val android_support_compiler = "com.google.dagger:dagger-android-processor:${Versions.dagger}"

}

object KotlinLibraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlinCoroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
}

object AndroidLibraries {
    // KOTLIN
    const val kotlinCoroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    // ANDROID
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
}

object TestLibraries {
    // ANDROID TEST
    const val androidTestRunner = "androidx.test:runner:${Versions.androidTestRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espressoCore}"
    const val archCoreTest = "androidx.arch.core:core-testing:${Versions.archCoreTest}"
    const val junit = "androidx.test.ext:junit:${Versions.androidJunit}"
    const val fragmentNav = "androidx.fragment:fragment-testing:${Versions.fragmentTest}"
    // MOCK WEBSERVER
    const val mockWebServer = "com.squareup.okhttp:mockwebserver:${Versions.mockwebserver}"
    // MOCK
    const val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    // COROUTINE
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    // DATA BINDING
    const val databinding = "androidx.databinding:databinding-compiler:${Versions.databinding}"
}