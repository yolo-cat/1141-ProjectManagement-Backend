# GEMINI.md

## Project Overview

This is the backend for a full-stack web application for a course management system. It is a Spring Boot application that provides a REST API for managing students, teachers, courses, and enrollments.

**Key Technologies:**

*   **Backend:**
    *   Java 17
    *   Spring Boot
    *   Maven
    *   SQLite
    *   Spring Security (JWT)

## Building and Running

### Backend

To build and run the backend server, navigate to the `Backend` directory and use the following Maven command:

```bash
./mvnw spring-boot:run
```

This will start the application on the default port (usually 8080).

**API Endpoints:**

The backend exposes a REST API for managing students, teachers, courses, and enrollments. Key endpoints include:

*   `/api/students`
*   `/api/teachers`
*   `/api/courses`
*   `/api/enrollments`
*   `/auth/authenticate`
*   `/hello`

## Development Conventions

*   The backend follows a standard Spring Boot project structure, with controllers, services, repositories, and models.
*   It uses Lombok to reduce boilerplate code.
*   Authentication is handled via JSON Web Tokens (JWT).
*   Database connection details for the backend are stored in the `Backend/src/main/resources/application.properties` file.
