package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Card> col = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            col.add(Card.randCard());
        }

        System.out.println("-----------------------------");
        System.out.println("Collection of Cards Unsorted:");
        col.forEach(System.out::println);
        System.out.println("-----------------------------");
        Collections.sort(col);
        System.out.println("Collection of Cards Sorted:");
        col.forEach(System.out::println);
        System.out.println("-----------------------------");

    }
}