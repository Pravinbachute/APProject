plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.approject"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.approject"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.github.barteksc:android-pdf-viewer:3.1.0-beta.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}

//dependencies {
//
//    implementation("androidx.appcompat:appcompat:1.6.1")
//    implementation("com.google.android.material:material:1.11.0")
//    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
//    implementation("com.github.barteksc:android-pdf-viewer:3.1.0-beta.1")
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.test.ext:junit:1.1.5")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
//}

dependencies {
   implementation("com.google.firebase:firebase-database:20.3.1")
    implementation("com.github.barteksc:android-pdf-viewer:3.2.0-beta.1")
}

dependencies {
    // Import the BoM for the Firebase platform
   implementation(platform("com.google.firebase:firebase-bom:32.7.4"))

// Add the dependency for the Firebase Authentication library
    // When using the BoM, you don't specify versions in Firebase library dependencies
    implementation("com.google.firebase:firebase-auth")
}