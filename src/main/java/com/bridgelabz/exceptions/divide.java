package com.bridgelabz.exceptions;

import java.util.Scanner;
        import java.util.InputMismatchException;

public class divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) { // Handling division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) { // Handling non-numeric input
            System.out.println("Error: Please enter only numeric values.");
        } finally {
            sc.close(); // Closing scanner to prevent resource leak
        }
    }
}
