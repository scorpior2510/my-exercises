package org.example;

public interface PaymentProcessor {

    double processPayment(double amount);
    default void validatePayment(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Illegal payment of " + amount + ". Payment needs to be greater than zero.");
    }
    static double convertCurrency(double amount, Currency from, Currency to) {
        return Currency.convertCurrency(amount, from, to);
    }
    PaymentType getType();

}
