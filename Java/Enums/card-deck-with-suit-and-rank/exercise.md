# Exercise: Card Deck with Suit and Rank

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 1

## Description
- Objective: Objective: Model a deck of cards using enums for suits and ranks, and implement a method to determine the value of a card.
- Instructions:
  - Create an enum called Suit with constants HEARTS, DIAMONDS, CLUBS, and SPADES.
  - Create another enum called Rank with constants for card ranks (ACE, TWO, THREE, ..., KING).
  - Associate each rank with a point value (ACE = 1, TWO = 2, ..., KING = 13).
  - Write a method getCardValue() in the Rank enum to return the point value.
  - Create a Card class that has a Suit and a Rank, and a method getValue() that returns the card’s value.
  - In the main method:
    - Create a few Card objects.
    - Print their suits, ranks, and values.
- Twist:
  - Add a static method in the Card class to compare two cards and determine which has a higher value.