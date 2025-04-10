package org.example;

public class Ex5 {

    private static String reverseOrder(String sentence) {

        if (sentence == null)
            throw new IllegalArgumentException("Illegal sentence input. cannot be null");

        String[] splitArray = sentence.split(" ");
        String[] reversedArray = new String[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            reversedArray[i] = splitArray[splitArray.length - i - 1];
        }

        return String.join(" ", reversedArray);

    }

    public static void main(String[] args) {
        System.out.println("\n-----Ex5: Reverse Words in a String\n");

        String sentence1 = "hello world big data";
        String sentence2 = "heal the world, and do";

        System.out.println("Test Sentence: " + sentence1);
        System.out.println("Sentence Reversed: " + reverseOrder(sentence1));
        System.out.println("Test Sentence: " + sentence2);
        System.out.println("Sentence Reversed: " + reverseOrder(sentence2));

        System.out.println("\n-----Ex5: Reverse Words in a String");
    }

}
