package OOP.exception.seminar3;

public class presenter {

    private model pmodel;
    private viev pviev;

    public presenter(model pmodel, viev pviev) {
        this.pmodel = pmodel;
        this.pviev = pviev;
    }

    public void startprogram() {
        String s = pviev.userEnter();
        int i = pmodel.splitter(s);
        if (i == -1) throw new IllegalArgumentException("Введено недостаточно данных"); 
        if (i == -2) throw new IllegalArgumentException("Введены лишние данные");
        pviev.saveToFile();
    }
}

