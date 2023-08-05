package OOP.exception.seminar3;

public class model {
    boolean boolName = false; // для заглушки базы имен
    human h = new human();

    public int splitter(String inpS) {
        int dataCount = 0;
        String[] s = inpS.split(" ");
        if (s.length < 5)
            return -1; // проверка на количество введеных данных
        else if (s.length > 5)
            return -2;

        for (int j = 0; j < s.length; j++) {
            int i = decoder(s[j]);
            switch (i) {
                case 0:
                    human.setFirstName(s[j]);
                    dataCount++;
                    break;
                case 1:
                    human.setLastName(s[j]);
                    dataCount++;
                    break;
                case 2:
                    human.setBirthday(s[j]);
                    dataCount++;
                    break;
                case 3:
                    human.setPhoneNumber(s[j]);
                    dataCount++;
                    break;
                case 4:
                    human.setGender(s[j]);
                    dataCount++;
                    break;
            }
        }
        ceckDataCount(dataCount);
        return 1;
    }

    private int decoder(String s) {
        // 0 lname 1 fname 2 bdata 3 pnum 4 gender -1 data error
        String num = "\\d+";
        String num2 = "\\d+.\\d+.\\d+";
        String abc = "[a-zA-Z]+";
        String g = "[mfMF]";
        String ch = "[/*-+,.?@#$%^!&();:]";
        if (s.length() == 1 && s.matches(g)) {
            return 4;
        } else if (s.matches(num2) && s.length() == 10 && !s.matches(abc) && !s.matches(ch)) { // дата рождения
            return 2;
        } else if (s.matches(num) && s.length() == 11 && !s.matches(ch) && !s.matches(abc)) { // номер телефона
            return 3;
        } else if (s.length() > 1 && s.matches(abc) && getNameFromDB() && !s.matches(num) && !s.matches(ch)) { // фамилия
            return 0;
        } else if (s.length() > 1 && s.matches(abc) && getNameFromDB() && !s.matches(num) && !s.matches(ch)) { // имя
            return 1;
        }
        return -1;
    }

    private void ceckDataCount(int a) {
        if (a < 5)
            throw new IllegalArgumentException("Ошибка в введенных данных");
    }

    public boolean getNameFromDB() { // заглушка базы имен
        boolName = !boolName;
        return boolName;
    }

}
