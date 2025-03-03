package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = ctx.getBean(CustomerService.class);
        OrderService orderService = ctx.getBean(OrderService.class);
        ProductService productService = ctx.getBean("createSecondProductService", ProductService.class);
        System.out.println("ProductService " + productService.getState());
        orderService.processOrder();
    }
}