package OOP.seminar7;

public class Complex {
    private double Rez; // вещественная часть
    private double Imz; // мнимая часть

    Complex() {
        this.Rez = 0;
        this.Imz = 0;
    }

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
        return Rez + " "+ "+" + Imz + "i";
    }

}

class complexOperation {
    private static Complex res = new Complex();

    public static void complexAdd(Complex n1, Complex n2) {
        res.setRez(n1.getRez() + n2.getRez());
        res.setImz(n1.getImz() + n2.getImz());
    }

    public static void complexDiff(Complex n1, Complex n2) {
        res.setRez(n1.getRez() - n2.getRez());
        res.setImz(n1.getImz() - n2.getImz());
    }

    public static void complexMulti(Complex n1, Complex n2) {
        res.setRez((n1.getRez() * n2.getRez()) - (n1.getImz() + n2.getImz()));
        res.setImz((n1.getImz() * n2.getRez()) + (n1.getRez() * n2.getImz()));
    }

    public static void complexDivide(Complex n1, Complex n2) {

    }

    public Complex getResult() {

        return res;
    }

}
