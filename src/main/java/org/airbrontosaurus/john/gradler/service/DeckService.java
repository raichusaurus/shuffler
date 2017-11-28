package org.airbrontosaurus.john.gradler.service;

import org.airbrontosaurus.john.gradler.database.DatabaseStub;
import org.airbrontosaurus.john.gradler.model.ComputerShuffler;
import org.airbrontosaurus.john.gradler.model.Deck;
import org.airbrontosaurus.john.gradler.model.HumanShuffler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DeckService {
    // database accessor
    private Map<String, Deck> decks = DatabaseStub.getDecks();

    public DeckService() {
        Deck deck = new Deck();
        decks.put(deck.getName(), deck);
    }

    // return a list of all decks
    public List<Deck> getAllDecks() {
        return new ArrayList<Deck>(decks.values());
    }

    // get a deck by name
    public Deck getDeck(String name) {
        return decks.get(name);
    }

    // add a new deck by name
    public Deck addDeck(String name) {

        if (decks.containsKey(name)) {
            return decks.get(name);
        }

        Deck deck = new Deck(name);
        decks.put(name, deck);

        return deck;
    }

    // shuffle deck by name
    public Deck shuffleDeck(String name) {
        Deck deck = decks.get(name);
        if (deck != null) {
            deck.shuffle();
        }
        return deck;
    }

    // modify shuffle algorithm for deck and shuffle it
    public Deck shuffleDeck(String name, String shuffle) {
        Deck deck = decks.get(name);
        if (deck != null) {
            if (shuffle.equalsIgnoreCase("human")) {
                deck.setShuffler(new HumanShuffler());
            }
            else if (shuffle.equalsIgnoreCase("computer")) {
                deck.setShuffler(new ComputerShuffler());
            }
        }
        return shuffleDeck(name);
    }

    // remove deck from stored decks
    public Deck removeDeck(String name) {
        return decks.remove(name);
    }
}
