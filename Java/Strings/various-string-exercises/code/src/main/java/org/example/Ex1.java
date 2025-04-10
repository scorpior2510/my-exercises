package org.example;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("\n-----Ex1: String Basics\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a String");
        String input = scanner.next();

        int length = input.length();
        char first = input.charAt(0);
        char last = input.charAt(length-1);

        System.out.println("\nYour Input String: " + input);
        System.out.println("Length: " + input.length() + ", First: " + first + ", Last: " + last);

        scanner.close();
        System.out.println("\n-----Ex1: String Basics");
    }
}
