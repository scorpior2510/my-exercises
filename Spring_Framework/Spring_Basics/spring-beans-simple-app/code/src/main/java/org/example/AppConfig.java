package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {
    @Bean
    public CustomerService createCustomerService() {
        return new CustomerService();
    }

    @Bean ProductService createSecondProductService() {
        ProductService productService = new ProductService();
        productService.setState("B");
        return productService;
    }
}
