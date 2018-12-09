package javabasic.oop.objects.humans;

public class Person {
    private int age;
    private boolean isFemale;
    private String name;
    public static int numberOfInstances = 0;

    //constructor of a Person object
    public Person() {
        this.age = 0;
        numberOfInstances++;
    }

    public Person(boolean isFemale) {
        this.isFemale = isFemale;
        numberOfInstances++;
    }

    // a new constructor with all the fields as parameters
    public Person(int age, boolean isFemale, String name) {
        this.age = age;
        this.isFemale = isFemale;
        this.name = name;
        numberOfInstances++;
    }

    //give a name to a person object
    public void giveName(String name) {
        this.name = name;
        //return; // this can be omitted if the return type of the function is void
    }

    //give a first name and last name to a person object
    public void giveName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
        //return; // this can be omitted if the return type of the function is void
    }

    //get the value of the field name  ---getter
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public int getNumberOfInstances() {
        return numberOfInstances;
    }

    @Override
    public String toString() {

        //here I store what I want to return
        String aux = null;

        String femaleOrMale;
        //check if male or female
        if (isFemale == true) {// the same as if(isFemale)
            femaleOrMale = "female";
        } else {
            femaleOrMale = "male";
        }

        aux = "I am " + this.name + "! " +
                "I am a " + femaleOrMale + " and I am " +
                this.age + " years old!";

        //here I return this information
        return aux;
        //return super.toString();
    }

}
