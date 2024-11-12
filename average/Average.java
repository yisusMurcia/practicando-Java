package average;

import java.util.ArrayList;
import java.util.List;

public class Average {
    private double average;
    private List<Integer> nums;

    public Average(){
        nums = new ArrayList<>();
    }

    public void addNum(int num){
        nums.add(num);
    }

    public void setAverage(){
        average = 0; //resetear el valor del promedio
        for (int num : nums){
            average += num;
        }
        average /= nums.isEmpty()? 1: nums.size();//Evitar división por 0
    }

    public double getAverage(){
        return average;
    }

    public void clearNums(){
        nums = new ArrayList<>();
    }
}
