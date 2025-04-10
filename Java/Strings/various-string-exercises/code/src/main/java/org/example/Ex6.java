package org.example;

public class Ex6 {

    private static String appendAndReverse(String input) {
        StringBuilder stringBuilder = new StringBuilder(input).append(" - Processed");
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("\n-----Ex6: StringBuilder Usage\n");

        String input1 = "hello";
        String input2 = "whatever";

        System.out.println("Test Input: " + input1);
        System.out.println("Input Appended and Reversed using StringBuilder: " + appendAndReverse(input1));
        System.out.println("Test Input: " + input2);
        System.out.println("Input Appended and Reversed using StringBuilder: " + appendAndReverse(input2));

        System.out.println("\n-----Ex6: StringBuilder Usage");
    }
}
