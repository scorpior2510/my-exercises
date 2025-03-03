package org.example.ex4;

import java.util.List;

public class DataProcessor {

    interface Processor<T> {
        Integer process(T input);
    }

    public static List<Integer> applyProcessorToList(List<Integer> list, Processor<Integer> processor) {
        if (list == null || list.isEmpty())
            throw new IllegalArgumentException("List is empty or null");
        return list.stream().map(processor::process).toList();
    }
}
