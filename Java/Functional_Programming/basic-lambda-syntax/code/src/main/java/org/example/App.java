package org.example;

import java.util.Scanner;

public class App {

    public static void main(String... args) {

        StringManipulator convertToUppercase1 = str -> str.toUpperCase();
        StringManipulator convertToUppercase2 = String::toUpperCase;

        StringManipulator reverseString = str -> {
            char[] array = str.toCharArray();
            char temp;
            for (int i = 0; i < array.length / 2; i++) {
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            return new String(array);
        };

        StringManipulator appendProcessed = str -> str.concat(" - Processed");

        //Testing

        String input = "hello";

        System.out.println("-------------------");
        System.out.println("Testing Lambda for Converting To Uppercase:");
        System.out.println("The String Converted To Uppercase1: " + convertToUppercase1.manipulate(input));
        System.out.println("The String Converted To Uppercase2: " + convertToUppercase2.manipulate(input));
        System.out.println("-------------------\n");

        System.out.println("-------------------");
        System.out.println("Testing Lambda for Reversing a String:");
        System.out.println("The String Reversed: " + reverseString.manipulate(input));
        System.out.println("-------------------\n");

        System.out.println("-------------------");
        System.out.println("Testing Lambda for Appending Processed to Input:");
        System.out.println("The String Appended: " + appendProcessed.manipulate(input));
        System.out.println("-------------------\n");

    }
}
