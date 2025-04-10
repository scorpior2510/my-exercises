package org.example;

public class Ex7 {

    private static boolean palindromeChecker(String input) {
        String reversedInput = new StringBuilder(input).reverse().toString();
        return input.equals(reversedInput);
    }

    public static void main(String[] args) {
        System.out.println("\n-----Ex7: Palindrome Checker\n");

        String input1 = "hello";
        String input2 = "helleh";

        System.out.println("Test Input: " + input1);
        System.out.println("is Test input palindrome? " + (palindromeChecker(input1) ? "Yes" : "No"));
        System.out.println("Test Input: " + input2);
        System.out.println("is Test input palindrome? " + (palindromeChecker(input2) ? "Yes" : "No"));

        System.out.println("\n-----Ex7: Palindrome Checker");
    }
}
