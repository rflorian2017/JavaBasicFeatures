package javabasic5.objects;

public class Geometry {
    public static void main(String[] args) {
        Punct p1 = new Punct(4,0);
        Punct p2 = new Punct(2,0);

        Segment segment = new Segment(p1 ,p2);
        System.out.println(segment.myName());

        System.out.println(segment.lungimeSegment());

        Triunghi triunghi = new Triunghi(
                p1,
                p2,
                new Punct(10,20)
        );

        System.out.println(triunghi.Perimetru());

        Patrat patrat = new Patrat(
                p2,
                new Punct(4,7),
                p1,
                new Punct(0, 10)
        );

    }
}
