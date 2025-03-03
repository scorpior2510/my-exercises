package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class ProductService {
    private String state = "A";
    public ProductService() {
        System.out.println("Product Service Initialized");
    }

    public void doSomething() {
        System.out.println("Product Service is doing something...");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
