## Auth Microservice
# Introduction:
This repository contains a Spring-based microservice architecture with the following services:
- Config Server: Manages centralized configuration for all services.
- Gateway: Acts as an API gateway with load balancing to route requests to the appropriate microservices.
- User Service: A service responsible for managing user data, including security features such as authentication and authorization.
- Product Service: Handles operations related to product data.
- Eureka: Service discovery for registering and discovering microservices.
- Zipkin: Distributed tracing to monitor and troubleshoot requests as they flow through the microservices.
- Load Balancer: Ensures high availability by distributing traffic between multiple instances of the gateway.
- Docker Compose: Simplifies deployment and management of the microservices along with their dependencies.
- PostgreSQL: A relational database used for storing service data.

# Features:
- Microservices Architecture: The application is built using a microservices architecture to ensure modularity, scalability, and ease of maintenance. It consists of multiple independent services that interact through well-defined APIs.
- Centralized Configuration with Spring Cloud Config: The Config Server provides centralized configuration management, allowing dynamic configuration updates across all microservices.
- API Gateway with Load Balancing: The Gateway service acts as a reverse proxy for routing client requests to the appropriate microservices, providing load balancing and ensuring high availability.
- Service Discovery with Eureka: The integration of Eureka enables dynamic service discovery, allowing microservices to register themselves and discover other services without hardcoding URLs.
- Distributed Tracing with Zipkin: Zipkin is used to trace requests as they travel through various microservices, providing valuable insights into the system's performance and facilitating debugging and monitoring.
- User Service Security: The User Service is secured using Spring Security, implementing authentication and authorization mechanisms to protect sensitive data and ensure that only authorized users can access certain resources.
- PostgreSQL Database Integration: The application uses PostgreSQL as a relational database to store and manage service data, ensuring data consistency and integrity across microservices.
- Docker Compose for Simplified Deployment: Docker Compose is used to manage the deployment and orchestration of the microservices, making it easy to set up and run the entire system in a local or production environment.
- Scalable and Resilient System Design: The architecture is designed with scalability and resilience in mind, allowing easy horizontal scaling and ensuring fault tolerance through redundant services.
- Comprehensive Service Monitoring and Logging: The system is equipped with tools for monitoring, logging, and tracing, ensuring transparency and making it easier to diagnose and resolve issues in production environments.

## Dependencies:
- Spring Boot: The core framework for building microservices in Java, providing essential features like embedded servers, auto-configuration, and production-ready capabilities.
- Spring Cloud Config: Centralized configuration management that allows for externalized configuration across microservices.
- Spring Cloud Gateway: A non-blocking API gateway used for routing requests, load balancing, and handling security.
- Spring Cloud Eureka: Service discovery for registering and discovering microservices, enabling dynamic service resolution.
- Spring Cloud Zipkin: Distributed tracing solution to monitor and troubleshoot requests as they travel through various microservices.
- Spring Security: A comprehensive security framework for authenticating and authorizing requests, securing APIs, and protecting sensitive data in the User Service.
- Spring Data JPA: Simplifies data access using JPA (Java Persistence API) to interact with relational databases, such as PostgreSQL.
- PostgreSQL: A robust, open-source relational database system used to store data in a transactional manner.
- Docker: Platform for building and running containers, enabling easy deployment of microservices with Docker Compose.
- Docker Compose: A tool for defining and running multi-container Docker applications, used to orchestrate microservices and their dependencies.
- Lombok: A Java library used to reduce boilerplate code by generating getters, setters, constructors, and other commonly used methods at compile-time.
- Spring Boot DevTools: Provides development-time features like automatic restarts, live reload, and enhanced debugging support.
- Spring Boot Actuator: Adds production-ready features to Spring Boot applications, such as health checks, metrics, and monitoring endpoints.
  
## Getting Started
pull clone git url project
run mvn dependencies
run project


