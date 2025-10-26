# Calculator Spring Project

A simple Spring Boot application that performs basic calculator operations (add, subtract, divide) and keeps a history of operations.

## Features

- Add, subtract, and divide numbers
- Store operations in memory
- Retrieve all operations or filter by ID or type

## Project Structure

calculatorspring/
├── src/
│ ├── main/
│ │ ├── java/com/horizon/calculatorspring
│ │ │ ├── CalculatorspringApplication.java
│ │ │ ├── controller/CalculatorController.java
│ │ │ ├── model/Operation.java
│ │ │ ├── repository/OperationRepository.java
│ │ │ └── service/CalculatorService.java
│ │ └── resources/application.properties
├── pom.xml
└── README.md
The application will run on http://localhost:8080
.

API Endpoints
Method	URL	Description
GET	/calculator/history	Returns all operations
GET	/calculator/history/{id}	Returns operation by ID
GET	/calculator/history/type/{type}	Returns operations by type
POST	/calculator/add?a={a}&b={b}	Adds two numbers
POST	/calculator/subtract?a={a}&b={b}	Subtracts b from a
POST	/calculator/divide?a={a}&b={b}	Divides a by b
