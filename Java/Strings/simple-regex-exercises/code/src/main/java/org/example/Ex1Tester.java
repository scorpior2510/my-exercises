package org.example;

public class Ex1Tester {
    public static void main(String[] args) {
        System.out.println("\n-------Ex1: Matching a word\n");
        String word = "hello";
        String inputStr1 = "hello world";
        String inputStr2 = "say hello";
        String inputStr3 = "HELLO";
        System.out.println("Does the word \"" + word + "\" Exists in \"" + inputStr1 + "\": " + (Ex1.findIfWordExists(word, inputStr1) ? "Yes" : "No"));
        System.out.println("Does the word \"" + word + "\" Exists in \"" + inputStr2 + "\": " +  (Ex1.findIfWordExists(word, inputStr2) ? "Yes" : "No"));
        System.out.println("Does the word \"" + word + "\" Exists in \"" + inputStr3 + "\": " +  (Ex1.findIfWordExists(word, inputStr3) ? "Yes" : "No"));
        System.out.println("\n-------Ex1: Matching a word");
    }
}
