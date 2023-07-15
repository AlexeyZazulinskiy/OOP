package OOP.seminar5;

import java.util.Scanner;

// Модель (Model)
class CalculatorModel {
    private double res;

    public boolean calc(int a, int b, char o) {
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
                res = (double) a / b;
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

// Представление (View)
class CalculatorView {
    public void displayResult(double result) {
        if (result % 1 > 0) {
            System.out.printf("Результат:  %.2f", result);
        } else {
            System.out.printf("Результат: %.0f", result);
        }
    }

    public void displayError(){
        System.out.println("Неверная операция");
    }

    public int getUserInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int i;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        } else {
            System.out.print("Ошибка, ");
            scanner.next();
            i = getUserInputNumber();
        }
        return i;
    }

    public char getUserOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операцию: ");
        String s = scanner.next();
        char c = s.charAt(0);
        return c;
    }

}

// Презентер (Presenter)
class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        int number1 = view.getUserInputNumber();
        char operation = view.getUserOperation();
        int number2 = view.getUserInputNumber();

        if (model.calc(number1, number2, operation)){
            double result = model.getResult();
            view.displayResult(result);
        }else {
            view.displayError();
        }
        

        
    }

}

// Главный класс приложения
public class Main {
    public static void main(String[] args) {

        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        presenter.onAddButtonClicked();
    }
}
