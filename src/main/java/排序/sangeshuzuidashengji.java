package 排序;

import java.util.Arrays;

public class sangeshuzuidashengji {
    public static void main(String[] args) {
        int[] nums={-4,-3,-2,-1,60};
        int res=maximumProduct(nums);
        System.out.println(res);
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       int n=nums.length;
        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
    }
}
