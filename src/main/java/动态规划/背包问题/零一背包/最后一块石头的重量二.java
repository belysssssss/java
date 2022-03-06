package 动态规划.背包问题.零一背包;
/*
* 有一堆石头，用整数数组stones 表示。其中stones[i] 表示第 i 块石头的重量。
每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为x 和y，
* 且x <= y。那么粉碎的可能结果如下：
如果x == y，那么两块石头都会被完全粉碎；
如果x != y，那么重量为x的石头将会完全粉碎，而重量为y的石头新重量为y-x。
最后，最多只会剩下一块 石头。返回此石头 最小的可能重量 。如果没有石头剩下，就返回 0。
示例 1：
输入：stones = [2,7,4,1,8,1]
输出：1
解释：
组合 2 和 4，得到 2，所以数组转化为 [2,7,1,8,1]，
组合 7 和 8，得到 1，所以数组转化为 [2,1,1,1]，
组合 2 和 1，得到 1，所以数组转化为 [1,1,1]，
组合 1 和 1，得到 0，所以数组转化为 [1]，这就是最优值。
示例 2：
输入：stones = [31,26,33,21,40]
输出：5
示例 3：
输入：stones = [1,2]
输出：1
* */
public class 最后一块石头的重量二 {
    public static void main(String[] args) {
        int[] stone={31,26,33,21,40};
        int res=lastStoneWeightII(stone);
        System.out.println(res);
    }
    public static int lastStoneWeightII(int[] stones) {
        int[] dp=new int[15001];
        int sum=0;
        for(int i=0;i<dp.length;i++)
            dp[i]=0;
        for(int i:stones)
            sum+=i;
        int target=sum/2;
        for(int i=0;i<stones.length;i++){
            for(int j=target;j>=stones[i];j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return sum-dp[target]*2;
    }
}
