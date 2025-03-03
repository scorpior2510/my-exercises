package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println("-----------------");
            System.out.println("Season: " + season);
            System.out.println("Morning Activity: " + season.activity(Season.TimeOfDay.MORNING));
            System.out.println("Afternoon Activity: " + season.activity(Season.TimeOfDay.AFTERNOON));
            System.out.println("Evening Activity: " + season.activity(Season.TimeOfDay.EVENING));
        }
    }
}