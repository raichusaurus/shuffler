package org.airbrontosaurus.john.gradler.model;

import java.util.List;

public interface Shuffler {

    List<Card> shuffle(List<Card> cards);
}
