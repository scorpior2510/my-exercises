package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static List<Integer> getInputNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Please Type a nonNegative Number (-1 to stop)");
        int num = scanner.nextInt();
        while (num != -1) {
            list.add(num);
            System.out.println("Please Type Another nonNegative Number (-1 to stop)");
            num = scanner.nextInt();
        }
        scanner.close();
        return list;
    }

    private static void printList(Collection<?> col) {
        col.forEach(element -> System.out.printf("%s ", element));
    }

    private static List<Integer> filteredList(List<Integer> list) {
        return list.stream().filter(num -> num >= 10 && num <= 50).toList();
    }

    private static int sum(List<Integer> list) {
        return list.stream().reduce(0, (num1, num2) -> num1 + num2);
    }

    public static void main(String[] args) {
        List<Integer> list = getInputNumbersFromUser();
        System.out.println("Original List:");
        printList(list);
        list = filteredList(list);
        System.out.println("\nFiltered List:");
        printList(list);
        System.out.println("\nSum of Filtered List: " + sum(list));
    }
}