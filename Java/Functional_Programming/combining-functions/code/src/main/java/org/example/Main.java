package org.example;

import java.util.function.Consumer;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static void pipeline(Integer input) {

        Function<Integer, Integer> doubleFunction = num -> num * num;
        Function<Integer, Integer> subtractBy5Function = num -> num - 5;
        Function<Integer, Integer> doubleThenSubtractBy5Function = doubleFunction.andThen(subtractBy5Function);
        Consumer<Integer> consumer = num -> System.out.println(doubleThenSubtractBy5Function.apply(num));

        consumer.accept(input);
    }

    public static void main(String[] args) {

        int input1 = 33;
        pipeline(input1);
        int input2 = 10;
        pipeline(input2);
        int input3 = 4;
        pipeline(input3);

    }
}