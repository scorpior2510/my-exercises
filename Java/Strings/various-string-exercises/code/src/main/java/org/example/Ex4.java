package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("\n-----Ex4: Character Frequency Counter\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a String");
        String input = scanner.next();
        System.out.println("Insert a character");
        char inputChar = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == inputChar)
                count++;
        }

        long count2 = input.chars().filter(character -> character == inputChar).count();

        System.out.println("(working with charAt) String: " + input + ", Character: " + inputChar + ", Character Count: " + count);
        System.out.println("(working with streams) String: " + input + ", Character: " + inputChar + ", Character Count: " + count2);



        scanner.close();
        System.out.println("\n-----Ex4: Character Frequency Counter");
    }
}
