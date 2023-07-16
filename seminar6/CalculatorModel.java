package OOP.seminar6;

public class CalculatorModel {
    private double res;

    public boolean calc(double a, double b, char o) {
        boolean flag = true;
        switch (o) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                flag = !flag;
        }
        return flag;

    }

    public double getResult() {
        return res;
    }
}
