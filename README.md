# kotlin-api-gateway

This project is a sample demonstration of how to develop a complete microservice architecture using Kotlin Lang. <br>

In this Project we are making use of the following tools and technologies:
  - Kotlin
  - Spring Cloud Eureka
  - Cloud Gateway
  - Hystrix
  - Cloud Config Server
  
## How To Start :eyes:
  - Download The Project
  ```terminal
    $ git clone https://github.com/musaabshirgar1/kotlin-api-gateway
  ```
  - Open up the project in IntelliJ Idea
  - Build The Gradle File
  - Now first run the eureka-service-registry by following the path shown below in IntelliJ Idea
  ```terminal
     $ cd kotlin-api-gateway\eureka-service-registry\src\main\kotlin\com\musaabshirgar1
  ```
  - Now run the EurekaServiceRegistryApplication.kt using the IntelliJ Idea User Interface
  - Follow the above step for other services in this sequential order:
    - cloud-config-server
    - cloud-gateway
    - hystrix-dashboard
    - order-service
    - payment-service
    
References: [Java Techie](https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ)
