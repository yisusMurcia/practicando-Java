package decimalPart;

public class Num {
    private double num;
    private int intNum;

    public Num(double num){
        this.num = num;
        setIntNum();
    }

    public void setIntNum() {
        intNum = (int) Math.round(num);
    }

    public boolean isWholeNum(){
        return num == intNum;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
        setIntNum();
    }
}
