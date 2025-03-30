package com.bridgelabz.exceptions;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample array
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Taking array index input
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            try {
                // Accessing array element
                int value = numbers[index];
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                // Performing division
                int result = value / divisor;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) { // Handling division by zero
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) { // Handling invalid index
            System.out.println("Invalid array index!");
        } catch (Exception e) { // Handling non-numeric input errors
            System.out.println("Invalid input! Please enter numeric values.");
        } finally {
            sc.close(); // Closing scanner to prevent resource leaks
        }
    }
}
