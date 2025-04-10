package org.example;

public class Ex3Tester {
    public static void main(String[] args) {
        System.out.println("\n-------Ex3: Match a sequence of digits\n");
        String inputStr1 = "There are 42 apples";
        String inputStr2 = "12345";
        String inputStr3 = "A1B2C3";
        System.out.println("How many digit sequences exist in \"" + inputStr1 + "\": " + Ex3.countDigitSequences(inputStr1));
        System.out.println("How many digit sequences exist in \"" + inputStr2 + "\": " + Ex3.countDigitSequences(inputStr2));
        System.out.println("How many digit sequences exist in \"" + inputStr3 + "\": " + Ex3.countDigitSequences(inputStr3));
        System.out.println("\n-------Ex3: Match a sequence of digits\n");
    }
}
