package edu.azati.textparser.entity;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<SentenceComponent> sentenceComponents;

    public Sentence() {
        sentenceComponents = new ArrayList<>();
    }

    public ArrayList<SentenceComponent> getSentenceComponents() {
        return sentenceComponents;
    }

    public void setSentenceComponents(ArrayList<SentenceComponent> sentenceComponents) {
        this.sentenceComponents = sentenceComponents;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (SentenceComponent sentenceComp : sentenceComponents) {
            string.append(sentenceComp.toString());
        }
        return string.toString();
    }
}
