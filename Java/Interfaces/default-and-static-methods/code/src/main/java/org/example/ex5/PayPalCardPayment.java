package org.example.ex5;

public class PayPalCardPayment implements PaymentMethod {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Authentication check done!");
        return true;
    }

}
