package sortedNumbers;

import java.util.Arrays;

public class Nums {
    int[] nums;

    public  Nums(int[] nums){
        this.nums = nums;
    }

    public boolean isOrder(){
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        boolean isOrder = true;
        for(int i = 0; i < 3; i++){
            if (sortedNums[i] != nums[i]){
                isOrder = false;
                break;
            }
        }
        return isOrder;
    }

    public boolean areNumsConsecutives(){
        return nums[0] + 1 == nums[1] && nums[1] + 1 == nums[2];
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }
}
