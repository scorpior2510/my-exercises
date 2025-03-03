package org.example;

import java.util.Collection;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static void printCollection(String title, Collection<?> col) {
        System.out.println(title);
        for (Object obj : col)
            System.out.print(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        String[] array = {"Jade", "Jake", "Boni", "Jill", "Jennifer", "jen", "Goblin", "Danni"};
        List<String> inputList = List.of(array);
        List<String> filteredList = inputList.stream().filter(str -> str.startsWith("J") && str.length() > 3).toList();
        printCollection("Input List:", inputList);
        printCollection("Filtered List:", filteredList);
    }
}