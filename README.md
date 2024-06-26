# Java Authentication Server

## Overview
This project is a Java-based authentication server that supports multiple clients logging in, managing user profiles, administrative controls, and a block list for enhanced security.

## Features
- **User Authentication**:
  - Secure login with session management.
  - Passwords stored using bcrypt encryption.
  
- **Profile Management**:
  - Users can view and update their profile information.
  
- **Admin Controls**:
  - Admin login with a separate interface.
  - User management (create, update, delete, view).
  - View and manage login logs.
  
- **Block List**:
  - Automatic blocking after multiple failed login attempts.
  - Admins can manually add or remove users from the block list.
  
- **Data Storage**:
  - User profiles and encrypted passwords stored in CSV files.
  - Configuration files in JSON/XML format for server settings.

- **Security**:
  - Strong encryption for password storage.
  - Password policies enforcing minimum strength requirements.
  - Optional two-factor authentication.
  
- **Logging and Monitoring**:
  - Logs for user activities, login attempts, and server errors.
  - Real-time monitoring capabilities.

## Architecture
- **Client-Server Model**:
  - Multiple clients can connect and interact with the server through RESTful API endpoints.
  
- **Layers**:
  - **Controller Layer**: Handles incoming requests and sends appropriate responses.
  - **Service Layer**: Contains business logic for authentication and profile management.
  - **Data Access Layer**: Manages interactions with CSV files for storing and retrieving data.

## Tools and Technologies
- **Java**: Core programming language for the entire project.
- **BCrypt**: For password encryption.
- **JUnit/TestNG**: For testing.
- **Log4j**: For logging.
- **OpenCSV**: For reading and writing CSV files.

## Installation and Setup
1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/authentication-server.git
    cd authentication-server
    ```

2. **Configure the Files**:
    - Ensure the necessary CSV files for users, admins, and block list are present in the `data` directory.
    - Update configuration settings in the `config.properties` file if necessary.

3. **Build the Project**:
    ```sh
    javac -cp ".:lib/*" src/*.java -d bin
    ```

4. **Run the Application**:
    ```sh
    java -cp ".:lib/*:bin" Main
    ```

## Usage
- **API Endpoints**:
  - `/login`: User login endpoint.
  - `/logout`: User logout endpoint.
  - `/profile`: Endpoint for viewing and updating user profiles.
  - `/admin/*`: Admin-specific endpoints for user and block list management.

## Contributing
1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes and push the branch.
4. Create a Pull Request describing your changes.

## Contact
For questions or issues, please contact [tamerlandrufatov@gmail.com](mailto:tamerlandrufatov@gmail.com).
