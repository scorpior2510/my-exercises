package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TrafficLight trafficLight = TrafficLight.values()[(int) (Math.random() * 3)];

        for (int i = 0; i < 5; i++) {
            System.out.println("Current Traffic Light: " + trafficLight);
            trafficLight = trafficLight.getNextLight();
            System.out.println("Next Traffic Light: " + trafficLight);
            System.out.println("----------------");

        }
    }
}