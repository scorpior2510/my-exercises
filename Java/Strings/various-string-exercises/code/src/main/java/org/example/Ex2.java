package org.example;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("\n-----Ex2: String Comparison\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert String1");
        String input1 = scanner.next();
        System.out.println("Insert String2");
        String input2 = scanner.next();

        boolean isEquals = input1.equals(input2);
        int comparison = input1.compareTo(input2);

        enum ComparisonResult {BIGGER, EQUALS, SMALLER};

        ComparisonResult comparisonResult =
                comparison > 0 ? ComparisonResult.BIGGER : comparison == 0 ? ComparisonResult.EQUALS : ComparisonResult.SMALLER;

        System.out.println("\nFirst input equals second one? " + (isEquals ? "Yes" : "No"));

        switch (comparisonResult) {
            case BIGGER -> System.out.println(input1 + " is lexicographically after " + input2);
            case SMALLER -> System.out.println(input1 + " is lexicographically before " + input2);
            case EQUALS -> System.out.println(input1 + " equals to " + input2);
        }

        scanner.close();
        System.out.println("\n-----Ex2: String Comparison");
    }
}
