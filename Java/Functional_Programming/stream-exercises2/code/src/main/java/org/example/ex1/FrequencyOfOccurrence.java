package org.example.ex1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfOccurrence {

    public static List<String> sortByFrequencyDesc(List<String> list) {
        Map<String, Integer> wordOccurrenceFrequencyMap = new HashMap<>();
        list.forEach(word -> {
            wordOccurrenceFrequencyMap.putIfAbsent(word, 0);
            int wordCount = wordOccurrenceFrequencyMap.get(word);
            wordOccurrenceFrequencyMap.put(word, ++wordCount);
        });
        return wordOccurrenceFrequencyMap.entrySet().stream().sorted((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue())).map(Map.Entry::getKey).toList();
    }

}
