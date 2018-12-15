package javabasic5;

 public class LetterOcurrenceInitial {

    private char[] differentLetters ;
    private int[] differentLetterOcurrence;
    private int size;

    public LetterOcurrenceInitial(int size) {
        differentLetterOcurrence = new int[size];
        differentLetters = new char[size];
        this.size = size;
    }

    public char getDifferentLetterPosition(int position) {
        return differentLetters[position];
    }

    public int getDifferentLetterOcurrencePosition(int position) {
        return differentLetterOcurrence[position];
    }

    public void fillDifferentLetterOcurrencePosition(int position, int ocurence) {
        differentLetterOcurrence[position] = ocurence;
    }

    public void fillDifferentLetters(int position, char letter) {
        differentLetters[position] = letter;
    }

    public int getSize() {
        return size;
    }
}
