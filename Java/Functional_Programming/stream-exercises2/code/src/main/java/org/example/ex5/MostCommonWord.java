package org.example.ex5;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MostCommonWord {

    public static String findMostCommonWord(String sentence) {
        if (sentence == null)
            throw new IllegalArgumentException("sentence can't be null");

        return
        Arrays.stream(sentence.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

    }

}
