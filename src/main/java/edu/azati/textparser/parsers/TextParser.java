package edu.azati.textparser.parsers;

import edu.azati.textparser.entity.Paragraph;
import edu.azati.textparser.entity.Text;
import edu.azati.textparser.services.TextService;

public class TextParser {

    public static Text parseText(String str) {
        Text text = new Text();
        String[] strings = str.split("\n");
        for (String s : strings) {
            Paragraph paragraph = ParagraphParser.parseParagraph(s);
            TextService.addParagraph(text, paragraph);
        }
        return text;
    }
}
