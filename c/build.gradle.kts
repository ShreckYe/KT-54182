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
    implementation(project(":b:core"))
}
