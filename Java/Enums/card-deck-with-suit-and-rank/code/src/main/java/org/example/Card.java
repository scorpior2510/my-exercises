package org.example;

public class Card implements Comparable<Card> {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue() {
        return this.rank.getCardValue();
    }

    public static Card randCard() {
        Rank randRank = Rank.values()[(int) ((Math.random() * 13)) + 1];
        int randRankValue = randRank.getCardValue();
        Suit randSuit = Suit.values()[(int) (Math.random() * 4)];
        return new Card(randSuit, randRank);
    }

    @Override
    public String toString() {
        return "(" + this.suit + ", " + this.rank + ", " + this.getValue() + ")";
    }

    @Override
    public int compareTo(Card o) {
        return this.getValue() - o.getValue();
    }
}
