package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static void printCollection(Collection<?> col) {
        for (Object obj : col)
            System.out.println(obj);
    }

    public static void main(String[] args) {

        Comparator<String> alphabeticalAscendingComparator = String::compareTo;
        Comparator<String> lengthDescendingComparator = (str1, str2) -> Integer.compare(str2.length(), str1.length());

        List<String> strList = new ArrayList<>(List.of("abc", "bcd", "def", "cde", "fjdksal;fjdsla;", "asdfdf"));
        System.out.println("------------");
        System.out.println("Original List:");
        printCollection(strList);

        System.out.println("------------");
        System.out.println("Sorted Alphabetically Ascending List:");
        strList.stream().sorted(alphabeticalAscendingComparator).forEach(System.out::println);

        System.out.println("------------");
        System.out.println("Sorted By Length Descending List:");
        strList.stream().sorted(lengthDescendingComparator).forEach(System.out::println);

    }
}