package org.example.ex2;

import java.util.List;
import java.util.Map;

public class FindLongest {

    public static String findLongestWord(List<String> list) {

        if (list == null)
            throw new IllegalArgumentException("Illegal Argument: List Cannot be null");

        int maxNumOfCharacters = list.stream().map(String::length).max(Integer::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Illegal Argument: List cannot be empty"));

        return list.stream().filter(word -> word.length() == maxNumOfCharacters).findFirst().orElse("");

//        Alternative By ChatGpt:
//        return list.stream().reduce((w1, w2) -> w1.length() >= w2.length() ? w1 : w2).orElse("");

    }

}
