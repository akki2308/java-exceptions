package com.bridgelabz.exceptions;

public class ExceptionPropagationExample {

    // Method 1: Throws ArithmeticException (10 / 0)
    public static void method1() {
        System.out.println("Inside method1");
        int result = 10 / 0; // This will throw ArithmeticException
    }

    // Method 2: Calls method1()
    public static void method2() {
        System.out.println("Inside method2");
        method1(); // Exception propagates here
    }

    // Main Method: Calls method2() and handles exception
    public static void main(String[] args) {
        try {
            method2(); // Exception propagates to main()
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
