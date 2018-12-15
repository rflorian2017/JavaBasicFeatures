package javabasic5.objects;

public class Triunghi extends FiguriGeometrice {

    public Triunghi(Punct p1, Punct p2, Punct p3) {
        super(p1,p2,p3);
    }

    public Triunghi(Segment s1, Segment s2, Segment s3) {
        super(s1,s2,s3);
    }

    public String myName() {
        return "I am a triunghi";
    }
}
