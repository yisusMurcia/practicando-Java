package numOfDigits;

public class Num {
    int num;

    public Num(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNumOfDigit(){
        int numOfDigit = 0;
        while (Math.abs(num) >= 1){
            num /= 10; //Quitarle una cifra
            numOfDigit++;
        }
        return numOfDigit;
    }
}
