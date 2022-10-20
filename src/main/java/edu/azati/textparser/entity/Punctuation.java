package edu.azati.textparser.entity;

import java.util.ArrayList;

public class Punctuation implements SentenceComponent {
    private char punctuations;

    public char getPunctuations() {
        return punctuations;
    }

    public void setPunctuations(char punctuations) {
        this.punctuations = punctuations;
    }

    @Override
    public String toString() {
        return String.valueOf(punctuations);
    }
}
