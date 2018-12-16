package javabasic5.objects.figurigeometrice;

import javabasic5.objects.primitives.Punct;
import javabasic5.objects.primitives.Segment;

public class Patrat extends FiguriGeometrice {
    private Punct p4;

    private Segment s4;

    public Patrat(Punct p1, Punct p2, Punct p3, Punct p4) {
        super(p1,p2,p3);
        this.p4 = p4;

        s3 = new Segment(p3,p4);
        s4 = new Segment(p4,p1);
    }

    public Patrat(Segment s1, Segment s2, Segment s3, Segment s4) {
        super(s1,s2,s3);
        this.s4 = s4;
    }

    @Override
    public int Perimetru() {
        return super.Perimetru() + s4.lungimeSegment();
    }

    @Override
    public int Arie() {
        return super.s1.lungimeSegment() * s2.lungimeSegment();
    }

    public String myName() {
        return "I am a patrat";
    }


}
