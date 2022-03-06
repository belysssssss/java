package 贪心;

import java.util.Arrays;

/*
* 给你一个整数数组 nums,
* 你需要找出一个 连续子数组 ，
* 如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
请你找出符合题意的最短子数组，并输出它的长度。
示例 1：
输入：nums = [2,6,4,8,10,9,15]
输出：5
解释：你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
示例 2：
输入：nums = [1,2,3,4]
输出：0
示例 3：
输入：nums = [1]
输出：0
*
* */
public class 最短无序子数组 {
    public static void main(String[] args) {
        int[] arr={2,6,4,8,10,9,15};
        int res=findUnsortedSubarray(arr);
        System.out.println(res);
    }
    public static int findUnsortedSubarray(int[] nums) {
        if(isSorted(nums)){
            return 0;
        }
        int[] numsSorted=new int[nums.length];
        System.arraycopy(nums,0,numsSorted,0,nums.length);
        Arrays.sort(numsSorted);
        int left=0;
        while(nums[left]==numsSorted[left]){
            left++;
        }
        int right=nums.length-1;
        while(nums[right]==numsSorted[right]){
            right--;
        }
        return right-left+1;
    }

    private static boolean isSorted(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1])
                return false;
        }
        return true;
    }
}
