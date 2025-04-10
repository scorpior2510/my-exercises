package org.example;

public class Ex14 {

    private static long extractNum(String word) {
        String cleanWord = word.replaceAll("[^0-9]", "");
        return Long.parseLong(cleanWord);
    }

    public static void main(String[] args) {
        System.out.println("\n-----Ex14: Extract Digits from a String\n");

        String input = "programming0320 is12 fun";
        System.out.println("Input sentence: " + input);
        System.out.println("Extracted Number: " + extractNum(input));

        System.out.println("\n-----Ex14: Extract Digits from a String");
    }

}
