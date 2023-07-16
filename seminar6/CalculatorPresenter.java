package OOP.seminar6;

class CalculatorPresenter {
    private CalculatorModel model;
    private UserView view;
    private UserInputNumber inputNumber;
    private UserInputOperation inputOperation;

    public CalculatorPresenter(CalculatorModel model, UserView view, UserInputNumber inputNumber, UserInputOperation inputOperation) {
        this.model = model;
        this.view = view;
        this.inputNumber = inputNumber;
        this.inputOperation = inputOperation;
    }

    public void onAddButtonClicked() {
        double number1 =  inputNumber.getData();
        char operation =  inputOperation.getData();
        double number2 =  inputNumber.getData();

        if (model.calc(number1, number2, operation)){
            double result = model.getResult();
            view.displayResult(result);
        }else {
            view.displayError();
        }
    }
}