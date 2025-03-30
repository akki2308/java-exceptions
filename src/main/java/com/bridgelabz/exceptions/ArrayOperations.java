package com.bridgelabz.exceptions;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking array input
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            Integer[] arr = (size > 0) ? new Integer[size] : null; // Initializing array

            // Populating the array
            if (arr != null) {
                System.out.println("Enter " + size + " elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }
            }

            // Taking index input
            System.out.print("Enter the index to retrieve value: ");
            int index = sc.nextInt();

            // Printing value at the given index
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) { // Handling invalid index
            System.out.println("Invalid index!");
        } catch (NullPointerException e) { // Handling null array
            System.out.println("Array is not initialized!");
        } catch (Exception e) { // Handling other input-related exceptions
            System.out.println("Invalid input! Please enter numeric values.");
        } finally {
            sc.close(); // Closing Scanner to prevent resource leak
        }
    }
}
