package com.bridgelabz.exceptions;

import java.util.Scanner;

public class DivisionWithFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking input from user
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) { // Handling division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) { // Handling other exceptions (e.g., non-numeric input)
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            System.out.println("Operation completed."); // Always executes
            sc.close(); // Closing scanner to prevent resource leak
        }
    }
}
