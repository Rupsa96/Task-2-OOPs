package Q3;

/*
Q3. Create a class Account with a data member balance.

Requirements:
a) Create two constructors: one without arguments and one with initial balance.
b) Create a method to deposit an amount.
c) Create a method to withdraw an amount.
d) Create a method to display the current balance.
*/

public class Account {

    double balance;

    // No-argument constructor
    Account() {
        balance = 0; // Initialize balance to 0
    }

    // Parameterized constructor
    Account(double balance) {
        this.balance = balance; // Initialize balance with given value
    }

    // Method to deposit amount
    void deposit(double amount) {
        balance += amount; // Add amount to balance
        System.out.println("Deposited: " + amount); // Print deposited amount
    }

    // Method to withdraw amount
    void withdraw(double amount) {
        if (amount <= balance) { // Check if sufficient balance is available
            balance -= amount;   // Deduct amount from balance
            System.out.println("Withdrawn: " + amount); // Print withdrawn amount
        } else {
            System.out.println("Insufficient balance"); // Print error message if balance is low
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance); // Print balance
    }

    // Main method
    public static void main(String[] args) {

        Account acc = new Account(1000); // Create Account object with initial balance

        acc.deposit(700);   // Call deposit method
        acc.withdraw(200);  // Call withdraw method
        acc.displayBalance(); // Call method to display current balance
    }
}