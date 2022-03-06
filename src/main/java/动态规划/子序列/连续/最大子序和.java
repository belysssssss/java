package 动态规划.子序列.连续;
/*
* 给你一个整数数组 nums ，
* 请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
子数组 是数组中的一个连续部分。
示例 1：
输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：
解释：连续子数组[4,-1,2,1] 的和最大，为6 。
示例 2：
输入：nums = [1]
输出：1
示例 3：
输入：nums = [5,4,-1,7,8]
输出：23
* */
public class 最大子序和 {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int res=maxSubArray(arr);
        System.out.println(res);
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i],nums[i]+dp[i-1]);
            if (result<dp[i])
                result=dp[i];
        }
        return result;
    }
}
