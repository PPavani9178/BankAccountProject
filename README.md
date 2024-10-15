# Bank Account Project

This project implements a `BankAccount` class in both Java and JavaScript. The class includes methods for depositing and withdrawing money, transferring funds between accounts, and checking balances. It also includes unit tests to validate functionality.

## Table of Contents

- [Java Implementation](#java-implementation)
- [JavaScript Implementation](#javascript-implementation)
- [Setup Instructions](#setup-instructions)
- [Running Tests](#running-tests)
- [Usage Examples](#usage-examples)
- [Contributing](#contributing)
- [License](#license)

## Technologies Used

- Java (with JUnit for testing)
- JavaScript (with Jest for testing)

## Java Implementation

The Java implementation of the `BankAccount` class can be found in the `java/src` directory.

### Dependencies

- JUnit 5

To include JUnit in your Java project, add the following dependency:

**Maven:**

<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.7.0</version>
    <scope>test</scope>
</dependency>
Gradle:

##groovy

testImplementation 'org.junit.jupiter:junit-jupiter:5.7.0'
##JavaScript Implementation
The JavaScript implementation of the BankAccount class can be found in the javascript directory.

Dependencies
Jest (for testing)
To install Jest, run:

##bash

npm install --save-dev jest
##Setup Instructions
##Java Setup
Ensure you have Java Development Kit (JDK) installed.
Navigate to the java directory.
Compile the Java classes:
##bash

javac -d out src/BankAccount.java src/BankAccountTest.java
Run the tests:
## bash

java -cp out org.junit.runner.JUnitCore BankAccountTest
JavaScript Setup
Ensure you have Node.js and npm installed.
Navigate to the javascript directory.
Install dependencies:
## bash

npm install
Running Tests
Java Tests
To run the tests for the Java implementation, use:

## bash

java -cp out org.junit.runner.JUnitCore BankAccountTest
JavaScript Tests
To run the tests for the JavaScript implementation, use:

## bash

      npm test
Usage Examples
## Java Example


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", "John Doe", 1000.0);
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance()); // Output: 1500.0
        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: " + account.getBalance()); // Output: 1200.0
    }
}
##JavaScript Example


const BankAccount = require('./BankAccount');

const account = new BankAccount('12345', 'John Doe', 1000);
account.deposit(500);
console.log(`Balance after deposit: ${account.getBalance()}`); // Output: 1500
account.withdraw(300);
console.log(`Balance after withdrawal: ${account.getBalance()}`); // Output: 1200
