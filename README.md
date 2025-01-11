# Authentication and Authorization Server Project

## Project Overview

This project implements a system that manages **authentication** and **authorization** for users, structured as a server-client application. The system uses a microservices architecture to enable secure communication between its components. At the core is a **Security Server** responsible for handling user logins, permissions, and maintaining audit logs for tracking security-related events.

## Key Concepts

- **Authentication**: Verifies user identity by checking their username and password.
- **Authorization**: Determines if a logged-in user has permission to perform a certain action.
- **Audit Log**: Records significant security events like failed logins and configuration changes for monitoring and troubleshooting.

## Functionality

The system consists of a **server** that processes backend logic and a **CLI client** for user interaction. It supports concurrent connections, making it scalable for real-world applications.

### User Types

1. **Unauthenticated Users**: Users who have not logged in.
2. **Authenticated Users**: Users who have successfully logged in.
3. **Admin Users**: Special authenticated users with elevated privileges.

### Command Types

#### Unsecured Commands

Commands that do not require a session ID and can be used without logging in.

- **Register**:
  ```bash
  register --username <username> --password <password> --first-name <firstName> --last-name <lastName> --email <email>
  ```
  Registers a new user and logs them in upon success.

- **Login**:
  ```bash
  login --username <username> --password <password>
  login --session-id <sessionId>
  ```
  Allows login using either credentials or an existing session ID.

#### Secured Commands

Commands requiring a valid session ID, available only to logged-in users.

- **Update User Info**:
  ```bash
  update-user --session-id <sessionId> --new-username <newUsername> --new-first-name <newFirstName> --new-last-name <newLastName> --new-email <email>
  ```
  Updates user information.

- **Change Password**:
  ```bash
  reset-password --session-id <sessionId> --username <username> --old-password <oldPassword> --new-password <newPassword>
  ```
  Changes the user's password.

- **Logout**:
  ```bash
  logout --session-id <sessionId>
  ```
  Ends the user's session.

#### Admin Commands

Exclusive to admin users for managing other users.

- **Add Admin**:
  ```bash
  add-admin-user --session-id <sessionId> --username <username>
  ```
  Grants admin rights to a user.

- **Remove Admin**:
  ```bash
  remove-admin-user --session-id <sessionId> --username <username>
  ```
  Revokes admin rights from a user.

- **Delete User**:
  ```bash
  delete-user --session-id <sessionId> --username <username>
  ```
  Deletes a user from the system.

## Audit Log Details

The system maintains an **auditLog** file that records:

- **Failed Logins**: Includes timestamp, event type, user, and IP address.
- **Configuration Changes**: Logs changes in user permissions with details about the change and its outcome.

## Error Handling

The system provides user-friendly error messages for common issues. Technical details and stack traces are logged for administrators to review.

## File Requirements

To run the project, ensure the following files are present:
1. **accounts**: Contains user data.
2. **auditLog**: Logs security events.

This setup ensures secure user authentication, authorization, and comprehensive logging for effective security management.


## Contact
For questions or issues, please contact [tamerlandrufatov@gmail.com](mailto:tamerlandrufatov@gmail.com).
