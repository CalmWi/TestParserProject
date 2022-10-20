package edu.azati.textparser.entity;

import java.util.ArrayList;

public class Paragraph {
    private ArrayList<Sentence> sentences;

    public Paragraph() {
        sentences = new ArrayList<>();
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(ArrayList<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Sentence sentence : sentences) {
            string.append(sentence.toString());
        }
        return string.toString();
    }
}
