package OOP.seminar4;

public class Main {
    public static void main(String[] args) {
        String s = "str";
        int a = 2;
        double b = 1.2;

        printElement(s);
        printElement(a);
        printElement(b);

        Integer arrInt[] = new Integer[]{1,2,3,4,5,6,7,8,9,0};
        String arrStr[] = new String[]{"q","w","e","r","t","y"};

        printArray(arrInt);
        printArray(arrStr);
    }

    static void printElement(Object o) {

        typeElement<Object> a = new typeElement(o);
    }

    static void printArray(Object[] o){

        typeArray<Object[]> a = new typeArray(o);
    }

}
