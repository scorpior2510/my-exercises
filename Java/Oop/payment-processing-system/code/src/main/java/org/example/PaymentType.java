package org.example;

public enum PaymentType {
    CREDIT_CARD("Credit Card"),
    CRYPTO("Crypto"),
    PAYPAL("Paypal");

    private final String descriptiveName;

    PaymentType(String descriptiveName) {
        this.descriptiveName = descriptiveName;
    }

    public String getDescriptiveName() {
        return descriptiveName;
    }
}
