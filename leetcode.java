import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class leetcode {

    public static void main(String[] args) {

    }

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int count = 1;
        int thirdMax = nums[length - 1];

        for(int i = length - 2;i >= 0;i++){
            if(nums[i] != thirdMax){
                thirdMax = nums[i];
                count++;
            }
            if(count == 3){
                return thirdMax;
            }
        }
        return nums[length - 1];
    }


    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int num:nums){
            if(num % 2 == 0){
                list1.add(num);
            }
            else{
                list2.add(num);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        int[] result = new int[nums.length];
        int index = 0;

        for (int num : list1) {
            result[index++] = num;
        }

        for (int num : list2) {
            result[index++] = num;
        }

        return result;
    }
}











