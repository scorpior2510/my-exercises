package org.example.ex5;

public interface PaymentMethod {

    boolean processPayment(double amount);
    default void printReceipt(double amount) {
        System.out.println("Payment of " + amount + "$ processed successfully");
    }
    static boolean validateAmount(double amount) {
        return amount > 0;
    }

}
