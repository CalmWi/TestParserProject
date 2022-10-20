package edu.azati.textparser.services;

import edu.azati.textparser.entity.Paragraph;
import edu.azati.textparser.entity.Sentence;
import edu.azati.textparser.entity.Text;

import java.util.ArrayList;

public class TextService {
    public static void addParagraph(Text text, Paragraph paragraph) {
        text.getParagraphs().add(paragraph);
    }

    public static ArrayList<Sentence> task1(Text text, int index) {
        int i = 0;
        ArrayList<Sentence> sentences = new ArrayList<>();
        for (Paragraph paragraph : text.getParagraphs()) {
            for (Sentence sentence : paragraph.getSentences()) {
                if (i % index == index - 1) {
                    sentences.add(sentence);
                }
                i++;
            }
        }
        return sentences;
    }
}
