package org.example;

import java.util.Scanner;

public class Ex3 {

    private static String extractSubstring(String input, int numOfCharacters) {
        if (input.length() < numOfCharacters) {
            System.out.println("Invalid length");
            return null;
        }
        return input.substring(0, numOfCharacters);
    }

    public static void main(String[] args) {
        System.out.println("\n-----Ex3: Substring Extraction\n");

        String str1 = "GeeksforGeeks";
        int num1 = 5;
        String str2 = "GeeksforGeeks";
        int num2 = 8;
        String str3 = "GeeksforGeeks";
        int num3 = 15;

        System.out.println("First " + num1 + " Characters of string " + str1 + " Are: " + extractSubstring(str1, num1));
        System.out.println("First " + num2 + " Characters of string " + str2 + " Are: " + extractSubstring(str2, num2));
        System.out.println("First " + num3 + " Characters of string " + str3 + " Are: " + extractSubstring(str3, num3));

        System.out.println("\n-----Ex3: Substring Extraction");
    }
}
