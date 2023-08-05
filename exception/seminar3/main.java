package OOP.exception.seminar3;

public class main {
    public static void main(String[] args) {
        model model = new model();
        viev viev = new viev();
        presenter presenter = new presenter(model, viev);

        presenter.startprogram();
    }
}

class exp extends ArithmeticException {


}
