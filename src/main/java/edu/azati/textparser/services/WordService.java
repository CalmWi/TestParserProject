package edu.azati.textparser.services;

import edu.azati.textparser.entity.Word;

public class WordService {
    public static void swapSymbol(Word word ){
        StringBuilder stringBuilder = word.getWord();
        char start = stringBuilder.charAt(0);
        char end = stringBuilder.charAt(stringBuilder.length()-1);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.insert(0,end);
        stringBuilder.append(start);
    }

}
