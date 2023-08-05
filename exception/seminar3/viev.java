package OOP.exception.seminar3;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class viev {
    static String userEnter() { // последовательность имя - фамилия определяестся автоатически через функцию
                                // заглушку getNameFromDB() первым определяется имя, вторым фамилия
        // return "89283635799 f 22.12.1991 asasas bnbnbn";
        // return "89283630789 f 22.12.1991 asasaos bnbnbn";
        return "asfas bnbnbn 12.12.1213 81231231212 m";
    }

    static void saveToFile() {

        try (FileWriter writer = new FileWriter(human.getLastName() + ".txt", true)) {
            writer.write(human.getHuman() + "\n");
        } catch (FileNotFoundException e) {
            System.out.println("Фаил не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка записи");
            e.printStackTrace();
        }

    }
}
