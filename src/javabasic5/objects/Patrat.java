package javabasic5.objects;

public class Patrat {
    private Punct p1;
    private Punct p2;
    private Punct p3;
    private Punct p4;

    private Segment s1;
    private Segment s2;
    private Segment s3;
    private Segment s4;

    public Patrat(Punct p1, Punct p2, Punct p3, Punct p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Patrat(Segment s1, Segment s2, Segment s3, Segment s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    public int Perimetru() {
        return s1.lungimeSegment() + s2.lungimeSegment() + s3.lungimeSegment() + s4.lungimeSegment();
    }

    public String myName() {
        return "I am a patrat";
    }
}
