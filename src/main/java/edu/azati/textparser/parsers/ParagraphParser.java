package edu.azati.textparser.parsers;

import edu.azati.textparser.entity.Paragraph;
import edu.azati.textparser.entity.Sentence;
import edu.azati.textparser.services.ParagraphService;

public class ParagraphParser {
    public static Paragraph parseParagraph(String str) {
        Paragraph paragraph = new Paragraph();
        char[] symbols = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == '.' || symbols[i] == '!' || symbols[i] == '?') {
                if (i != symbols.length-2) {
                    stringBuilder.append(symbols[i]);
                    Sentence sentence = SentenceParser.parseSentence(stringBuilder.toString());
                    ParagraphService.addSentence(paragraph, sentence);
                    stringBuilder.setLength(0);
                } else {
                    stringBuilder.append(symbols[i]);
                    stringBuilder.append("\r\n");
                    Sentence sentence = SentenceParser.parseSentence(stringBuilder.toString());
                    ParagraphService.addSentence(paragraph, sentence);
                }
            } else {
                stringBuilder.append(symbols[i]);
            }
        }
        return paragraph;
    }
}
