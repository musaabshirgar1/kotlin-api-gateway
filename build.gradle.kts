import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
   id("org.springframework.boot") version "2.3.2.RELEASE" apply false
   id("io.spring.dependency-management") version "1.0.9.RELEASE" apply false
   kotlin("jvm") version "1.3.72" apply false
   kotlin("plugin.spring") version "1.3.72" apply false
}

subprojects {
   apply {
      plugin("io.spring.dependency-management")
      plugin("org.springframework.boot")
      plugin("org.jetbrains.kotlin.jvm")
      plugin("org.jetbrains.kotlin.plugin.spring")
   }

   group = "com.musaabshirgar1"
   version = "1.0-SNAPSHOT"

   val implementation by configurations

   repositories {
      mavenCentral()
   }
   dependencies {
      implementation("org.jetbrains.kotlin:kotlin-reflect")
      implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
      implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
   }

   tasks.withType<Test> {
      useJUnitPlatform()
   }

   tasks.withType<KotlinCompile> {
      kotlinOptions {
         freeCompilerArgs = listOf("-Xjsr305=strict")
         jvmTarget = "1.8"
      }
   }
}

