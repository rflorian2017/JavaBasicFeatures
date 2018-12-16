package javabasic5.objects.primitives;

public class Segment {
    private Punct p1;
    private Punct p2;

    public Segment(Punct p1, Punct p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String myName() {
        return "I am a segment";
    }

    //distanta intre doua puncte in spatiu
    //https://sites.google.com/site/eildegez/home/ix/lectia-10/lungimea-unui-segment-ab
    public int lungimeSegment() {
        return (int)Math.sqrt(
                Math.pow(
                        p1.getX() - p2.getX(),
                        2
                )
                        +
                Math.pow(
                        p1.getY() - p2.getY(),
                        2
                )
        );
    }
}
