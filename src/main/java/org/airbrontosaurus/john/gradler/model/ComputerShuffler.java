package org.airbrontosaurus.john.gradler.model;

import java.util.ArrayList;
import java.util.List;

public class ComputerShuffler implements Shuffler {

    public List<Card> shuffle(List<Card> cards) {
        ArrayList<Card> shuffleDeck = new ArrayList<Card>();
        while (cards.size() > 0) {
            int index = (int) (Math.random() * cards.size());
            shuffleDeck.add(cards.remove(index));
        }
        return shuffleDeck;
    }
}
