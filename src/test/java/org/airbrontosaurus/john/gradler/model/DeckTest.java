package org.airbrontosaurus.john.gradler.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void testComputerShuffle() {
        Deck deck = new Deck();
        deck.setShuffler(new ComputerShuffler());
        deck.shuffle();
        deck.printDeck();
        assertEquals(deck.getCards().size(), 52);
    }

    @Test
    public void testHumanShuffle() {
        Deck deck = new Deck();
        deck.setShuffler(new HumanShuffler());
        deck.shuffle();
        deck.printDeck();
        assertEquals(deck.getCards().size(), 52);
    }

    @Test
    public void testDeck() {
        Deck deck = new Deck();
        assertEquals(deck.getCards().size(), 52);
    }
}