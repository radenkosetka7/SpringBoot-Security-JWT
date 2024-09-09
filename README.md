This project demonstrates how to implement a full authentication and authorization system using JWT tokens in a Spring Boot 3.0 application with Spring Security 6.0. 
The system includes:
•	JWT-based Authentication: Users can register and log in to obtain JWT tokens.
•	Change Password: Implemented functionality for changing user passwords.
•	Token Retrieval: Secure retrieval of JWT tokens.
•	Custom Logout Handler: Logout process is customized to revoke tokens or perform specific actions.
•	HTTPS Configuration: All endpoints are secured with HTTPS for encrypted communication.
•	OpenAPI Integration: The project is integrated with OpenAPI to provide documentation and easy testing of API endpoints.

Features
•	User registration and login
•	JWT token issuance and validation
•	Password change functionality
•	Custom token invalidation and logout
•	HTTPS for secure communication
•	API documentation through OpenAPI

Getting Started
Prerequisites
•	Java 17+
•	Maven or Gradle

Running the Project
1.	Clone the repository
2.	Configure the application properties (e.g., database, security keys, etc.)
3.	Build and run the project using mvn spring-boot:run or the corresponding Gradle command.

