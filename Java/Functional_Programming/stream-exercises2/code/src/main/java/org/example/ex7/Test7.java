package org.example.ex7;

import java.util.List;

public class Test7 {

    public static void main(String... args) {
        System.out.println("----Test7: AnagramsFinder----\n");
        List<String> words = List.of("word", "ordw", "rdwo", "car", "rac", "norway");
        AnagramsFinder.groupByAnagrams(words);
        System.out.println("\n----Test7: AnagramsFinder----");
    }

}
