plugins {
    alias(libs.plugins.android.application)
}

android {

    namespace = "kasireddymahendrareddy.com.kasireddymahendrareddy"
    compileSdk = 37

    defaultConfig {
        applicationId = "kasireddymahendrareddy.com.kasireddymahendrareddy"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
}