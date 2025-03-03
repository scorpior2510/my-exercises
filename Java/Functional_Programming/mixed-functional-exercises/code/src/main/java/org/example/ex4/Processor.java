package org.example.ex4;

public interface Processor<T, R> {
    R process(T input);

}
