package org.airbrontosaurus.john.gradler.model;

public enum Suit {

    SPADE, CLUB, DIAMOND, HEART;

    @Override
    public String toString() {

        switch (this) {
            case SPADE:
                return "Spade";
            case CLUB:
                return "Club";
            case DIAMOND:
                return "Diamond";
            case HEART:
                return "Heart";
            default:
                return "Joker";
        }
    }
}
