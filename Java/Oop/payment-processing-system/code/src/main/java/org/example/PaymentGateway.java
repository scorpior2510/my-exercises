package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PaymentGateway {

    private PaymentProcessor preferredPaymentMethod;
    private final List<TransactionLog> transactionLogger;

    public PaymentGateway() {
        this.transactionLogger = new ArrayList<>();
    }

    public PaymentGateway(PaymentProcessor preferredPaymentMethod) {
        this();
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public PaymentProcessor getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    public void setPreferredPaymentMethod(PaymentProcessor preferredPaymentMethod) {
        if (preferredPaymentMethod == null)
            throw new IllegalArgumentException("Illegal Payment Processor");
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public void showTransactionLogs() {
        for (TransactionLog log : transactionLogger) {
            System.out.println(log);
        }
    }

    public void processTransaction(double amount) {
        PaymentProcessor paymentProcessor = this.getPreferredPaymentMethod();
        if (paymentProcessor == null)
            throw new IllegalArgumentException("Illegal Payment Processor");
        processTransaction(amount, this.getPreferredPaymentMethod());
    }

    public void processTransaction(double amount, PaymentProcessor paymentProcessor) {

        if (paymentProcessor == null)
            throw new IllegalArgumentException("Illegal Payment Processor");

        double paymentResultAmount = paymentProcessor.processPayment(amount);
        boolean successfulTransaction = paymentResultAmount > 0;

        String logMessage = successfulTransaction ?
                "Processed " + paymentResultAmount + " via " + paymentProcessor.getType() :
                "Failed to process amount of " + amount + " via " + paymentProcessor.getType();

        transactionLogger.add(new TransactionLog(LocalDateTime.now(), logMessage));
    }


}

