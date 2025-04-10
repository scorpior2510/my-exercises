package org.example;

import java.util.Arrays;

public class Ex8 {

    public static boolean anagramChecker(String input1, String input2) {

        char[] input1CharArray = input1.toCharArray();
        Arrays.sort(input1CharArray);
        char[] input2CharArray = input2.toCharArray();
        Arrays.sort(input2CharArray);

        return Arrays.equals(input1CharArray, input2CharArray);
    }

    public static void main(String[] args) {
        System.out.println("\n-----Ex8: Anagram Checker\n");

        String input1 = "listen";
        String input2 = "silent";

        System.out.println("Are " + input1 + " and " + input2 + " anagrams? " + (anagramChecker(input1, input2) ? "Yes" : "No"));

        System.out.println("\n-----Ex8: Anagram Checker");
    }

}
