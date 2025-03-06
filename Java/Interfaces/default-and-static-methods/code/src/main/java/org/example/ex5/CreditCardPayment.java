package org.example.ex5;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public boolean processPayment(double amount) {
        return amount < 1000;
    }

}
