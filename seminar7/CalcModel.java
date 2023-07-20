package OOP.seminar7;

public class CalcModel {
    private boolean flag = true;

    public void calc(Complex a, Complex b, char o) {
        switch (o) {
            case '+':
                complexOperation.complexAdd(a, b);
                break;
            case '-':
                complexOperation.complexDiff(a, b);
                break;
            case '*':
                complexOperation.complexMulti(a, b);
                break;
            case '/':
                complexOperation.complexDivide(a, b);
                break;
            default:
                flag = !flag;
        }

    }

    public boolean getOperatorError(){
        return flag;
    }
}
