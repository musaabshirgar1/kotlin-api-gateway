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
  - Build The Project
  ```terminal
    $ ./gradlew clean build
  ```
  - Create local docker images of all the services. For Instance, to create a local docker image for order-service do the following:
  ```terminal
    $ cd kotlin-api-gateway/order-service //Follow the path
    $ docker build -t order-service . //Open Docker and run the following command
  ```
  - Follow the above step for all the services
  - Finally run the following command from the root folder:
  ```terminal
    $ docker-compose up
  ```
References: [Java Techie](https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ)
