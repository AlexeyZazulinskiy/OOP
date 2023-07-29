package OOP.exception.seminar2;

import java.util.Scanner;

//                                              Задание 1
public class main1 {
    public static void main(String[] args) {
        System.out.println(getFloat());
    }

    static float getFloat() {
        Scanner scanner = new Scanner(System.in);
        float i;
        System.out.println("Введите дробное число: ");
        if (scanner.hasNextFloat()) {
            i = scanner.nextFloat();
        } else {
            System.out.print("Ошибка, ");
            scanner.next();
            i = getFloat();
        }
        return i;
    }
}
