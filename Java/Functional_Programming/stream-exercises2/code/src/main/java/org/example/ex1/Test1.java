package org.example.ex1;

import org.example.ex2.FindLongest;

import java.util.List;

public class Test1 {

    public static void main(String... args) {
        System.out.println("----Test1: FrequencyOfOccurrence----\n");
        List<String> list = List.of("apple", "apple", "apple", "apple", "banana", "cherry", "banana", "banana", "blueberry", "blueberry");
        System.out.println("Testing list: " + list);
        System.out.println("List Sorted by word Frequency: " + FrequencyOfOccurrence.sortByFrequencyDesc(list));
        System.out.println();
        System.out.println("\n----Test1: FrequencyOfOccurrence----");
    }

}
