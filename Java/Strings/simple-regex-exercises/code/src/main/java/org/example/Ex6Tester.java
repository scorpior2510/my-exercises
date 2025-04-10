package org.example;

public class Ex6Tester {
    public static void main(String[] args) {
        System.out.println("\n-------Ex6: Match a date in YYYY-MM-DD format\n");
        String inputStr1 = "hello";
        String inputStr2 = "2024-12-01";
        String inputStr3 = "24-12-01";
        System.out.println("Is \"" + inputStr1 + "\" of YYYY-MM-DD date format? " + (Ex6.isOfDateFormat(inputStr1) ? "Yes" : "No"));
        System.out.println("Is \"" + inputStr2 + "\" of YYYY-MM-DD date format? " + (Ex6.isOfDateFormat(inputStr2) ? "Yes" : "No"));
        System.out.println("Is \"" + inputStr3 + "\" of YYYY-MM-DD date format? " + (Ex6.isOfDateFormat(inputStr3) ? "Yes" : "No"));
        System.out.println("\n-------Ex6: Match a date in YYYY-MM-DD format\n");
    }
}
