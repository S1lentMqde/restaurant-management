# Restaurant Order Management System

Backend application for restaurant order management.

## Technologies

- Java 17
- Spring Boot 3
- PostgreSQL
- Spring Data JPA
- Spring Validation
- Gradle
- JUnit 5
- Mockito

## Features

- Customer management
- Menu management
- Order management
- Order item management
- Order status update
- Order total calculation
- Request validation

## API Endpoints

### Customers

POST /customers

GET /customers

### Menu Items

POST /menu-items

GET /menu-items

### Orders

POST /orders

GET /orders

PUT /orders/{id}/status

GET /orders/{id}/total

### Order Items

POST /order-items

GET /order-items