package evensBetweenNums;

import java.util.ArrayList;
import java.util.List;

public class BetweenNums {
    private int startNum;
    private int finalNum;

    public BetweenNums(int num1, int num2){
        startNum = Math.min(num1, num2);
        finalNum = Math.max(num1, num2);
    }

    public List<Integer> getEvenNumsBetween(){
         List<Integer> nums = new ArrayList<>();
        for (int i = (startNum % 2 == 0? startNum: startNum + 1); i <= finalNum; i+= 2){//Iniciar por números pares
            nums.add(i);
        }
        return nums;
    }

    public void setNums(int num1, int num2){
        startNum = Math.min(num1, num2);
        finalNum = Math.max(num1, num2);
    }

    public int getStartNum() {
        return startNum;
    }

    public int getFinalNum() {
        return finalNum;
    }
}
