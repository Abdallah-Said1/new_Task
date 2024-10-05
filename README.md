# Automation Task

## Project Overview
This project automates a basic registration functionality using Selenium WebDriver and Java.
The automation tests are structured using the Page Object Model (POM) to ensure readability, maintainability, and reusability.

## Technologies Used
- **Selenium WebDriver**: For browser automation.
- **Java**: Programming language for writing the automation scripts.
- **JUnit**: Testing framework for structuring and running the tests.
- **Maven**: Dependency management and build tool.
- **ChromeDriver** (or other browser drivers): For running the tests in Chrome.

## Project Structure
The project follows the Page Object Model (POM) design pattern:

- `src/main/java`: Contains the page classes (representing the web pages).
- `src/test/java`: Contains the test classes for executing test cases.
- `pom.xml`: Contains the Maven configuration for dependencies and plugins.

### Page Object Classes:
- `RegisterPage`: Handles the registration form interactions.

### Test Classes:
- `RegisterTest`: Contains the test case for user registration.
