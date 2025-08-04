# Console Calculator

A robust, console-based calculator application built with Java, designed to showcase Object-Oriented Programming (OOP) principles and best practices in version control with Git.

## ✨ Features

This project is more than just a simple calculator. It includes a variety of professional features to ensure stability and a good user experience:

* **Core Arithmetic Operations:**
    * Addition (`+`)
    * Subtraction (`-`)
    * Multiplication (`*`)
    * Division (`/`)
    * Modulus / Remainder (`%`)
* **Robust Input Validation:** The application is designed to handle user errors gracefully without crashing.
    * **Division by Zero Protection:** Prevents the program from attempting to divide by zero or get the remainder by zero.
    * **Invalid Input Handling:** A `try-catch` mechanism prevents crashes if the user enters non-numeric text when a number is expected.
    * **Operator Validation:** The program only accepts valid operators and prompts the user again if an invalid operator is entered.
* **Object-Oriented Design (OOP):**
    * **Separation of Concerns:** The application logic is cleanly separated into two classes:
        * `Main.java`: Handles all user interface logic (prompts, inputs, and outputs).
        * `Calculator.java`: Handles all business logic (mathematical calculations).
* **Formatted Output:** All calculation results are formatted to display two decimal places for a clean and consistent look.
* **Continuous Operation:** The calculator runs in a continuous loop, allowing the user to perform multiple calculations in a single session until they choose to exit.

## 🛠️ Technologies Used

* **Java:** The core programming language used for the application.
* **Git & GitHub:** Used for version control, branching strategy (feature branch for OOP refactoring), and creating a detailed commit history.

## 🚀 How to Run

1.  Clone the repository to your local machine:
    ```bash
    git clone [https://github.com/emrecakall/ConsoleCalculator.git](https://github.com/emrecakall/ConsoleCalculator.git)
    ```
2.  Open the project in a Java IDE like IntelliJ IDEA or Eclipse.
3.  Locate and run the `Main.java` file located in the `src` directory.
4.  Follow the prompts in the console to perform calculations.
