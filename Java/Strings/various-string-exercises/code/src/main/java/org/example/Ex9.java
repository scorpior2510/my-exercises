package org.example;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println("\n-----Ex9: Vowel and Consonant Counter\n");

        String input = "Hello";

        long vowelsCount = input.toLowerCase().chars().filter(character -> character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u').count();

        System.out.println("Input: " + input);
        System.out.println("Output: Vowels: " + vowelsCount + ", Consonants: " + (input.length() - vowelsCount));

        System.out.println("\n-----Ex9: Vowel and Consonant Counter");
    }
}
