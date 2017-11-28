package org.airbrontosaurus.john.gradler.resource;

import org.airbrontosaurus.john.gradler.model.Deck;
import org.airbrontosaurus.john.gradler.service.DeckService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/decks")
@Produces(MediaType.APPLICATION_JSON)
public class DeckResource {

    private static DeckService deckService = new DeckService();

    // return a list of all decks stored in system
    @GET
    public List<Deck> getAllDecks() {
        return deckService.getAllDecks();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    return "Got it!";
}

    // return a specific deck
    @GET
    @Path("/{deck}")
    public Deck getDeck(@PathParam("deck") String name) {
        return deckService.getDeck(name);
    }

    // create a new deck with parameterized name, unless there is already a deck with that name
    @PUT
    @Path("/{deck}")
    public Deck addDeck(@PathParam("deck") String name) {
        return deckService.addDeck(name);
    }

    // shuffle existing deck, do nothing if deck does not already exist
    @POST
    @Path("/{deck}")
    public Deck shuffleDeck(@PathParam("deck") String name) {
        return deckService.shuffleDeck(name);
    }

    // modify shuffle algorithm and shuffle existing deck, do nothing if deck does not already exist
    @POST
    @Path("/{deck}/{shuffle}")
    public Deck modifyShuffle(@PathParam("deck") String name, @PathParam("shuffle") String shuffle) {
        return deckService.shuffleDeck(name, shuffle);
    }

    // delete existing deck
    @DELETE
    @Path("/{deck}")
    public Deck removeDeck(@PathParam("deck") String name) {
        return deckService.removeDeck(name);
    }
}
