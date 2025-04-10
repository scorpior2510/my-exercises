package org.example;

public class Ex5Tester {
    public static void main(String[] args) {
        System.out.println("\n-------Ex5: Match a word with only lowercase letters\n");
        String inputStr1 = "hello";
        String inputStr2 = "Hello";
        String inputStr3 = "hello123";
        System.out.println("Does \"" + inputStr1 + "\" contains only lowercase letters? " + (Ex5.containsOnlyLowercaseLetters(inputStr1) ? "Yes" : "No"));
        System.out.println("Does \"" + inputStr2 + "\" contains only lowercase letters? " + (Ex5.containsOnlyLowercaseLetters(inputStr2) ? "Yes" : "No"));
        System.out.println("Does \"" + inputStr3 + "\" contains only lowercase letters? " + (Ex5.containsOnlyLowercaseLetters(inputStr3) ? "Yes" : "No"));
        System.out.println("\n-------Ex5: Match a word with only lowercase letters\n");
    }
}
