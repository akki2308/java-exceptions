package com.bridgelabz.exceptions;


import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;

public class FileReaderWithResources {
    public static void main(String[] args) {
        String fileName = "info.txt"; // File to be read

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String firstLine = br.readLine(); // Reading first line
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) { // Handling file-related errors
            System.out.println("Error reading file");
        }
    }
}
