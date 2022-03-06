package 排序;

import java.util.Arrays;

public class 数组拆分 {
    public static void main(String[] args) {
     int[] nums={4,3,2,1};
     int res=arrayPairSum(nums);
        System.out.println(res);
    }
    public static  int arrayPairSum(int[] nums) {
        int num=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            num+=nums[i];
        }
        return num;
    }
}
