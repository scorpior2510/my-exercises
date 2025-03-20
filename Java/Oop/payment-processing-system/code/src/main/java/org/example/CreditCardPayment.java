package org.example;

public class CreditCardPayment implements PaymentProcessor {

    private double virtualBalance;
    private double transactionFee = 0.015;

    public CreditCardPayment(double virtualBalance) {
        this.virtualBalance = virtualBalance;
    }

    public double getVirtualBalance() {
        return virtualBalance;
    }

    public void setVirtualBalance(double virtualBalance) {
        this.virtualBalance = virtualBalance;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    @Override
    public PaymentType getType() {
        return PaymentType.CREDIT_CARD;
    }

    @Override
    public double processPayment(double amount) {

        try {
            validatePayment(amount);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return 0;
        }

        double payment = amount * (1 + getTransactionFee());
        setVirtualBalance(getVirtualBalance() - payment);

        return payment;
    }

}
