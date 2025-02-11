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
