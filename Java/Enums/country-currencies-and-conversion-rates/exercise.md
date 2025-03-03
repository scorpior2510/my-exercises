# Exercise: Country Currencies and Conversion Rates

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 1

## Description
- Objective: Implement an enum to store country currencies and a method for simple currency conversions.
- Instructions:
  - Create an enum called Country with constants for several countries (USA, CANADA, UK, EUROPE, JAPAN, etc.).
  - For each country, store its currency (e.g., USD, CAD, GBP, EUR, JPY) and an exchange rate relative to USD (for simplicity, assume static rates).
  - Add a method convertTo(Country targetCountry, double amount) that:
    - Takes a Country target and an amount in the current country’s currency.
    - Converts the amount to the currency of the target country using the stored exchange rates.
  - Create a main method that:
    - Prompts the user to select a country, target country, and amount, then prints the converted amount.
- Twist:
  - Make the exchange rates adjustable by adding a static method updateExchangeRate(Country country, double newRate).

## ChatGpt Solution Analysis
Your solution demonstrates a solid understanding of Java enums, object-oriented design, and functionality implementation. Here's a detailed analysis and a rating of your design based on clarity, correctness, extensibility, and efficiency.
Analysis of Solution
- Correctness
 - The Country enum correctly models the required constants and their associated data (currency name and exchange rate to USD). ✅
  - The convertTo method appropriately calculates the amount converted from one currency to another using the exchange rates. ✅
  - The exchange rates are set relative to USD, and you use inverse logic for conversion (exchangeRateFromUSD). This is correct and ensures precision. ✅
- Design
  - Encapsulation: Fields like currency and exchangeRateToUSD are private, adhering to good encapsulation practices. ✅
  - Convenience: The showCountries method makes it easy to display available countries for selection in the main program. ✅
  - Separation of Concerns: The logic for conversion is encapsulated in the enum, keeping the main class focused on user interaction. ✅
- Usability and Extensibility
  - Adding a new country is straightforward (just a new enum constant). ✅
  - Missing Feature: There's no implementation for updating exchange rates dynamically (updateExchangeRate). While it was optional, its absence slightly reduces extensibility. 🟡
  - You could have considered handling invalid user inputs (e.g., an out-of-bounds index). Adding validation would enhance robustness. 🟡
- Code Quality
  - Naming: Variable and method names are meaningful, making the code easy to understand. ✅
  - Clarity: The exchangeRateFromUSD method is a nice helper, but its name could be slightly improved (e.g., getRateFromUSD) for readability. 🟡
  - Reusability: The design is highly reusable, and the enum is easily extendable. ✅
- Efficiency
  - The logic in convertTo is efficient. Calculations are straightforward and performed in constant time. ✅
  - Using Country.values() repeatedly in the showCountries and selection logic could be optimized by storing it in a variable (e.g., Country[] countries = Country.values();). Minor inefficiency. 🟡

Suggestions for Improvement
- Dynamic Update of Exchange Rates
  - Implement the updateExchangeRate method as a static method within the Country enum to allow real-time updates: (reference to code in the resources section)

Rating: 8/10
- Clarity (2/2): The code is readable and logically organized.
- correctness (2/2): It satisfies the core functionality of the exercise.
- Extensibility (1.5/2): Adding new countries is easy, but the lack of dynamic rate updates affects extensibility slightly.
- Efficiency (1.5/2): The calculations are efficient, but minor optimizations like caching Country.values() could improve performance.
- Robustness (1/2): Input validation is missing, and edge cases could have been handled more gracefully.
Your solution is well-done and highly functional! Implementing the suggested improvements would elevate it to a 10/10 design.

## Resources
- [ChatGpt generated code.java](resources/ChatGpt%20Generated%20code.java)