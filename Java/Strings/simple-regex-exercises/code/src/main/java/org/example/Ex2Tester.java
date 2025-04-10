package org.example;

public class Ex2Tester {
    public static void main(String[] args) {
        System.out.println("\n-------Ex2: Match a digit\n");
        String inputStr1 = "abc123";
        String inputStr2 = "price: 9";
        String inputStr3 = "no numbers here";
        System.out.println("Does \"" + inputStr1 + "\" has digits? " + (Ex2.findIfDigitExists(inputStr1) ? "Yes" : "No"));
        System.out.println("Does \"" + inputStr2 + "\" has digits? " + (Ex2.findIfDigitExists(inputStr2) ? "Yes" : "No"));
        System.out.println("Does \"" + inputStr3 + "\" has digits? " + (Ex2.findIfDigitExists(inputStr3) ? "Yes" : "No"));
        System.out.println("\n-------Ex2: Match a digit");
    }
}
