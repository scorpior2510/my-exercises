package org.example;

public enum Currency {

    USD(1),
    EUR(1.1),
    NIS(0.27);

    private double convertToUSD;

    Currency(double convertToUSD) {
        this.convertToUSD = convertToUSD;
    }

    public double getConvertToUSD() {
        return convertToUSD;
    }

    public static double convertCurrency(double amount, Currency from, Currency to) {
        return amount * from.getConvertToUSD() / to.getConvertToUSD();
    }
}
