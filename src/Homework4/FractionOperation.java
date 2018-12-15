package Homework4;

import Homework4.objects.Fraction;

public class FractionOperation {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(28, 56);
        Fraction fraction1 = new Fraction(1,4);
        //System.out.println(fraction.displayFraction());
        //System.out.println("Fractie cu zecimale : " + fraction.displayFractionAsDecimal());

        System.out.println(fraction.sum(fraction1).displayFraction());
    }

}
