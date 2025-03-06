package org.example.ex5;

public class Test5 {
    public static void main(String... args) {

        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod payPal = new PayPalCardPayment();
        boolean isValid;
        boolean isProcessed = false;
        int amount;

        System.out.println("Credit Card Test --------------");

        amount = 0;
        System.out.println("\nProcessing Payment of " + amount + "$ with Credit Card:");
        isValid = PaymentMethod.validateAmount(amount);
        if (isValid) {
            isProcessed = creditCard.processPayment(amount);
            if (isProcessed) {
                creditCard.printReceipt(amount);
            }
        }

        amount = 500;
        System.out.println("\nProcessing Payment of " + amount + "$ with Credit Card:");
        isValid = PaymentMethod.validateAmount(amount);
        if (isValid) {
            isProcessed = creditCard.processPayment(amount);
            if (isProcessed) {
                creditCard.printReceipt(amount);
            }
        }

        amount = 1500;
        System.out.println("\nProcessing Payment of " + amount + "$ with Credit Card:");
        isValid = PaymentMethod.validateAmount(amount);
        if (isValid) {
            isProcessed = creditCard.processPayment(amount);
            if (isProcessed) {
                creditCard.printReceipt(amount);
            }
        }

        System.out.println("\nCredit Card Test --------------\n");

        System.out.println("Paypal Card Test --------------");

        amount = 0;
        System.out.println("\nProcessing Payment of " + amount + "$ with Paypal Card:");
        isValid = PaymentMethod.validateAmount(amount);
        if (isValid) {
            isProcessed = payPal.processPayment(amount);
            if (isProcessed) {
                payPal.printReceipt(amount);
            }
        }

        amount = 500;
        System.out.println("\nProcessing Payment of " + amount + "$ with Paypal Card:");
        isValid = PaymentMethod.validateAmount(amount);
        if (isValid) {
            isProcessed = payPal.processPayment(amount);
            if (isProcessed) {
                payPal.printReceipt(amount);
            }
        }

        amount = 1500;
        System.out.println("\nProcessing Payment of " + amount + "$ with Paypal Card:");
        isValid = PaymentMethod.validateAmount(amount);
        if (isValid) {
            isProcessed = payPal.processPayment(amount);
            if (isProcessed) {
                payPal.printReceipt(amount);
            }
        }

        System.out.println("\nPaypal Card Test --------------");
        
    }
}
