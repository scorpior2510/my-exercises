package org.example.ex6;

import org.example.ex5.CreditCardPayment;
import org.example.ex5.PayPalCardPayment;
import org.example.ex5.PaymentMethod;

public class Test6 {
    public static void main(String... args) {

        System.out.println("Testing SmartLight..");
        SmartDevice smartLight = new SmartLight();
        smartLight.connectToWiFi("[ssidName]");
        smartLight.turnOn();
        smartLight.turnOff();
        System.out.println("Suppose an issue with the connection has happened");
        SmartDevice.troubleshoot();

        System.out.println("\n----------------");

        System.out.println("Testing SmartSpeaker..");
        SmartDevice smartSpeaker = new SmartSpeaker();
        smartSpeaker.connectToWiFi("[ssidName]");
        smartSpeaker.turnOn();
        smartSpeaker.turnOff();
        System.out.println("Suppose an issue with the connection has happened");
        SmartDevice.troubleshoot();

    }
}
