package org.example;

import java.util.HashMap;
import java.util.Map;

public class Ex15 {

    private static Map<String, Integer> wordFrequencyCounter(String sentence) {
        String[] tokens = sentence.split(" ");
        Map<String, Integer> tokenMap = new HashMap<>();
        for (String token : tokens) {
            tokenMap.put(token, tokenMap.getOrDefault(token, 0) + 1);
        }
        return tokenMap;
    }

    public static void main(String[] args) {
        System.out.println("\n-----Ex15: Word Frequency Counter\n");

        String input = "Java is fun and Java is powerful";
        System.out.println("Input sentence: " + input);
        System.out.println("Word Count: " + wordFrequencyCounter(input));

        System.out.println("\n-----Ex15: Word Frequency Counter");
    }

}
