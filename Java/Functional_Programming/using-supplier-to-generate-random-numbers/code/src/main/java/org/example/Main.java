package org.example;

import java.util.Collection;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Integer generateRandomNumberBetween(int low, int high) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * (high - low + 1) + low);
        return supplier.get();
    }

    private static Integer[] generateXRandomNumbers(int amount, int low, int high) {
        Integer[] randNumbers = new Integer[amount];
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = generateRandomNumberBetween(low, high);
        }
        return randNumbers;
    }

    private static void printRandomCollection(Integer[] array) {
        for (Object obj : array) {
            System.out.println("Random Num: " + obj);
        }
    }

    public static void main(String[] args) {
        Integer[] col = generateXRandomNumbers(10, 1, 100);
        System.out.println("List of 10 Random Numbers:");
        printRandomCollection(col);
    }
}