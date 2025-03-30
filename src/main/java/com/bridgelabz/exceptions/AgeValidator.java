package com.bridgelabz.exceptions;

import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Validating age
            validateAge(age);
        } catch (InvalidAgeException e) {  // Handling custom exception
            System.out.println(e.getMessage());
        } catch (Exception e) {  // Handling other exceptions (e.g., non-numeric input)
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            sc.close(); // Closing Scanner
        }
    }
}
