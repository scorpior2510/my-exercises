package org.example.ex4;

public interface InterfaceB {
    default void show() {
        System.out.println("InterfaceB show");
    }
}
