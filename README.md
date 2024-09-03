# Employee Management System

This project is an Employee Management System built with Spring Boot, showcasing CRUD (Create, Read, Update, Delete) operations on an employee database. It provides a simple and efficient way to manage employee records using Spring Data JPA and a relational database like MySQL.

## Features

- **Create Employee**: Add new employee records with details such as name, department, position, and salary.
- **Read Employee**: View individual employee details or list all employees in the database.
- **Update Employee**: Edit existing employee information, such as updating their job title or department.
- **Delete Employee**: Remove employees from the database when they leave the organization.

## Technologies Used

- **Spring Boot**: For building the backend RESTful API.
- **MySQL/PostgreSQL/Other**: Used as the underlying database to store employee data.
- **Hibernate**: used by Spring Data JPA to map Java objects to database tables.
- **Lombak**:: Lombok is a Java library that automatically generates boilerplate code like getters, setters, constructors.
- **Postman**:Postman is a popular tool for testing RESTful API.
- **H2 Database**: H2 is an in-memory database primarily used for testing and development purposes.

## Getting Started

1. **Clone the Repository**: 
    ```bash
    git clone https://github.com/tanishqa11/EM-spring-boot-project.git
    ```


2. **Run the Application**: 
    ```bash
    mvn spring-boot:run
    ```

3. **Access the API**: The application runs on `http://localhost:8080`, and you can use tools like Postman to test the API endpoints.



## Contributing

Feel free to fork this repository and submit pull requests. If you find any issues or have suggestions, please open an issue.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
