package OOP.seminar2;

public interface SelfInterface {

    public int getAge(); 

    public String getName();

    default String getVoice(){
        return "Meow";
    };

    public void setAge(int a);

    public void setName(String name);

}
