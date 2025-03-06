package org.example.ex6;

public interface SmartDevice {

    void turnOn();
    void turnOff();

    default void connectToWiFi(String network) {
        System.out.println("Connecting to " + network);
    }

    static void troubleshoot() {
        System.out.println("Try restarting your device or checking your internet connection");
    }


}
