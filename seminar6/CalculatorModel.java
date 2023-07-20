package OOP.seminar6;


/* CalculatorModel  */
public class CalculatorModel {
    private double res;
    private boolean flag = true;

    /* из метода calc выделяем методы getResult и gretOperatorError */
    public void calc(double a, double b, char o) {
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

    }

    public double getResult() {
        return res;
    }

    public boolean getOperatorError(){
        return flag;
    }
}
