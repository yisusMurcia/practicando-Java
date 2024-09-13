package miNumero;

public class MyNumero {
    private int num;
    public MyNumero(){
        num = 0;
    }

    public MyNumero(int num){
        this.num = num;
    }

    public int getValor() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getMultipler(int num){
        return this.num * num;
    }

    public int addNUm(int num){
        return this.num + num;
    }

    public int  subtractNumber(int num){
        return this.num - num;
    }
}
