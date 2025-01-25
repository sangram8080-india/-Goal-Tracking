# Spring Boot Backend Application

## Overview
This project is a Spring Boot backend application designed for user onboarding. It provides RESTful APIs for user registration, authentication, and password reset functionality. The application uses an H2 in-memory database and Spring Security for authentication and authorization.

## Features
1. **APIs:**
   - **Sign Up:** Endpoint for user registration.
   - **Sign In:** Endpoint for user authentication.
   - **Forgot Password:** Mock functionality for password reset.

2. **Database:**
   - Utilizes an H2 in-memory database to store user details.

3. **Code Quality:**
   - Includes unit tests for all APIs.
   - Follows clean coding practices with modular structure and comprehensive error handling.

4. **Documentation:**
   - Instructions for running the application and testing the APIs.

---

## Prerequisites

Ensure you have the following installed on your machine:
- [Java 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven 3.8+](https://maven.apache.org/download.cgi)
- [Postman](https://www.postman.com/downloads/) (for API testing)

---

## How to Run the Application

### Step 1: Clone the Repository
```bash
git clone <repository-url>
cd <repository-folder>
```

### Step 2: Build the Project
```bash
mvn clean install
```

### Step 3: Run the Application
```bash
mvn spring-boot:run
```
The application will start on `http://localhost:8080`.

### Step 4: Access H2 Database Console (Optional)
Visit `http://localhost:8080/h2-console`.
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** (leave blank)

---

## API Endpoints

### Base URL
```
http://localhost:8080/api/v1
```

### 1. **Sign Up**
**Endpoint:** `POST /auth/signup`
- **Description:** Register a new user.
- **Request Body:**
```json
{
  "username": "johndoe",
  "email": "johndoe@gmail.com",
  "password": "password123"
}
```
- **Response:**
```json
{
  "message": "User registered successfully."
}
```

### 2. **Sign In**
**Endpoint:** `POST /auth/signin`
- **Description:** Authenticate a user.
- **Request Body:**
```json
{
  "username": "johndoe",
  "password": "password123"
}
```
- **Response:**
```json
{
  "token": "<JWT-token>"
}
```

### 3. **Forgot Password**
**Endpoint:** `POST /auth/forgot-password`
- **Description:** Mock password reset functionality.
- **Request Body:**
```json
{
  "email": "johndoe@gmail.com"
}
```
- **Response:**
```json
{
  "message": "Password reset instructions sent to your email."
}
```

---

## Testing the APIs

1. **Import Postman Collection:**
   - Create a new Postman collection with the above API endpoints.
   - Use the `application/json` content type for requests.

2. **Run Tests:**
   - Test user registration with the `Sign Up` endpoint.
   - Authenticate with the `Sign In` endpoint and retrieve a JWT token.
   - Simulate a password reset with the `Forgot Password` endpoint.

---

## Unit Testing

Run unit tests with the following command:
```bash
mvn test
```
The tests cover all API functionalities and edge cases to ensure robust application behavior.

---

## Contact
If you have any questions or need assistance, please contact:
- **Email:**sangramgkp2020@gmail.com

