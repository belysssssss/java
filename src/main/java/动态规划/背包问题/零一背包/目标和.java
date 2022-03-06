package 动态规划.背包问题.零一背包;
/*
* 给你一个整数数组 nums 和一个整数 target 。

向数组中的每个整数前添加'+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ：

例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，
* 在 1 之前添加 '-' ，然后串联起来得到表达式 "+2-1" 。
返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。
示例 1：
输入：nums = [1,1,1,1,1], target = 3
输出：5
解释：一共有 5 种方法让最终目标和为 3 。
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
示例 2：
输入：nums = [1], target = 1
输出：1
* */
public class 目标和 {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        int target=3;
        int res=findTargetSumWays(arr,target);
        System.out.println(res);
    }
    public static int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        if(target>sum)
            return 0;
        if((target+sum)%2==1)
            return 0;
        int bigSize=(target+sum)/2;
        int[] dp=new int[bigSize+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=0;
        }
        dp[0]=1;
        for(int i=0;i<nums.length;i++){
            for(int j=bigSize;j>=nums[i];j--){
                dp[j]+=dp[j-nums[i]];
            }
        }
        return dp[bigSize];
    }
}
