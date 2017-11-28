package org.airbrontosaurus.john.gradler.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Card {

    private Suit suit;
    private CardValue cardValue;

    public Card() {
    }

    public Card(Suit suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }

    public String toString() {
        return cardValue + "-" + suit;
    }
}
