package org.example;

public class CryptoPayment implements PaymentProcessor {

    private double transactionFee = 2;
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        if (walletAddress == null)
            throw new IllegalArgumentException("Illegal Wallet Address");
        this.walletAddress = walletAddress;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        if (walletAddress == null)
            throw new IllegalArgumentException("Illegal Wallet Address");
        this.walletAddress = walletAddress;
    }

    @Override
    public PaymentType getType() {
        return PaymentType.CRYPTO;
    }

    @Override
    public double processPayment(double amount) {

        try {
            validatePayment(amount);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return 0;
        }

        return amount + getTransactionFee();
    }

}
