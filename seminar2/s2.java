package OOP.seminar2;

import java.util.*;

public class s2 {
    public static void main(String[] args) {

        Cat bars = new Cat("bars", 3); // Создаем котов
        Cat myrzik = new Cat("myrzik", 2);
        Cat klyaksa = new Cat("klyaksa", 4);

        ArrayList<Cat> catsList = new ArrayList<Cat>(); // Заполняем список
        catsList.add(bars);
        catsList.add(myrzik);
        catsList.add(klyaksa);

        bars.setLastFoodHour(1); // Часы с последнего кормления
        myrzik.setLastFoodHour(2);
        klyaksa.setLastFoodHour(3);

        for (Cat cat : catsList) {
            System.out.print(cat.getName());
            Predicate<Integer> foodTime = x -> x > cat.getLastFoodHour();
            if (foodTime.timeToFoodCat(2)) {
                System.out.println(" - Кот накормлен");
            } else {
                System.out.println(" - Пора кормить");
                cat.setLastFoodHour(0);
            }
        }
    }
}
