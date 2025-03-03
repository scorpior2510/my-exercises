package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static List<String> ex1ConvertToUpperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).toList();
    }

    private static void test1() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Testing Ex1: Converting a list of strings to upper case");
        System.out.println("Source List:");
        List<String> list = List.of("apple", "banana", "cherry");
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("Converted List:");
        list = ex1ConvertToUpperCase(list);
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("------------------------");
    }

    private static List<Integer> ex2FilterEvenNumbers(List<Integer> list) {
        return list.stream().filter(e -> e % 2 == 0).toList();
    }

    private static void test2() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Testing Ex2: Filtering even numbers from a list");
        System.out.println("Source List:");
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("Converted List:");
        list = ex2FilterEvenNumbers(list);
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("------------------------");
    }

    private static String ex3FirstWordWithGivenLetter(List<String> list, char letter) {
        return list.stream().filter(e -> e.startsWith(letter + "")).findFirst().orElse("Not found");
    }

    private static void test3() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Testing Ex3: Returning the first word that starts with a letter from a list");
        System.out.println("Source List:");
        List<String> list = List.of("car", "apple", "dog", "ant");
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("First Word that starts with a: " + ex3FirstWordWithGivenLetter(list, 'a'));
        System.out.println("First Word that starts with n: " + ex3FirstWordWithGivenLetter(list, 'n'));
        System.out.println("First Word that starts with d: " + ex3FirstWordWithGivenLetter(list, 'd'));
        System.out.println("------------------------");
    }

    private static int ex4OddSquareSum(List<Integer> list) {
        return list.stream().filter(num -> num % 2 == 1).map(num -> num * num).reduce(0, Integer::sum);
    }

    private static void test4() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Testing Ex4: Returning sum of the square of the odd numbers in a list");
        System.out.println("Source List:");
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("Sum of the square of the odd numbers in the list: " + ex4OddSquareSum(list));
        System.out.println("------------------------");
    }

    private static int ex5CountCertainLength(List<String> list, int length) {
        return (int) list.stream().filter(e -> e.length() == length).count();
    }

    private static void test5() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Testing Ex5: Counting words of certain length in a list");
        System.out.println("Source List:");
        List<String> list = List.of("car", "apple", "dog", "ant", "octopus", "giraph", "lion", "scorpion", "sensitivity");
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println("---");
            int currLength = i;
            System.out.println("Words with " + currLength + " letters:");
            list.stream().filter(e -> e.length() == currLength).forEach(e -> System.out.print(e + " "));
            System.out.println();
            System.out.println("Number of words: " + ex5CountCertainLength(list, i));
        }
        System.out.println("------------------------");
    }

    private static Map<Integer, List<String>> ex6GroupByLength(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(String::length));
    }

    private static void test6() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Testing Ex6: Grouping Words by their length");
        System.out.println("Source List:");
        List<String> list = List.of("car", "main", "application", "rabbit", "bird", "airplane",
                "apple", "dog", "ant", "octopus", "giraph", "lion", "scorpion", "sensitivity");
        list.forEach(e -> System.out.print(e + " "));
        System.out.println();
        Map<Integer, List<String>> wordsGroupedByLength = ex6GroupByLength(list);
        for (Map.Entry<Integer, List<String>> entry : wordsGroupedByLength.entrySet()) {
            System.out.println("----");
            System.out.println("Words with " + entry.getKey() + " letters:");
            System.out.print("List: ");
            entry.getValue().forEach(e -> System.out.print(e + ", "));
            System.out.println();
        }
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }
}