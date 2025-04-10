package org.example;

public class Ex7Tester {
    public static void main(String[] args) {
        System.out.println("\n-------Ex7: Match a word that starts with ‘A’ or ‘a’\n");
        String inputStr1 = "Apple is good";
        String inputStr2 = "an example";
        String inputStr3 = "banana";
        String inputStr4 = "good Apple";
        System.out.println("Does \"" + inputStr1 + "\" starts with a or A? " + (Ex7.startsWithLetterACaseInsensitive(inputStr1) ? "Yes" : "No"));
        System.out.println("Does \"" + inputStr2 + "\" starts with a or A? " + (Ex7.startsWithLetterACaseInsensitive(inputStr2) ? "Yes" : "No"));
        System.out.println("Does \"" + inputStr3 + "\" starts with a or A? " + (Ex7.startsWithLetterACaseInsensitive(inputStr3) ? "Yes" : "No"));
        System.out.println("Does \"" + inputStr4 + "\" starts with a or A? " + (Ex7.startsWithLetterACaseInsensitive(inputStr4) ? "Yes" : "No"));
        System.out.println("\n-------Ex7: Match a word that starts with ‘A’ or ‘a’\n");
    }
}
