# User management System

This project is designed to take input data such as ID, name, username, address, and phone number to create a User data.

## Frameworks and Language Used

The following frameworks and languages were used in the development of this project:

- Java
- Spring Boot

## Data Flow

The following functions were used in this project:

1. Controller - This component is responsible for handling the incoming requests and processing them.
2. Entity - This component provides object handles of the application.
 

## Data Structure

The following data structures were used in this project:

- ArrayList

## brief description of each of the components in the context of the code:

### Controller
The controller is responsible for handling incoming requests and returning appropriate responses. In the code, it have a UserController which handles requests related to the user entity. It has methods such as createUser, getUser, getAllUsers, updateUser, and deleteUser. These methods use the UserService to perform CRUD (create, read, update, delete) operations on the user data.


### Entity
In the code, i have created a module named User which contains the User entity class. This class represents the data model of the user and contains properties such as id, name, username, address, and phoneNumber.

Overall, these components work together to create a layered architecture for your project, which separates concerns and promotes modularity and maintainability.

## Project Summary

The aim of this project is to create a system that can take input data and use it to create a project. The system is built using Java and Spring Boot.The data flow is handled by the Controller, Services, and Repository components, with the Database Design being responsible for the schema. The project also makes use of arrayslists to store and manipulate data.
