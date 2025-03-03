package org.example.ex6;

@FunctionalInterface
public interface Transformer<T> {
    T transform(T input);
}
