# Employee Management API

A simple Spring Boot project that implements CRUD operations for employee records using Session factory.

## Features
- Create(Single data insert as well as Multiple data), Read, Update, Delete (CRUD) employees
- RESTful API with ResponseEntity for status messages
- MySQL database

## API Endpoints
- `GET /employees/allData` - List all employees details.
- `GET /employees/{id}` - Get employee by ID
- `POST /employees/insert` - Add a new employee (returns "inserted successfully")
- `POST /employees/multiple` - Add  multiple data a single short - new employee (returns "multiple Employee Deatils are inserted")
- `PUT /employees/{id}` - Update employee by ID (returns "Employee Details Updated Successfully....")
- `DELETE /employees/{id}` - Delete employee by ID (returns "Employee Data Deleted Successfully Id:")

## Tech Stack
- Java, Spring Boot, MySQL, JPA, REST API and for testing purposes using Postman

## How to Run
1. Configure `application.properties` with your MySQL DB credentials
2. Run the project using your IDE or `mvn spr
