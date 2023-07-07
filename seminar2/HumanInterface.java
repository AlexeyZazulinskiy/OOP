package OOP.seminar2;

public interface HumanInterface {
    void feedPet();
    void touchPet();
    default String getVoice(){
        return "Meow";
    };
}
