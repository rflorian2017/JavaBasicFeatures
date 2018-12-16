package javabasic5.objects.figurigeometrice;

import javabasic5.objects.primitives.Punct;
import javabasic5.objects.primitives.Segment;

public class Triunghi extends FiguriGeometrice {

    public Triunghi(Punct p1, Punct p2, Punct p3) {
        super(p1,p2,p3);
        s3 = new Segment(p3,p1);
    }

    public Triunghi(Segment s1, Segment s2, Segment s3) {
        super(s1,s2,s3);
    }

    public String myName() {
        return "I am a triunghi";
    }

    @Override
    public int Arie() {
        return s1.lungimeSegment() * s2.lungimeSegment()/2;
    }

    public boolean isTriunghi() {
        // metoda care verifica daca figura definita de 3 puncte e triunghi
        return false;
    }
}
