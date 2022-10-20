package edu.azati.textparser.entity;

public class Space implements SentenceComponent {
    private final char space = ' ';

    public char getSpace() {
        return space;
    }

    @Override
    public String toString() {
        return String.valueOf(space);
    }
}
