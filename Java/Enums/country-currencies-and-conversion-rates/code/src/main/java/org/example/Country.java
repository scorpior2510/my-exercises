package org.example;

public enum Country {

    ISRAEL("NIS", 0.27),
    USA("USD", 1),
    CANADA("CAD", 0.71),
    UK("GBP", 1.26),
    EUROPE("EUR", 1.05),
    JAPAN("JPY", 0.0065);

    private String currency;
    private double exchangeRateToUSD;

    Country(String currency, double exchangeRateToUSD) {
        this.currency = currency;
        this.exchangeRateToUSD = exchangeRateToUSD;
    }

    public double convertTo(Country targetCountry, double amount) {
        double usd = amount * this.exchangeRateToUSD;
        return targetCountry.exchangeRateFromUSD() * usd;
    }

    private double exchangeRateFromUSD() {
        return (1 / this.exchangeRateToUSD);
    }

}
