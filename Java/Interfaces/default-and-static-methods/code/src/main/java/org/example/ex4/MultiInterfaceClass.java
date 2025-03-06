package org.example.ex4;

public class MultiInterfaceClass implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        System.out.println("Implementation of Interface default method show");
    }
}
