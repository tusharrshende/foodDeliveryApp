# **Food Delivery Platform API**

## Overview

The Food Delivery Platform API is a web service designed to manage food items, orders, and user authentication. It provides a platform for both users and administrators to interact with the system. This README file contains essential information about the project, including frameworks, data flow, data structures, and a project summary.

### Frameworks and Language Used

- Language: Java
- Frameworks: Spring Boot
- Libraries: Java Persistence API (JPA), Java Mail API (for email functionality)

### Data Flow

#### Controller

- `AdminController`: Handles administrative operations, including adding, updating, retrieving, and removing food items. It also provides access to all orders.

- `UserController`: Manages user-related operations such as user registration, authentication, and sign-out. Users can also view food items and create orders.

#### Services

- `FoodItemService`: Manages food items, including CRUD operations (Create, Read, Update, Delete).

- `OrderService`: Handles order-related operations, such as creating and canceling orders.

- `UserService`: Manages user registration, authentication, and sign-out. It also encrypts and stores user passwords securely.

- `AuthenticationService`: Manages authentication tokens, creating and deleting them.

#### Repository

- `IFoodItemRepo`: JPA repository for food items, used for database operations related to food items.

- `IOrderRepo`: JPA repository for orders, used for database operations related to orders.

- `IUserRepo`: JPA repository for user data, used for database operations related to users.

- `IAuthenticationRepo`: JPA repository for authentication tokens.

- `IAdminRepo`: JPA repository for admin data.

#### Database Design

The database schema includes tables for food items, orders, users, authentication tokens, and admin data. Relationships between entities are defined to maintain data integrity.

### Data Structure Used in Your Project

- Lists, arrays, and maps are used to handle and store data efficiently within the codebase.

### Project Summary

The Food Delivery Platform API offers the following features:

- User registration and authentication.
- CRUD operations for food items.
- Creating and canceling food orders.
- Secure password encryption using the MD5 hashing algorithm.
- Authentication tokens sent via email for secure access.
- Admin operations for managing food items and orders.

The project aims to provide a secure and efficient platform for managing food delivery services, both for users and administrators. It incorporates various Spring Boot features to create a robust and scalable API for food delivery.

---
