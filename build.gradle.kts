plugins {
    val kotlinVersion: String by System.getProperties()
    kotlin("js") version kotlinVersion
    kotlin("plugin.serialization") version "1.4.0"
}

repositories {
    mavenCentral()
    jcenter()
    maven { url = uri("https://dl.bintray.com/rjaros/kotlin") }
    mavenLocal()
}

kotlin {
    js {
        browser {
        }
    }
    sourceSets["main"].dependencies {
        implementation("pl.treksoft:kt41282-lib:0.0.1")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.3.9")
    }
}
