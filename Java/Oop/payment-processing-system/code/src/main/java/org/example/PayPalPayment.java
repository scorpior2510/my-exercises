package org.example;

public class PayPalPayment implements PaymentProcessor {

    private double transactionFee = 0.02;

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    @Override
    public PaymentType getType() {
        return PaymentType.PAYPAL;
    }

    @Override
    public double processPayment(double amount) {

        try {
            validatePayment(amount);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return 0;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }

        return amount * (1 + getTransactionFee());
    }

}
