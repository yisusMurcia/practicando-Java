package squareRoot;

import static java.lang.Math.sqrt;

public class Num {
    double num;
    public Num(double num){
        this.num = num;
    }

    public double getSqrt(){
        return sqrt(num);
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
}
