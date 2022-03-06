package 动态规划.背包问题.零一背包;
/*
* 给你一个 只包含正整数的非空数组
* nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
示例 1：
输入：nums = [1,5,11,5]
输出：true
解释：数组可以分割成 [1, 5, 5] 和 [11] 。
示例 2：
输入：nums = [1,2,3,5]
输出：false
解释：数组不能分割成两个元素和相等的子集。
* */
public class 分割等和子集 {
    public static void main(String[] args) {
        int[] arr={1,5,11,5};
        boolean b=canPartition(arr);
        System.out.println(b);
    }
    public static boolean canPartition(int[] nums) {
        int[] dp=new int[20001];
        int sum=0;
        for(int i=0;i<dp.length;i++){
            dp[i]=0;
        }
        for(int i:nums){
            sum+=i;
        }
        if(sum%2==1)
            return false;
        int target=sum/2;
        for(int i=0;i<nums.length;i++){
            for(int j=target;j>=nums[i];j--){
                dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }
        if(dp[target]==target)
            return true;
        return false;
    }
}
