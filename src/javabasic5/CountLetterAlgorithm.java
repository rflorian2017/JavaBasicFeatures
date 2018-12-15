package javabasic5;

public class CountLetterAlgorithm {
    public static void main(String[] args) {
        String inputString = "Santa Claus is coming to town!";
        char[] differentLetters = new char[inputString.length()];
        int[] differentLetterOcurrence = new int[inputString.length()];

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
            if (('a' <= inputString.charAt(i)) && (inputString.charAt(i) <= 'z')) {

                //System.out.println(inputString.charAt(i));
                for (int j = 0; j < differentLetters.length; j++) {
                /*daca differentLetters contine litera de pe pozitia curenta
        adaug la differentLetterOcurrence corespunzator literei un 1
        */
                    if (differentLetters[j] == inputString.charAt(i)) {
                        differentLetterOcurrence[j] = differentLetterOcurrence[j] + 1;
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
                    differentLetterOcurrence[currentPosition] = 1;
                    differentLetters[currentPosition] = inputString.charAt(i);
                    currentPosition++;
                }
            }

        }

        for (int i = 0; i < differentLetters.length; i++) {
            if (differentLetters[i] == 0) {
                continue;
            }
            System.out.println("Litera " + differentLetters[i] + " apare de "
                    + differentLetterOcurrence[i]);

        }

    }
}
