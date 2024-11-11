package multiplicationTable;


public class MultiplicationTable {
    private int num;
    private final int[] multiplicationTable = new int[10];

    public MultiplicationTable(int num){
        this.num = num;
        setMultiplicationTable();
    }

    private void  setMultiplicationTable(){
        for (int i = 0; i < 10; i++){
            multiplicationTable[i] = num * (i+1);
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        setMultiplicationTable();
    }

    public int[] getMultiplicationTable() {
        return multiplicationTable;
    }
}
