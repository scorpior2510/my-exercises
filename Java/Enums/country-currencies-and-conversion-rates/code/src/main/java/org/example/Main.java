package org.example;

import java.util.Scanner;

public class Main {

    private static void showCountries() {
        for (int i = 0; i < Country.values().length; i++) {
            System.out.println(i + " - " + Country.values()[i]);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------");
        showCountries();
        System.out.println("--------------------");
        System.out.println("Choose Source Country");
        int srcOption = scanner.nextInt();
        System.out.println("Choose Target Country");
        int tarOption = scanner.nextInt();
        System.out.println("Enter Amount");
        double amount = scanner.nextDouble();
        System.out.println("--------------------");
        Country sourceCountry = Country.values()[srcOption];
        Country targetCountry = Country.values()[tarOption];
        double conversion = sourceCountry.convertTo(targetCountry, amount);
        System.out.println("Converted Amount Is: " + conversion);
        System.out.println("--------------------");

    }
}