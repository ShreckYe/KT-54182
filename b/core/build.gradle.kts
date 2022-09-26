plugins {
    kotlin("multiplatform") version "1.7.10"
}

repositories {
    mavenCentral()
    mavenLocal()
}

group = "shreckye"

kotlin {
    js(IR) {
        browser()
    }
}
kotlin.sourceSets.getByName("commonMain").dependencies {
    //implementation(project(":a:core")) // works
    //implementation("shreckye:core:0.1.0") // works
    implementation("shreckye:a-core:0.1.0")
}
