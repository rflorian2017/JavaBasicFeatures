package javabasic.oop.objects.abstractperson.model;

public class Male extends Person {
    public Male() {
        super(false); // like as you call new Person(false)
    }

    public Male(int age, String name) {
        super(age, false, name);
    }
}
