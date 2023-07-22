package OOP.seminar7;

public class Main {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        UserView view = new UserView();
        UserInputNumber inputNumber = new UserInputNumber();
        UserInputOperation inputOperation = new UserInputOperation();
        complexOperation operation = new complexOperation();
        CalcPresenter presenter = new CalcPresenter(model, view, inputNumber, inputOperation, operation);

        presenter.calcStart(); // запуск 
    }
}
