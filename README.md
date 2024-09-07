# Spring Boot REST API with Many-to-Many Mapping (MySQL)

This project is a REST API built with Spring Boot that demonstrates many-to-many relationships between entities using Spring JPA and MySQL. The API exposes endpoints to perform CRUD operations on entities with simple relationships.

## Features
- Many-to-many relationship between entities using `@ManyToMany` annotation
- CRUD operations for interacting with multiple related tables
- Integration with MySQL database
- Follows best practices for Spring Boot project structure

## Technologies Used
- **Spring Boot**: 2.5.x
- **Spring Data JPA**
- **MySQL**: Database for storing the data
- **Maven**: Build tool
- **Java**: 11 or higher
- **Postman** (optional): For testing the API

## Getting Started

### Prerequisites
- Java 11+
- Maven 3.x
- MySQL installed and running
- IDE (Eclipse, IntelliJ, etc.)

### Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/prathitkulkarni/Uni-REST-API.git

2. Set Up the MySQL Database
Create a database in MySQL (e.g., springboot_db).
Update the database configuration in src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/springboot_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

3. Build the Project Using Maven
mvn clean install

4. Run the Application
mvn spring-boot:run

5. Access the API
The REST API will be running at http://localhost:8080.


