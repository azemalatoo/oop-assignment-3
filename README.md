<img width="310" alt="Screen Shot 2025-03-11 at 22 45 44" src="https://github.com/user-attachments/assets/779df128-768d-4f28-8745-76f39730cc1d" />

# Personal Account Management System

This Java project simulates a basic personal bank account management system. It allows users to deposit and withdraw money, check their balance, and view their transaction history.

## Features

* **Account Creation:** Create a personal account with an account number and holder name.
* **Deposits:** Deposit money into the account.
* **Withdrawals:** Withdraw money from the account (with balance checks).
* **Balance Check:** View the current account balance.
* **Transaction History:** View a list of all deposits and withdrawals.
* **Account Information:** Get the account holder name and account number.

## Project Structure

* `TransactionType.java`: An enum representing transaction types (DEPOSIT, WITHDRAWAL).
* `Amount.java`: A class representing a transaction amount and type.
* `PersonalAccount.java`: A class representing a personal bank account.
* `Main.java`: The main class with the user interface.

## How to Compile and Run

1.  **Clone the Repository:**
    ```bash
    git clone https://github.com/azemalatoo/oop-assignment-3
    cd oop-assignment-3
    ```
    (Replace `<repository_url>` with the actual URL of your GitHub repository.)

2.  **Compile the Java Code:**
    ```bash
    javac TransactionType.java Amount.java PersonalAccount.java Main.java
    ```

3.  **Run the Program:**
    ```bash
    java Main
    ```

4.  **Interact with the Program:**
    * Follow the on-screen menu to perform various account operations.

## Example Usage

1.  Run the program.
2.  Enter the account number and account holder name when prompted.
3.  Choose an option from the menu:
    * `1. Deposit`: Enter the deposit amount.
    * `2. Withdraw`: Enter the withdrawal amount.
    * `3. Check Balance`: View the current balance.
    * `4. Print Transaction History`: View the transaction history.
    * `5. Get Account Information`: view account holder name and account number
    * `6. Exit`: Exit the program.
