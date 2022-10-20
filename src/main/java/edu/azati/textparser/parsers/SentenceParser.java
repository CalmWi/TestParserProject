package edu.azati.textparser.parsers;

import edu.azati.textparser.entity.Punctuation;
import edu.azati.textparser.entity.Sentence;
import edu.azati.textparser.entity.Space;
import edu.azati.textparser.entity.Word;
import edu.azati.textparser.entity.enums.TypeSymbol;
import edu.azati.textparser.services.SentenceCompService;
import edu.azati.textparser.services.SentenceService;

public class SentenceParser {
    public static Sentence parseSentence(String str) {
        Sentence sentence = new Sentence();
        Word word = new Word();
        char[] symbols = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            TypeSymbol typeSymbol = SentenceCompService.findOutTypeSymbol(symbols[i]);
            if (typeSymbol == TypeSymbol.Alphabetic || typeSymbol == TypeSymbol.Digit) {
                SentenceCompService.addSymbolToWord(word, symbols[i]);
            } else if (typeSymbol == TypeSymbol.Space) {
                Space space = new Space();
                if (i != 0) {
                    if (SentenceCompService.findOutTypeSymbol(symbols[i - 1]) != TypeSymbol.Punctuations) {
                        SentenceService.addCompSentence(sentence, word);
                        word = new Word();
                    }
                }
                SentenceService.addCompSentence(sentence, space);
            } else if (typeSymbol == TypeSymbol.Punctuations) {
                Punctuation punctuation = new Punctuation();
                punctuation.setPunctuations(symbols[i]);
                if (i != 0) {
                    if (SentenceCompService.findOutTypeSymbol(symbols[i - 1]) != TypeSymbol.Space
                            && SentenceCompService.findOutTypeSymbol(symbols[i - 1]) != TypeSymbol.Punctuations) {
                        SentenceService.addCompSentence(sentence, word);
                        word = new Word();
                    }
                }
                SentenceService.addCompSentence(sentence, punctuation);
            }
        }
        return sentence;
    }
}
