package OOP.seminar6;

public class main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        UserView view = new UserView();
        UserInputNumber inputnNumber = new UserInputNumber();
        UserInputOperation inputOperation = new UserInputOperation();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view, inputnNumber, inputOperation);

        presenter.onAddButtonClicked();
    }
}
