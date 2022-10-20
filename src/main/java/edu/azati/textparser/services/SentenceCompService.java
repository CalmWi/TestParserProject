package edu.azati.textparser.services;

import edu.azati.textparser.entity.Word;
import edu.azati.textparser.entity.enums.TypeSymbol;

public class SentenceCompService {
    public static TypeSymbol findOutTypeSymbol(char symbol) {
        if (Character.isAlphabetic(symbol)) {
            return TypeSymbol.Alphabetic;
        } else if (Character.isDigit(symbol)) {
            return TypeSymbol.Digit;
        } else if (Character.isSpaceChar(symbol)) {
            return TypeSymbol.Space;
        } else return TypeSymbol.Punctuations;
    }

    public static void addSymbolToWord(Word word, char symbol) {
        word.getWord().append(symbol);
    }
}
