package 数组leetcode.Nov.first;

import java.util.Arrays;

public class 第三大的数 {
    public static void main(String[] args) {
     int nums[]={2,2,2,3,1};
     int arr=thirdMax(nums);
        System.out.println(arr);
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i=2;
        int n=nums.length;
        if(nums.length<3)
            return nums[n-1];
        while(i<n&&nums[i]==(nums[i-1])){
            i++;
        }
        return nums[n-i-1];
    }
}
