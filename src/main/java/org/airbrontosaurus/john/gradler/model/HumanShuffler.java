package org.airbrontosaurus.john.gradler.model;

import java.util.ArrayList;
import java.util.List;

// implementation of Shuffler to simulate a human shuffle
public class HumanShuffler implements Shuffler {

    public List<Card> shuffle(List<Card> cards) {

        // simulate human cutting the deck near the middle
        int split = findSplit(cards.size());
        List<Card> leftHand = new ArrayList<Card>(cards.subList(0, split));
        List<Card> rightHand = new ArrayList<Card>(cards.subList(split, cards.size()));

        // placeholder for shuffled cards
        List<Card> shuffleDeck = new ArrayList<Card>();

        int dropLeft = getZeroOne(); // decide if left or right hand drops into shuffleDeck first
        while (leftHand.size() > 0 && rightHand.size() > 0) { // for 52 cards, there are <52 iterations
            if (dropLeft == 1) {
                shuffleDeck.add(leftHand.remove(0)); // drop left hand card
            }
            else {
                shuffleDeck.add(rightHand.remove(0)); // drop right hand card
            }
            dropLeft = getZeroOne(); // decide if left or right hand drops into shuffleDeck next;
        }
        if (leftHand.isEmpty()) {
            shuffleDeck.addAll(rightHand); // finish emptying right hand
        }
        if (rightHand.isEmpty()) {
            shuffleDeck.addAll(leftHand); // finish emptying left hand
        }

        return shuffleDeck;
    }

    // simulate splitting the deck by a human
    public int findSplit(int size) {
        int split = size / 2; // perfect starting point
        int direction = getLeftRight(); // decide which direction to (possibly) unevenly cutt the deck
        // rand * 2 gets 0/1, * 2 gets 0/2, - 1 gets -1/1...unnecessary, but slick and fun
        int offsetGenerator = getZeroOne();
        while (offsetGenerator > 0) { // decide if we need to offset more
            split += direction; // step the card balance offset by one
            offsetGenerator = getZeroOne();
        }

        return split;
    }

    // returns 0/1
    public static int getZeroOne() {
        return (int) (Math.random() * 2);
    }
    // rand * 2 gets 0/1, * 2 gets 0/2, - 1 gets -1/1...unnecessary, but slick and fun
    public static int getLeftRight() {
        return getZeroOne() * 2 + 1;
    }
}
