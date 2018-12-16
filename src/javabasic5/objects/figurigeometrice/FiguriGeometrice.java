package javabasic5.objects.figurigeometrice;

import javabasic5.objects.primitives.Punct;
import javabasic5.objects.primitives.Segment;

abstract public class FiguriGeometrice {
    protected Punct p1;
    protected Punct p2;
    protected Punct p3;

    protected Segment s1;
    protected Segment s2;
    protected Segment s3;

    public FiguriGeometrice(Punct p1, Punct p2, Punct p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        this.s1 = new Segment(p1,p2);
        this.s2 = new Segment(p2,p3);
    }

    public FiguriGeometrice(Segment s1, Segment s2, Segment s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public int Perimetru() {
        return s1.lungimeSegment() + s2.lungimeSegment() + s3.lungimeSegment();
    }

    abstract protected int Arie() ;
}
