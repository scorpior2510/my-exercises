package org.example.ex5;

import org.example.ex4.DataProcessor;

import java.util.List;
import java.util.function.Function;

public class Ex5Tester {
    public static void test() {
        System.out.println("Test: Ex5 --------------------");

        Function<Integer, Integer> doubleFunction = num -> num * 2;
        Function<Integer, Integer> sqrFunction = num -> (int) Math.pow(num, 2);
        Function<Integer, Integer> add5Function = num -> num + 5;

        System.out.println("Result of doubling > squaring > adding 5 to 2 is:");
        System.out.println(DynamicFunctionPipeline.dynamicFunctionPipeline(List.of(doubleFunction, sqrFunction, add5Function), 2));

    }
}
