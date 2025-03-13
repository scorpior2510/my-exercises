package org.example.ex4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeUnique {

    public static List<Integer> mergeUnique(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null)
            throw new IllegalArgumentException("Input lists cannot be null");
        return Stream.concat(list1.stream(), list2.stream()).distinct().sorted(Comparator.comparingInt(Integer::intValue)).toList();
    }

}
