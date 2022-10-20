package edu.azati.textparser.services;

import edu.azati.textparser.entity.Paragraph;
import edu.azati.textparser.entity.Sentence;

public class ParagraphService {
    public static void addSentence(Paragraph paragraph, Sentence sentence) {
        paragraph.getSentences().add(sentence);
    }
}
