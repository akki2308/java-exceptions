package com.bridgelabz.exceptions;

import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "data.txt";  // File to be read

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {  // Handling IOException
            System.out.println("File not found");
        }
    }
}
