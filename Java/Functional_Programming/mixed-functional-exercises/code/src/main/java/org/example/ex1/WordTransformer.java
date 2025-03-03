package org.example.ex1;

import java.util.List;

public class WordTransformer {

    public static List<String> reversedWords(List<String> list) {
        return list.stream().map(Reverser::reverseWord).toList();
    }

    private static class Reverser {
        public static String reverseWord(String word) {
            return new StringBuilder(word).reverse().toString();
        }
    }

}
