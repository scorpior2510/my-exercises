package org.example;

public class Ex12 {

    private static String convertToTitleCase(String sentence) {
        String[] sentenceAsArray = sentence.split("\\W+");
        for (int i = 0; i < sentenceAsArray.length; i++) {
            sentenceAsArray[i] = sentenceAsArray[i].substring(0, 1).toUpperCase() + sentenceAsArray[i].substring(1, sentenceAsArray[i].length());
        }
        return String.join(" ", sentenceAsArray);
    }

    public static void main(String[] args) {
        System.out.println("\n-----Ex12: Convert String to Title Case\n");

        String input = "programming is fun";
        System.out.println("Input sentence: " + input);
        System.out.println("Input sentence in Title Case: " + convertToTitleCase(input));

        System.out.println("\n-----Ex12: Convert String to Title Case");
    }

}
