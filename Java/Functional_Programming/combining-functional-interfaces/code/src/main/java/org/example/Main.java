package org.example;

import java.util.function.Consumer;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = String::length;
        Function<Integer, Integer> squareFunction = num -> num * num;
        Consumer<Integer> numConsumer = System.out::println;
        numConsumer.accept(squareFunction.apply(lengthFunction.apply("Functional")));
    }
}