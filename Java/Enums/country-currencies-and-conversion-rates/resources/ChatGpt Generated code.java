java
Copy code
public static void updateExchangeRate(Country country, double newRate) {
    country.exchangeRateToUSD = newRate;
}
This ensures compliance with the original exercise requirements.
        1.	Input Validation
o	Validate user inputs for country selection and amount to avoid exceptions or incorrect results.
java
Copy code
if (srcOption < 0 || srcOption >= Country.values().length) {
        System.out.println("Invalid source country selected.");
    return;
            }
            2.	Improved Display
o	Instead of printing indices, show country names directly in the user prompt for clarity:
java
Copy code
for (Country country : Country.values()) {
        System.out.println(country.ordinal() + " - " + country.name() + " (" + country.currency + ")");
        }
        3.	Code Efficiency
o	Cache the result of Country.values() in a variable to avoid redundant method calls.
