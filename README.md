# Sharwa Web Application

This is a FullStack E-commerce Web Application built with a Java Spring back-end and an Angular 18 front-end. The application allows users to create, like, and comment on blog posts in real-time.

## Features

- **Product Management**: Create, view, and search posts.


## Tech Stack

### Back-end
- **Java Spring Boot**: Handles REST APIs.
- **Lombok**: Simplifies code with annotations.
- **SQL Driver**: Manages database connectivity.
- **JPA Repository**: Manages database operations.

### Front-end
- **Angular 18**
  - **Products Components**


## Project Structure

### Back-end
- **Controller**: Manages request routing.
- **Service**: Contains core business logic.
- **Service Implementation**: Implements the service interface for each API.

### Front-end
- **Angular Components**: Organized by feature for easy maintenance and scalability.

## Getting Started

### Prerequisites
- **Java JDK 17** (or higher)
- **Node.js 20** (for the Angular front-end)
- **SQL Database** (compatible with your SQL Driver setup)

### Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/MohammedSamerr/Sharwa-Store.git
    cd Sharwa-Store
    ```

2. **Set up the back-end**:
    - Configure the database in `application.properties`.
    - Run the Spring Boot application:
      ```bash
      ./mvnw spring-boot:run
      ```

3. **Set up the front-end**:
    - Navigate to the Angular project directory:
      ```bash
      cd frontend
      ```
    - Install dependencies:
      ```bash
      npm install
      ```
    - Start the Angular application:
      ```bash
      ng serve
      ```

4. **Access the Application**:
   - Open your browser and go to `http://localhost:4200`.


## Dependencies

- **Back-end**: Rest Repository, Lombok, SQL Driver, JPA Repository.
- **Front-end**: Angular 18, Angular Material (optional if used for UI styling).

## Contributing

Feel free to contribute to this project by opening issues or submitting pull requests.


