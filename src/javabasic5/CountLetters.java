package javabasic5;

public class CountLetters {
    public static void main(String[] args) {
        String text = "Santa Claus is coming to town!";
        char[] differentLetters = new char[text.length()];
        int[] letterOcurence = new int[text.length()];

        char[] alfabet = new char[]{'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E',
                'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i=0; i< text.length(); i ++) {
            for (int j = 0; j < alfabet.length; j++) {
                if(alfabet[j] == text.charAt(i)) {
                    for (int k = 0; k < differentLetters.length; k++) {
                        if(differentLetters[k]==alfabet[j]) {
                            letterOcurence[k] ++;
                        }
                        else {
                            differentLetters[k] = alfabet[j];
                            letterOcurence[k] = 1;
                        }
                    }
                }
            }
        }
        System.out.println(text.length());
        for (int i = 0; i < differentLetters.length; i++) {
            System.out.println("Litera " + differentLetters[i] + " apare de " + letterOcurence);
        }

    }
}
