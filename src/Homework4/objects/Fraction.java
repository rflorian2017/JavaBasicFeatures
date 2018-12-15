package Homework4.objects;

public class Fraction {
    private int numarator;
    private int numitor;

    private Fraction() {

    }

    public Fraction(int numarator, int numitor) {
        int cmmdc = cmmdc(numarator, numitor);
        this.numarator = numarator / cmmdc;
        this.numitor = numitor / cmmdc;
    }

    private int cmmdc(int a, int b) {
        if ((a != 0) && (b != 0)) {
            if (a == b) {
                return b;
            } else {
                while (a != b) {
                    if (a > b) {
                        a = a - b;
                    } else {
                        b = b - a;
                    }
                }

            }
        }
        return b;
    }

    public String displayFraction() {
        return this.numarator + "/" + this.numitor;
    }

    public double displayFractionAsDecimal() {
        return (double)numarator / numitor;
    }

    public int getNumarator() {
        return numarator;
    }

    public int getNumitor() {
        return numitor;
    }

    public Fraction sum(Fraction inputFraction) {
        /*
        fractia1 + fractia2
        numarator_fractie1 * numitor_fractie2 + numarator_fractie2 * numitor_fractie1
        /
        numitor_fractie1 * numitor_fractie2
         */
        return new Fraction(this.numarator * inputFraction.getNumitor() + this.numitor * inputFraction.getNumarator(),
                this.numitor * inputFraction.numitor);

    }
}
