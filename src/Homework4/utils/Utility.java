package Homework4.utils;

public class Utility {
    public static String digitsOfNumber(int number) {
        String digits = "";
//        while(number > 0) {
//            digits = digits + (number % 10) + " ";
//            number = number / 10;
//        }

//        do {
//            digits = (number % 10) + " " + digits;
//            number = number / 10;
//        }
//        while (number > 0) ;

        for(/* aici poate fi gol */; number > 0 ; number = number/10 ) {
            digits = (number % 10) + " " + digits;
        }

        return digits;
    }
}
