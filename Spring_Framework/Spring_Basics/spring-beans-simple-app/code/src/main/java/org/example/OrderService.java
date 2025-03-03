package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final ProductService productService;
    public OrderService(ProductService productService) {
        this.productService = productService;
        System.out.println("Order Service Initialized");
    }

    public void processOrder() {
        System.out.println("Processing Order...");
        productService.doSomething();
    }
}
