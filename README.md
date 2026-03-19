# Microservice Discovery Assignment

## Overview
This project demonstrates Service discovery in a microservices architecture using Spring Boot and Eureka.

It includes:
- Eureka Server (Service Registry)
- Product Service (2 instances)
- Client Service (Service Consumer with discovery)

-----------------------------------------------------------------------------------------------------------------

## Architecture

Client Service calls Product Service via Eureka.

![alt text](image-2.png)

-----------------------------------------------------------------------------------------------------------------
## ⚙️ Technologies Used-

- Java 17
- Spring Boot 3.2.5
- Spring Cloud Eureka
- Spring Cloud LoadBalancer
- Maven
- VS Code / IntelliJ

-----------------------------------------------------------------------------------------------------------------
## 📂 Project Structure-

microservice-discovery-assignment/
├── eureka-server/
├── product-service/
├── client-service/
├── architecture-diagram.png
└── README.md

-----------------------------------------------------------------------------------------------------------------

## 🔧 Services Description

### 1. Eureka Server-
- Acts as **service registry**
- All services register here
- URL: `http://localhost:8761`

-----------------------------------------------------------------------------------------------------------------

### 2. Product Service-
- Provides API: `/product`
- Returns instance details (port number)
- Runs in **2 instances**:
  - Instance 1 → `http://localhost:8081`
  - Instance 2 → `http://localhost:8082`

-----------------------------------------------------------------------------------------------------------------

### 3. Client Service
- Provides API: `/fetch`
- Calls product-service using service discovery
- Runs on:
- `http://localhost:8080`

-----------------------------------------------------------------------------------------------------------------

## How to Run the Project

### Step 1: Start Eureka Server

```bash
cd eureka-server
mvn spring-boot:run

![alt text](image.png)

### Step 2: Start Product Service (2 Instances)

Run Instance 1:

![alt text](image-1.png)

Run Instance 2:

![alt text](image-3.png)

### Step 3: Start Client Service

![alt text](image-4.png)

-----------------------------------------------------------------------------------------------------------------
### Testing the Application-
Run http://localhost:8080/fetch

![alt text](image-5.png)

Refresh again-

![alt text](image-6.png)

Since, 2 instances are running, on refresh, you can see 2 services response.
You can check port numbers accordingly.

Again, check Eureka server, you can now see application (client-service) running as 1 and application (product-service) running as 2 since 2 instances are running.

![alt text](image-7.png)

### Key Concepts Demonstrated

1. Microservices Architecture
2. Service Discovery
3. Client-side Load Balancing
4. Decoupled Communication
5. Dynamic Service Resolution

### Observations

1. Services are registered automatically with Eureka
2. Client does not use fixed URLs
3. Requests are distributed across instances
4. System is scalable and fault-tolerant

### Author

1. Aishwarya Madhave
2. Course: Enterprise Distributed Systems
3. Semester: Spring 2026
