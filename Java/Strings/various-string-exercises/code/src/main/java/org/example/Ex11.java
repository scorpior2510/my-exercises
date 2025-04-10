package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ex11 {

    public static void main(String[] args) {
        System.out.println("\n-----Ex11: Remove Duplicate Characters\n");

        String input = "Programming";
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char character : input.toCharArray()) {
            if (!set.contains(character)) {
                set.add(character);
                result.append(character);
            }
        }

        System.out.println(result);


        System.out.println("\n-----Ex11: Remove Duplicate Characters");
    }

}
