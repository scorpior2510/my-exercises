package org.example.ex1;

import java.util.List;

public class Ex1Tester {
    public static void test() {
        System.out.println("Test: Ex1 --------------------");
        List<String> list = List.of("apple", "new", "ordinary", "unique", "place", "dog");
        System.out.println("The original list:");
        list.forEach(str -> System.out.print(str + " "));
        System.out.println();
        System.out.println("The reversed list:");
        list = WordTransformer.reversedWords(list);
        list.forEach(str -> System.out.print(str + " "));
    }
}
