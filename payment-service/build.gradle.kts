extra["springCloudVersion"] = "Hoxton.SR6"

group = "com.musaabshirgar1"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

configurations {
   compileOnly {
      extendsFrom(configurations.annotationProcessor.get())
   }
}

dependencies {
   implementation("org.springframework.boot:spring-boot-starter-data-jpa")
   implementation("org.springframework.boot:spring-boot-starter-jdbc")
   implementation("org.springframework.boot:spring-boot-starter-web")
   implementation("org.springframework.boot:spring-boot-starter-webflux")
   implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
   implementation("org.springframework.cloud:spring-cloud-starter-config")
   implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
   implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
   compileOnly("org.projectlombok:lombok")
   runtimeOnly("com.h2database:h2")
   annotationProcessor("org.projectlombok:lombok")
   testImplementation("org.springframework.boot:spring-boot-starter-test") {
      exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
   }
   testImplementation("io.projectreactor:reactor-test")
}

dependencyManagement {
   imports {
      mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
   }
}