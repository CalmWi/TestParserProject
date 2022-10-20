package edu.azati.textparser.entity;

import java.util.ArrayList;

public class Text {
    private ArrayList<Paragraph> paragraphs;

    public Text() {
        paragraphs = new ArrayList<>();
    }

    public ArrayList<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(ArrayList<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Paragraph paragraph : paragraphs) {
            string.append(paragraph.toString());
        }
        return string.toString();
    }
}
