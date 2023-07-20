package OOP.seminar7;

import OOP.seminar6.CalculatorModel;

public class CalculatorPresenter {
    private CalcModel model;
    private UserView view;
    private UserInputNumber inputNumber;
    private UserInputOperation inputOperation;
    private complexOperation operation;
    private double real;
 
    private double imag;

    public CalculatorPresenter(CalcModel model, UserView view, UserInputNumber inputNumber,
            UserInputOperation inputOperation, complexOperation operation) {
        this.model = model;
        this.view = view;
        this.inputNumber = inputNumber;
        this.inputOperation = inputOperation;
        this.operation = operation;
    }

    /* отделяем от onbuttonClicker метод calculation */

    private Complex complexInput() {
        real = inputNumber.getData();
        imag = inputNumber.getData();
       // operation = inputOperation.getData();
       Complex a = new Complex(real, imag);
        return a;
    }

    public void calculation() {
        Complex a = complexInput();
        char o = inputOperation.getData();
        Complex b = complexInput();        
        model.calc(a, b, o);
        if (model.getOperatorError()) {
            view.displayResult(operation.getResult());
        } else {
            view.displayError();
        }
    }
}

