package org.example.ex2;

import java.util.List;

public class Test2 {

    public static void main(String... args) {
        System.out.println("----Test2: FindLongestWord----\n");
        List<String> list = List.of("apple", "banana", "cherry", "blueberry");
        System.out.println("Testing list: " + list);
        System.out.println("Longest Word: " + FindLongest.findLongestWord(list));
        System.out.println();
        System.out.println("\n----Test2: FindLongestWord----");
    }

}
