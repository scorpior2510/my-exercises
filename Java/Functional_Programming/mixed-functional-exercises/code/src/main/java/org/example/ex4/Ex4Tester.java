package org.example.ex4;

import org.example.ex3.Person;

import java.util.ArrayList;
import java.util.List;

public class Ex4Tester {
    public static void test() {
        System.out.println("Test: Ex4 --------------------");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("The list of numbers:");
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.println();

        DataProcessor.Processor<Integer> processor1 = new DataProcessor.Processor<Integer>() {
            @Override
            public Integer process(Integer input) {
                return input * input;
            }
        };

        DataProcessor.Processor<Integer> processor2 = num -> num * num;

        System.out.println("The list of numbers after processing with lambda:");
        List<Integer> list1 = DataProcessor.applyProcessorToList(numbers, processor2);
        list1.forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.println("The list of numbers after processing with anonymous class:");
        List<Integer> list2 = DataProcessor.applyProcessorToList(numbers, processor1);
        list2.forEach(num -> System.out.print(num + " "));
        System.out.println();

    }
}
