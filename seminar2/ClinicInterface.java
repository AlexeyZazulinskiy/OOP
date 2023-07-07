package OOP.seminar2;

public interface ClinicInterface {
    default String medicalHistory(){
        return "no med history";
    };
    String diseases();
    void vaccinated();
}
