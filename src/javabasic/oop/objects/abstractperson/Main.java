package javabasic.oop.objects.abstractperson;

import javabasic.oop.objects.abstractperson.model.Female;
import javabasic.oop.objects.abstractperson.model.Male;
import javabasic.oop.objects.abstractperson.model.Person;

public class Main {
    public static void main(String[] args) {
        Male vasile = new Male();
        //Female cristina = new Female();
        Person cristina = new Female();
        cristina.giveName("Cristina");

        System.out.println(cristina.getName());

        //give vasile a name
        vasile.giveName("Vasy");
        System.out.println(vasile.getName());

        Person gheorghe = new Male(55, "Gheorghe");
        System.out.println(gheorghe);

    }
}
