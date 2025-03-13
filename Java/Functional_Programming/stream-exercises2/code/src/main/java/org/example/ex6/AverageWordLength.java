package org.example.ex6;

import java.util.Arrays;

public class AverageWordLength {

    public static double computeAverageWordLength(String sentence) {
        if (sentence == null)
            throw new IllegalArgumentException("Input cannot be null");
        return Arrays.stream(sentence.toLowerCase().replaceAll("[^a-z]", " ").split("\s+"))
                .mapToDouble(String::length).average().getAsDouble();
    }

}
