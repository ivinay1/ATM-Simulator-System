# ATM Simulator System

The ATM Simulator System is a Java-based application designed to emulate the functionality of a real-world Automated Teller Machine (ATM). It features a graphical user interface (GUI) built with Java Swing and AWT, along with database connectivity using MySQL for storing and retrieving user account information and transaction data.

## Overview

This application provides users with a simulated ATM experience, allowing them to perform various banking transactions securely and conveniently. With intuitive GUI components and robust database connectivity, users can manage their accounts, check balances, withdraw funds, deposit funds, transfer money, and view transaction history.

## Features

- **User Authentication:** Secure login system requiring username and PIN verification.
- **Account Management:** Perform transactions such as balance inquiry, withdrawals, deposits, and transfers.
- **Transaction History:** View detailed transaction history for each account.
- **Security Measures:** Implementation of robust security measures to safeguard user accounts.
- **Error Handling:** Comprehensive error handling ensures smooth user experience.

## Technologies Used

- **Java:** Core programming language used for application development.
- **Swing and AWT:** GUI libraries used for building the graphical user interface.
- **MySQL:** Database technology utilized for storing and retrieving user account information and transaction data.

## Installation and Usage

1. **Clone the Repository:**
   git clone https://github.com/ivinay1/ATM-Simulator-System.git

2. **Set Up MySQL Database:**
- Create a MySQL database named `atm_simulator_system`.
- Import the provided SQL script (`database.sql`) to create the necessary tables.

3. **Compile and Run the Application:**
   javac ATMSystem.java
   java ATMSystem

4. **Follow the On-Screen Instructions:**
- Enter your username and PIN to log in.
- Use the menu options to perform various account transactions.

## Future Enhancements

- Support for bill payments.
- Account statement generation.
- Currency conversion.
- Support for multiple user accounts.

## Credits

This project was inspired by a YouTube tutorial on building an ATM Simulator System in Java.




