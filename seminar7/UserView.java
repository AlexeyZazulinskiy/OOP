package OOP.seminar7;

import java.util.Scanner;

public class UserView {
        public void displayResult(Complex result) {
            System.out.println(result);
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
