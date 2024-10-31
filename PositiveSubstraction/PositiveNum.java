package PositiveSubstraction;

public class PositiveNum {
    private int num;
    public  PositiveNum(int num){
        this.num = Math.abs(num);
    }

    public int getNum() {
        return num;
    }
}
