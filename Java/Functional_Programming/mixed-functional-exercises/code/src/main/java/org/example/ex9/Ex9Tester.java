package org.example.ex9;

import org.example.ex8.FactoryUtils;
import org.example.ex8.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex9Tester {

    private static List<Integer> generateIntegerList(int sequenceLength) {
        List<Integer> list = new ArrayList<>(sequenceLength);
        for (int i = 0; i < sequenceLength; i++) {
            list.add(i);
        }
        return list;
    }

    private static List<Integer> processElements(List<Integer> list) {
        return list.parallelStream().filter(num -> {
            boolean isPrime = true;
            if (num % 2 == 0 || num <=1)
                return false;
            for (int i = 3; i <= (int) Math.sqrt(num) && isPrime; i += 2) {
                if (num % i == 0)
                    isPrime = false;
            }
            return !isPrime;
        }).map(num -> num * num).toList();
    }


    public static void test() {
        System.out.println("Test: Ex9 --------------------");
        processElements(generateIntegerList(1000)).forEach(e -> System.out.printf("%d ", e));
    }

}
