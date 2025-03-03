package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------");
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.activity() + " (Weekend: " + day.isWeekend() + ")");
        }
        System.out.println("----------------------------");
    }
}