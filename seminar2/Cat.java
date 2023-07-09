package OOP.seminar2;

public class Cat implements ClinicInterface, HumanInterface, SelfInterface {
    private String VOICE = "Meow";
    private String name;
    private int age;
    String medhistoru = "";
    String diseases = "";
    private int lastFoodHour = 2;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getVoice() {
        return VOICE;
    }

    @Override
    public void setAge(int a) {
        this.age = a;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String catGreet() {
        return String.format(" Hi i'm %s, my age %d years", name, age);
    }

    @Override
    public void feedPet() {
        System.out.println("Метод кормления кота");
    }

    @Override
    public void touchPet() {
        System.out.println("Погладь кота");
    }


    @Override
    public String medicalHistory() {
        System.out.println("Медицинская история");
        return medhistoru;
    }

    @Override
    public String diseases() {
        return diseases;
    }

    @Override
    public void vaccinated() {
        System.out.println("");;
    }

    public void setLastFoodHour(int lastFoodHour) {
        this.lastFoodHour = lastFoodHour;
    }
    public int getLastFoodHour() {
        return lastFoodHour;
    }




}
