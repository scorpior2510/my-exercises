# Exercise: Error Code and Messages

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 1

## Description
- Objective: Model an error-handling system using enums for error codes and messages.
- Instructions:
  - Create an enum called ErrorCode with constants for different error types, such as:
    - NOT_FOUND (Message: "Resource not found", Code: 404)
    - UNAUTHORIZED (Message: "Unauthorized access", Code: 401)
    - INTERNAL_ERROR (Message: "Internal server error", Code: 500)
    - Add at least three more.
  - Each constant should store:
    - An error message.
    - An HTTP status code.
    - Add a method getFormattedMessage() that returns the error code and message in a formatted string (e.g., 404: Resource not found).
  - Create a main method that:
    - Demonstrates how to handle errors by printing formatted error messages based on specific ErrorCodes.
- Twist:
  - Add a method isClientError() to identify whether an error code is in the 4xx range, and isServerError() for 5xx.