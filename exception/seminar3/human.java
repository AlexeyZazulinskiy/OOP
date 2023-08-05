package OOP.exception.seminar3;

public class human {
    private static String firstName;
    private static String lastName;
    private static String birthday;
    private static String phoneNumber;
    private static String gender;

    public static void setFirstName(String fName) {
        firstName = fName;
    }

    public static void setLastName(String lName) {
        lastName = lName;
    }

    public static void setBirthday(String bday) {
        birthday = bday;
    }

    public static void setPhoneNumber(String pNumber) {
        phoneNumber = pNumber;
    }

    public static void setGender(String g) {
        gender = g;
    }
    public static String getLastName(){
        return lastName;
    }

    public static String getHuman() {
        return lastName + " " + firstName + " " + birthday + " " + phoneNumber + " " + gender;
    }
}
