plugins {
    kotlin("multiplatform") version "1.7.10"
    `maven-publish`
}

repositories {
    mavenCentral()
}

group = "shreckye"
version = "0.1.0"

kotlin {
    js(IR) {
        browser()
    }
}

// works if this is commented out
publishing.publications.withType<MavenPublication> {
    artifactId = "a-$artifactId"
}
