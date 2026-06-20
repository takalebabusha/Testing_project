# Guru99 Banking System - End-to-End QA & SDET Portfolio Project

This repository serves as a comprehensive Software Testing & Test Automation portfolio project based on the **Guru99 Net Banking Facility**. It showcases a complete testing lifecycle, from initial Requirement Analysis and Manual Testing artifacts to a robust Automated Testing Framework built with **Java, Selenium WebDriver, and TestNG**.

## 🛠️ Tech Stack & Tools

- **Automation Core**: Java 11, Selenium WebDriver 4
- **Test Framework**: TestNG
- **Design Pattern**: Page Object Model (POM)
- **Build Tool**: Maven
- **CI/CD**: GitHub Actions
- **Manual Testing Documentation**: Microsoft Excel, PDF (SRS, Test Cases, Bug Reports)

---

## 🏗️ Phase 1: Manual Testing & Test Planning

The initial phase of the project involved converting the Software Requirements Specification (SRS) into functional validations and creating comprehensive test documentation. 

All manual testing artifacts are located in the `/manual_testing_artifacts/` directory, which includes:
- **Requirement Traceability & Validation**: Converting SRS into a modular table.
- **System Testing Plans**: Complete test scenarios mapping to Manager and Customer roles.
- **Integration Testing**: Validating data flow between modules.
- **Test Cases & Bug Reports**: Detailed steps, expected vs. actual results, and tracked defects.

*Key Modules Analyzed: New Customer, Edit Customer, New Account, Edit Account, Delete Account, Delete Customer, Mini Statement, Customized Statement.*

---

## 🚀 Phase 2: Test Automation Framework

To ensure system reliability and regression safety, an automation framework was developed to cover the critical flows identified during the manual testing phase.

### Framework Architecture (POM)
The framework uses the **Page Object Model** design pattern to separate test logic from page actions, enhancing maintainability and readability.
- `src/main/java/pages/`: Contains Page Object classes housing WebElements and methods (e.g., `LoginPage.java`).
- `src/test/java/tests/`: Contains the TestNG test classes (e.g., `LoginTest.java`).
- `src/test/java/tests/BaseTest.java`: Handles WebDriver initialization and teardown.

### How to Run Tests Locally

1. **Clone the repository**:
   ```bash
   git clone https://github.com/YOUR_USERNAME/Guru99-SW-Tesing-Project-1.git
   ```
2. **Navigate to the project directory**:
   ```bash
   cd Guru99-SW-Tesing-Project-1
   ```
3. **Execute the Maven command**:
   ```bash
   mvn clean test
   ```
   *(Ensure you have JDK 11+ and Maven installed on your system)*

---

## ⚙️ CI/CD Pipeline

A CI/CD pipeline has been implemented using **GitHub Actions**. Every push or pull request to the `main` branch automatically triggers the test suite on a headless Ubuntu environment.

You can view the workflow configuration in `.github/workflows/selenium-tests.yml`.

---

## Conclusion

This project demonstrates the ability to not only design robust manual test cases from raw requirements but also engineer a scalable automation framework integrated with modern CI/CD practices—key skills for an effective **Software Development Engineer in Test (SDET)**.
