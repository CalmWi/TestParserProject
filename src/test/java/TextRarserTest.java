import edu.azati.textparser.entity.Paragraph;
import edu.azati.textparser.entity.Sentence;
import edu.azati.textparser.entity.Text;
import edu.azati.textparser.entity.Word;
import edu.azati.textparser.parsers.SentenceParser;
import edu.azati.textparser.parsers.TextParser;
import edu.azati.textparser.services.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TextRarserTest {
    private String path = "Text.txt";
    private Text text;

    @Before
    public void textParserTest() {
        String string = null;
        try {
            string = FileService.readFile(String.valueOf(Paths.get(getClass().getResource(path).toURI())), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        text = TextParser.parseText(string);
        Assert.assertEquals(text.toString(), string);
    }

    @Test
    public void task1Test() {
        ArrayList<Sentence> sentences = TextService.task1(text,2);
        for(Sentence sentence:sentences){
            WordService.swapSymbol(SentenceService.getWordByIndex(sentence,2));
        }
        System.out.println(text);
    }

    @Test
    public void task2Test() {
        ArrayList<Sentence> sentences = TextService.task1(text,3);
        for (Sentence sentence : sentences){
            SentenceService.reverseSentence(sentence);
        }
        System.out.println(text);
    }
    @Test
    public void task3Test(){
        for(Paragraph paragraph:text.getParagraphs()){
            for (Sentence sentence:paragraph.getSentences()){
                Word word = SentenceService.getWordByIndex(sentence,3);
                StringBuilder stringBuilder = new StringBuilder("OOO");
                word.setWord(stringBuilder);
            }
        }
        System.out.println(text);
    }
    @Test
    public void task4Test(){
        int a = 2;
        int b = 3;
        System.out.println("a = " + a + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + " b = " + b);
    }
}
