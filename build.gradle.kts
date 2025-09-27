plugins {
  kotlin("jvm") version "2.1.20"
  id("org.jlleitschuh.gradle.ktlint") version "13.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}
kotlin {
  jvmToolchain(21)
}
