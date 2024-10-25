package positiveOrNegative;

public class Num {
    private int num;

    public Num(int num){
        this.num = num;
    }

    public String isPositiveOrNegative(){ //Indica si es positivo o negativo
        String string;

        if(num > 0){
            string = "positive";
        }else if(num < 0){
            string = "negative";
        }else{
            string = "zero";
        }

        return string;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
