package org.example.ex1;

public interface Greeter {
    default void greet() {
        System.out.println("Hello!");
    }
}
