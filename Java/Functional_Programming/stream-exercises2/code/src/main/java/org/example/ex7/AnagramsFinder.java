package org.example.ex7;

import java.util.List;
import java.util.stream.Collectors;

public class AnagramsFinder {

    public static void groupByAnagrams(List<String> words) {

        words.stream()
                .collect(Collectors.groupingBy(word -> word.chars().sorted().mapToObj(e -> (char) e).map(String::valueOf).collect(Collectors.joining())))
                .forEach((key, value) -> System.out.println(value));

    }

}
