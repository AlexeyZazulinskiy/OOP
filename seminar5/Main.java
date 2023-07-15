package OOP.seminar5;

import java.util.Scanner;

    // Модель (Model)
 class CalculatorModel {
private double res;

public void calc(int a, int b, char o) {
                 switch(o){
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
                res = (double)a / b;
                break;
                }

}

public double getResult() {
    return res;
}

}

// Представление (View)
 class CalculatorView {
public void displayResult(double result) {
    if (result % 1 > 0){
System.out.printf("Результат:  %f", result);
    }else{
System.out.printf("Результат: %.0f", result);
    }
}

public int getUserInputNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int input = scanner.nextInt();
    return input;
}

public char getUserOperation(){
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Введите операцию: ");
        String s = scanner.next();
        char c=s.charAt(0);
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

    model.calc(number1, number2, operation);
    double result = model.getResult();

    view.displayResult(result);
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

