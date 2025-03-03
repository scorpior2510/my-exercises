package org.example;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static void testIfStringBeginsWithAUsingPredicate() {
        System.out.println("Test1: Testing if String starts with A using predicate");
        System.out.println("---------------------------");
        Predicate<String> startsWithA = str -> str.startsWith("A");
        String input1 = "Apple";
        String input2 = "Banana";
        System.out.println("The Word " + input1 + " Starts With A? " + (startsWithA.test(input1) ? "Yes" : "No"));
        System.out.println("The Word " + input2 + " Starts With A? " + (startsWithA.test(input2) ? "Yes" : "No"));
        System.out.println("---------------------------\n");
    }

    private static void addPrefixUsingFunction() {
        System.out.println("Test2: Adding prefix of Value: using function");
        System.out.println("---------------------------");
        IntFunction<String> addValuePrefix = num -> "Value: " + num;
        int input = 42;
        System.out.println("The Number " + input + " Prefixed: " + addValuePrefix.apply(input));
        System.out.println("---------------------------\n");
    }

    private static void printMessageProcessingANumber() {
        System.out.println("Test3: printing a message regarding a number using consumer");
        System.out.println("---------------------------");
        IntConsumer printProcessMessage = num -> System.out.println("Processing number: " + num);
        int input = 100;
        printProcessMessage.accept(input);
        System.out.println("---------------------------\n");
    }




    public static void main(String[] args) {
        testIfStringBeginsWithAUsingPredicate();
        addPrefixUsingFunction();
        printMessageProcessingANumber();
    }
}