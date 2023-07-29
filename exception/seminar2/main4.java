package OOP.exception.seminar2;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {

        getString();

        System.out.println("end");
    }

    static void getString() {
        Scanner scanner = new Scanner(System.in);
        String s = null;
        s = scanner.nextLine();
        if (s.equals("")) {
            throw new IllegalArgumentException("Пустые строки вводить нельзя");
        }
        System.out.println(s.length());

    }

}
