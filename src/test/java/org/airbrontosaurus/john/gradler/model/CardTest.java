package org.airbrontosaurus.john.gradler.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    @Test
    public void TestToString() {
        for (Suit suit : Suit.values()) {
            for (CardValue cardValue : CardValue.values()) {
                Card card = new Card(suit, cardValue);
                assertEquals(cardValue + "-" + suit, card.toString());
                System.out.println(card);
            }
        }
    }
}