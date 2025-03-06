package org.example.ex2;

public interface Greeter {
    default void greet() {
        System.out.println("Hello!");
    }
}
