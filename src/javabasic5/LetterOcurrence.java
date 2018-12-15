package javabasic5;

import java.util.ArrayList;

public class LetterOcurrence {

    private ArrayList<Character> differentLetters ;
    private ArrayList<Integer> differentLetterOcurrence;
    private int size;

    public LetterOcurrence(int size) {
        differentLetterOcurrence = new ArrayList<Integer>();
        differentLetters = new ArrayList<Character>();
        this.size = size;
    }

    public char getDifferentLetterPosition(int position) {
        return differentLetters.get(position);
    }

    public int getDifferentLetterOcurrencePosition(int position) {
        return differentLetterOcurrence.get(position);
    }

    public void fillDifferentLetterOcurrencePosition(int position, int ocurence) {

        differentLetterOcurrence.set(position, ocurence);
    }

    public void fillDifferentLetters(int position, char letter) {
        if(differentLetters.contains(letter)) {
            differentLetters.set(position, letter);
        }
        else {
            differentLetters.add(letter);
        }
    }

    public int getSize() {
        return size;
    }
}
