package javabasic.oop.objects;

import javabasic.oop.objects.humans.Person;

public class Main {
    public static void main (String[] args) {
        Person aPerson = new Person();

        //if we print the name before giving the property name a value, it will return nothing => null
        System.out.println(aPerson.getName());
        // change the name of aPerson
        aPerson.giveName("John Doe");

        //get the name of aPerson
        String aPersonsName = aPerson.getName();

        //print the name
        System.out.println(aPersonsName);

        //age before growing
        System.out.println("age before growing: " + aPerson.getAge());

        aPerson.setAge(aPerson.getAge()+1);

        //age after growing
        System.out.println("age after growing: " + aPerson.getAge());

        //create a new person
        Person aNewPerson =
                new Person(23, true, "Jane Doe");
        System.out.println(aNewPerson.getName());

        //give a new name using the other give name method that accepts two parameters
        aNewPerson.giveName("Joanna", "Kathrine");
        System.out.println(aNewPerson.getName());

        //an array of Persons !!!
        Person[] persons = new Person[8];
        persons[0] = new Person();
        persons[1] = new Person(10, false, "Ion");
        //persons[2].setAge(2); //person from postion 2 is not created
        //persons[2].giveName("Maria"); //person from postion 2 is not created

        System.out.println(aPerson.toString());
        System.out.println(aNewPerson);


    }
}
