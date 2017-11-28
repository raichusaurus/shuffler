package org.airbrontosaurus.john.gradler.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Deck {

    public String name;
    public List<Card> cards;
    public Shuffler shuffler;

    public Deck() {
        this(false);
        name = "bicycle"; // fun default name
    }

    public Deck(String name) {
        this(false);
        this.name = name;
    }

    private Deck(boolean isEmpty) {
        shuffler = new HumanShuffler();
        cards = new ArrayList<Card>();

        if (!isEmpty) {
            for (Suit suit : Suit.values()) {
                for (CardValue cardValue : CardValue.values()) {
                    cards.add(new Card(suit, cardValue));
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void setShuffler(Shuffler shuffler) {
        this.shuffler = shuffler;
    }

    public void shuffle() {
        cards = shuffler.shuffle(cards); // implementy shuffle algorithm
    }

    public void printDeck() {
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i));
        }
    }
}
