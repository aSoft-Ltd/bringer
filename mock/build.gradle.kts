plugins {
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("tz.co.asoft.library")
}

kotlin {
    jvm { library() }
    js(IR) { library() }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(libs.bringer.api)
            }
        }

        val commonTest by getting {
            dependencies {
                api(libs.koncurrent.later.test)
                api(libs.kommander.coroutines)
            }
        }
    }
}