package com.bridgelabz.exceptions;

import java.util.Scanner;

public class InterestCalculator {
    // Method with 'throws' to propagate exception
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        return (amount * rate * years) / 100; // Simple Interest formula
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter principal amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter interest rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter number of years: ");
            int years = sc.nextInt();

            // Calling method
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) { // Handling propagated exception
            System.out.println(e.getMessage());
        } catch (Exception e) { // Handling other input errors
            System.out.println("Invalid input! Please enter numeric values.");
        } finally {
            sc.close(); // Closing scanner to prevent resource leak
        }
    }
}
