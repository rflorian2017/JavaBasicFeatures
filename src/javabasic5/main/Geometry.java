package javabasic5.main;

import javabasic5.objects.figurigeometrice.FiguriGeometrice;
import javabasic5.objects.figurigeometrice.Patrat;
import javabasic5.objects.figurigeometrice.Triunghi;
import javabasic5.objects.primitives.Punct;
import javabasic5.objects.primitives.Segment;

public class Geometry {
    public static void main(String[] args) {
        Punct p1 = new Punct(4,0);
        Punct p2 = new Punct(2,0);

        Segment segment = new Segment(p1 ,p2);
        System.out.println(segment.myName());

        System.out.println(segment.lungimeSegment());

        FiguriGeometrice triunghi = new Triunghi(
                p1,
                p2,
                new Punct(10,20)
        );

        System.out.println(triunghi.Perimetru());

        FiguriGeometrice patrat = new Patrat(
                p2,
                new Punct(4,7),
                p1,
                new Punct(0, 10)
        );


        //FiguriGeometrice figuraGeometrica = new FiguriGeometrice(p1,p2,new Punct(0,0));
        //System.out.println(figuraGeometrica.Perimetru());
        //System.out.println(figuraGeometrica.Arie());

    }
}
