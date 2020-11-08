group = "com.musaabshirgar1"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

extra["springCloudVersion"] = "Hoxton.SR8"

dependencies {
   implementation("org.springframework.boot:spring-boot-starter-actuator")
   implementation("org.springframework.cloud:spring-cloud-starter-gateway")
   implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
   implementation("org.springframework.cloud:spring-cloud-starter-netflix-hystrix")
   implementation("org.springframework.cloud:spring-cloud-starter-config")
   testImplementation("org.springframework.boot:spring-boot-starter-test") {
      exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
   }
}

dependencyManagement {
   imports {
      mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
   }
}
