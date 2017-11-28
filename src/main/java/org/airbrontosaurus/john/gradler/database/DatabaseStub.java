package org.airbrontosaurus.john.gradler.database;

import org.airbrontosaurus.john.gradler.model.Deck;

import java.util.HashMap;
import java.util.Map;

// stub for actual database, while example keeps objects in memory
public class DatabaseStub {

    private static Map<String, Deck> decks = new HashMap<>();

    public static Map<String, Deck> getDecks() {
        return decks;
    }
}
