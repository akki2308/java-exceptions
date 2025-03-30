package com.bridgelabz.exceptions;

import java.util.Scanner;

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Withdraw Method
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

// Main Class
public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a bank account with an initial balance
        BankAccount account = new BankAccount(5000); // Example: Initial balance = 5000

        try {
            // Taking withdrawal amount input
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            // Attempting withdrawal
            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage()); // Handles insufficient balance
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Handles invalid amount (negative)
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage()); // Handles other exceptions
        } finally {
            sc.close(); // Closing scanner to prevent resource leaks
        }
    }
}
