package org.example.ex4;

import org.example.ex3.UniqueCharacters;

import java.util.List;

public class Test4 {

    public static void main(String... args) {
        System.out.println("----Test4: UniqueIntegerList----\n");
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 10, 15, 3);
        System.out.println("Input list1: " + list1);
        System.out.println("Input list2: " + list2);
        System.out.println("Merged Unique Integer List: " + MergeUnique.mergeUnique(list1, list2));
        System.out.println("\n----Test4: UniqueIntegerList----");
    }

}
