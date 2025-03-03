package org.example.ex7;

import org.example.ex6.Transformer;

import java.util.List;

public class Ex7Tester {

    public static void test() {
        System.out.println("Test: Ex7 --------------------");
        List<Integer> list1 = List.of(22, 33, 55, 66, 77, 52);
        System.out.println("The List of Numbers:");
        list1.forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.println("First Even number above 50: " + Utils.findFirstEvenGreaterThan50(list1).orElse(0));
        System.out.println("-----");
        List<Integer> list2 = List.of(22, 33, 55, 63, 77, 49);
        System.out.println("The List of Numbers:");
        list2.forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.println("First Even number above 50: " + Utils.findFirstEvenGreaterThan50(list2).orElse(0));
        System.out.println("-----");
        System.out.println("Checking null situation:");
        try {
            Utils.findFirstEvenGreaterThan50(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

}
