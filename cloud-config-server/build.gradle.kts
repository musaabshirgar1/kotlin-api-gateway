extra["springCloudVersion"] = "Hoxton.SR8"

group = "com.musaabshirgar1"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

dependencies {
   implementation("org.springframework.cloud:spring-cloud-config-server")
   implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
   testImplementation("org.springframework.boot:spring-boot-starter-test") {
      exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
   }
}

dependencyManagement {
   imports {
      mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
   }
}