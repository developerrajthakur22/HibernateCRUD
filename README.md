# HibernateCRUD

# Praticing Hibernate

> This is a Java project that demonstrates basic CRUD operations using Hibernate and JPA (Jakarta Persistence API).

## Project Description

The project performs CRUD operations on the "Scholers" entity, allowing users to create, read, update, and delete Scholers records. The application interacts with a database using Hibernate as the ORM (Object-Relational Mapping) framework.

## Requirements

- Java Development Kit (JDK)
- Maven
- Your preferred Java IDE
- Database (e.g., MySQL, PostgreSQL, etc.)

## Setup and Configuration

1. Clone the repository:

   ```shell
   git clone https://github.com/developerrajthakur22/HibernateCRUD 
   ```
   
2. Configure the database connection in the persistence.xml file:

<!-- Update the following properties with your database connection details -->
<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/db_name"/>
<property name="javax.persistence.jdbc.user" value="username"/>
<property name="javax.persistence.jdbc.password" value="password"/>

3. Build the project:

cd praticing-hibernate/
mvn clean install

## Usage
To run the project, execute the following command:
java -jar target/praticing-hibernate.jar

The application will prompt you to enter an operation (create/read/update/delete). Follow the on-screen instructions to perform the desired CRUD operation on the Scholers entity.

## Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.
