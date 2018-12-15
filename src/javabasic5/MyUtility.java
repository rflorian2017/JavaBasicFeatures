package javabasic5;

public class MyUtility {
    static void calculateLetters(String inputString) {
        //LetterOcurrenceInitial letterOcurrence = new LetterOcurrenceInitial(inputString.lungimeSegment());
        LetterOcurrenceInitial letterOcurrence = new LetterOcurrenceInitial(inputString.length());


        /* de aici, structurile nu mai apar in algoritm */
        int currentPosition;

        // vreau sa tranform sirul in litere mici
        inputString = inputString.toLowerCase();
        /*
        parcurg sirul inputString
                */
        currentPosition = 0;
        for (int i = 0; i < inputString.length(); i++) {

            boolean letterFound = false;
            if ( ( 'a' <= inputString.charAt(i) ) &&
                    ( inputString.charAt(i) <= 'z' ) ) {

                //System.out.println(inputString.charAt(i));
                for (int j = 0; j < letterOcurrence.getSize(); j++) {
                /*daca differentLetters contine litera de pe pozitia curenta
        adaug la differentLetterOcurrence corespunzator literei un 1
        */
                    if (letterOcurrence.getDifferentLetterPosition(j) == inputString.charAt(i)) {
                        letterOcurrence.fillDifferentLetterOcurrencePosition(j, letterOcurrence.getDifferentLetterOcurrencePosition(j) + 1);

                        letterFound = true;
                        // sau puteam direct sa facem differentLetterOcurrence[j]++
                        break; // daca am gasit litera nu are rost sa continuam
                    }

                }

            /*daca nu
        adaug la differentLetters litera de pe pozitia curenta
        adaug la differentLetterOcurrence un 1
        */

                if (!letterFound) {
                    letterOcurrence.fillDifferentLetterOcurrencePosition(currentPosition, 1);
                    letterOcurrence.fillDifferentLetters(currentPosition,  inputString.charAt(i));
                    currentPosition++;
                }
            }

        }

        for (int i = 0; i < letterOcurrence.getSize(); i++) {
            if (letterOcurrence.getDifferentLetterPosition(i) == 0) {
                continue;
            }
            System.out.println("Litera " + letterOcurrence.getDifferentLetterPosition(i) + " apare de "
                    + letterOcurrence.getDifferentLetterOcurrencePosition(i));

        }
    }
}
