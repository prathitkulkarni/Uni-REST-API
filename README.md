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

1. **Clone the repository**
   ```bash
   git clone https://github.com/prathitkulkarni/Uni-REST-API.git
   ```
2. **Navigate to the Project Directory**
    ```bash
    cd your-repository-name
    ```
3. **Configure MySQL Database**
    - Create a new database in MySQL.
    - Update the `application.properties` file in `src/main/resources` with your database details:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
      spring.datasource.username=your_database_username
      spring.datasource.password=your_database_password
      spring.jpa.hibernate.ddl-auto=update
      ```
4. **Build the Project**
    ```bash
    mvn clean install
    ```
5. **Run the Application**
    ```bash
    mvn spring-boot:run
    ```
6. **Access the API**
    - **Retrieve all entities**: `GET /api/entities`
    - **Create a new entity**: `POST /api/entities`
    - **Update an entity by ID**: `PUT /api/entities/{id}`
    - **Delete an entity by ID**: `DELETE /api/entities/{id}`
  
## Example JSON Data

For Professor
```json 
{
        "name": "FirstName LastName",
        "courses": [
            {
                "courseid": 4
            },
            {
                "courseid": 7
            }
        ]
}
```
For Course
```json 
{
    "name": "Data Science for Big Data Analytics"
}


