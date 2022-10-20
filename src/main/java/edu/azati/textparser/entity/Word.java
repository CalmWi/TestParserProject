package edu.azati.textparser.entity;

import java.util.ArrayList;

public class Word implements SentenceComponent {
    private StringBuilder word;

    public Word() {
        word = new StringBuilder();
    }

    public StringBuilder getWord() {
        return word;
    }

    public void setWord(StringBuilder word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word.toString();
    }
}
