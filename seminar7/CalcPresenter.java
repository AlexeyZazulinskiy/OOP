package OOP.seminar7;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalcPresenter {
    private CalcModel model;
    private UserView view;
    private UserInputNumber inputNumber;
    private UserInputOperation inputOperation;
    private complexOperation operation;

    public CalcPresenter(CalcModel model, UserView view, UserInputNumber inputNumber,
            UserInputOperation inputOperation, complexOperation operation) {
        this.model = model;
        this.view = view;
        this.inputNumber = inputNumber;
        this.inputOperation = inputOperation;
        this.operation = operation;
    }

    private Complex complexInput() {
        System.out.print("Введите ");
        double real = inputNumber.getData("Вещественную часть ");
        double imag = inputNumber.getData("Мнимую часть ");
        Complex a = new Complex(real, imag);
        return a;
    }

    public void calcStart() {
        Logger calcLog = Logger.getLogger("Calc");
        FileHandler fh;
        try {
            fh = new FileHandler("D:\\GeekBrains\\OOP\\seminar7\\log.txt", true);
            calcLog.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            fh.setFormatter(sf);
        } catch (SecurityException e) {

        } catch (IOException e) {

        }

        Complex a = complexInput();
        calcLog.info("First " + a);
        char o = inputOperation.getData();
        calcLog.info("Operation " + o);
        Complex b = complexInput();
        calcLog.info("Second " + b);
        model.calc(a, b, o);
        if (model.getOperatorError()) {
            view.displayResult(operation.getResult());
            calcLog.info("Result " + operation.getResult());
        } else {
            view.displayError();
            calcLog.warning("OperationError");
        }
    }
}
