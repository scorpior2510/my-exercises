package org.example;

public class Test {
    public static void main(String[] args) {
        System.out.println("\n********* Testing PaymentGateway - Start");

        PaymentGateway paymentGateway = new PaymentGateway();

        System.out.println("\n*** Sub Testing Payment with Credit Card - Start");
        PaymentProcessor creditCardPayment = new CreditCardPayment(550);
        paymentGateway.processTransaction(2000, creditCardPayment);
        paymentGateway.processTransaction(-5, creditCardPayment);
        System.out.println("*** Sub Testing Payment with Credit Card - end");

        System.out.println("\n*** Sub Testing Payment with Paypal - Start");
        PaymentProcessor paypalPayment = new PayPalPayment();
        paymentGateway.processTransaction(2000, paypalPayment);
        paymentGateway.processTransaction(-5, paypalPayment);
        System.out.println("*** Sub Testing Payment with Paypal - end");

        System.out.println("\n*** Sub Testing Payment with crypto - Start");
        PaymentProcessor cryptoPayment = new CryptoPayment("wallet Address..");
        paymentGateway.processTransaction(2000, cryptoPayment);
        paymentGateway.processTransaction(-5, cryptoPayment);
        System.out.println("*** Sub Testing Payment with crypto - end");

        System.out.println("\n*** Sub Testing PaymentGateway preferredPaymentProcessor - Start");
        try {
            paymentGateway.processTransaction(2000);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        paymentGateway.setPreferredPaymentMethod(creditCardPayment);
        paymentGateway.processTransaction(2000);
        System.out.println("*** Sub Testing PaymentGateway preferredPaymentProcessor - End");

        System.out.println();
        paymentGateway.showTransactionLogs();
        System.out.println("\n********* Testing PaymentGateway - End");
    }
}
