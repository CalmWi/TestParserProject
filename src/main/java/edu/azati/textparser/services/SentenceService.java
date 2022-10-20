package edu.azati.textparser.services;

import edu.azati.textparser.entity.*;

import java.util.ArrayList;

public class SentenceService {
    public static void addCompSentence(Sentence sentence, SentenceComponent sentenceComponent) {
        sentence.getSentenceComponents().add(sentenceComponent);
    }

    public static Word getWordByIndex(Sentence sentence, int index) {
        int i = 0;
        for (SentenceComponent sentenceComponent : sentence.getSentenceComponents()) {
            if (sentenceComponent instanceof Word) {
                if (i == index) {
                    return (Word) sentenceComponent;
                }
                i++;
            }
        }
        return null;
    }

    public static void reverseSentence(Sentence sentence) {
        ArrayList<SentenceComponent> newSentenceComps = new ArrayList<>();
        for (int i = sentence.getSentenceComponents().size() - 1; i >= 0; i--) {
            if(sentence.getSentenceComponents().get(i)instanceof Word){
                ((Word) sentence.getSentenceComponents().get(i)).getWord().reverse();
            }
            newSentenceComps.add(sentence.getSentenceComponents().get(i));
        }
        sentence.setSentenceComponents(newSentenceComps);
    }
}
