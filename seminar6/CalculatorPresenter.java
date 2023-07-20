package OOP.seminar6;

/* calculatorPresenter */
class CalculatorPresenter {
    private CalculatorModel model;
    private UserView view;
    private UserInputNumber inputNumber;
    private UserInputOperation inputOperation;
    private double number1;
    private char operation;
    private double number2;

    public CalculatorPresenter(CalculatorModel model, UserView view, UserInputNumber inputNumber,
            UserInputOperation inputOperation) {
        this.model = model;
        this.view = view;
        this.inputNumber = inputNumber;
        this.inputOperation = inputOperation;
    }

    /* отделяем от onbuttonClicker метод calculation */

    public void onButtonClicked() {
        number1 = inputNumber.getData();
        operation = inputOperation.getData();
        number2 = inputNumber.getData();
    }

    public void calculation() {
        model.calc(number1, number2, operation);
        if (model.getOperatorError()) {
            view.displayResult(model.getResult());
        } else {
            view.displayError();
        }
    }
}