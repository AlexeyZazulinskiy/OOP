package OOP.seminar7;

public class Complex {
    private double Rez;
    private double Imz;

    Complex(double rez, double imz) {
        this.Rez = rez;
        this.Imz = imz;
    }

    public double getImz() {
        return Imz;
    }

    public double getRez() {
        return Rez;
    }

    public void setImz(double imz) {
        Imz = imz;
    }

    public void setRez(double rez) {
        Rez = rez;
    }

    @Override
    public String toString() {
        return Rez + " " + Imz + "i";
    }

}

class complexOperation {
    private static Complex res;

    public static void complexAdd(Complex n1, Complex n2) {

    }

    public static void complexDiff(Complex n1, Complex n2) {

    }

    public static void complexMulti(Complex n1, Complex n2) {

    }

    public static void complexDivide(Complex n1, Complex n2) {

    }

    public static Complex getResult() {

        return res;
    }

}
