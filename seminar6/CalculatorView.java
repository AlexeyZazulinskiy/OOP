package OOP.seminar6;

import java.util.Scanner;

/*
 *  Разделяем класс View на userView, userInputNumber и userInputOperation
 */

class UserView  {
    public void displayResult(double result) {
        if (result % 1 > 0) {
            System.out.printf("Результат:  %.2f", result);
        } else {
            System.out.printf("Результат: %.0f", result);
        }
    }

    public void displayError() {
        System.out.println("Неверная операция");
    }
}

class UserInputNumber {

    public double getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double i;
        if (scanner.hasNextDouble()) {
            i = scanner.nextDouble();
        } else {
            System.out.print("Ошибка, ");
            scanner.next();
            i = (double) getData();
        }
        return i;
    }
}

class UserInputOperation {

    public char getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операцию: ");
        String s = scanner.next();
        char c = s.charAt(0);
        return c;
    }
}
