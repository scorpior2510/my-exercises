package org.example;

public class Ex4Tester {
    public static void main(String[] args) {
        System.out.println("\n-------Ex4: Match an email address\n");
        String inputStr1 = "test@example.com";
        String inputStr2 = "invalid@com";
        String inputStr3 = "user.name@domain.org";
        String inputStr4 = "user.namerg";
        System.out.println("Is \"" + inputStr1 + "\" a valid email address? " + (Ex4.isValidEmailAddress(inputStr1) ? "Yes" : "No"));
        System.out.println("Is \"" + inputStr2 + "\" a valid email address? " + (Ex4.isValidEmailAddress(inputStr2) ? "Yes" : "No"));
        System.out.println("Is \"" + inputStr3 + "\" a valid email address? " + (Ex4.isValidEmailAddress(inputStr3) ? "Yes" : "No"));
        System.out.println("Is \"" + inputStr4 + "\" a valid email address? " + (Ex4.isValidEmailAddress(inputStr4) ? "Yes" : "No"));
        System.out.println("\n-------Ex4: Match an email address\n");
    }
}
