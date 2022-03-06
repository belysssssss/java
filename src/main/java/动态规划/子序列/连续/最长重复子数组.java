package 动态规划.子序列.连续;
/*
* 给两个整数数组nums1和nums2，
* 返回 两个数组中 公共的 、长度最长的子数组的长度。
示例 1：
输入：nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
输出：3
解释：长度最长的公共子数组是 [3,2,1] 。
示例 2：
输入：nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
输出：5
* */
public class 最长重复子数组 {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        int[] array={3,2,1,4,7};
        int res=findLength(arr,array);
        System.out.println(res);
    }
    public static int findLength(int[] nums1, int[] nums2) {
        int[][] dp=new int[nums1.length+1][nums2.length+1];
        int result=0;
        for(int i=0;i<nums1.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<nums2.length;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=nums1.length;i++){
            for(int j=1;j<=nums2.length;j++){
                if(nums1[i-1]==nums2[j-1])
                    dp[i][j]=dp[i-1][j-1]+1;
                if(dp[i][j]>result)
                    result=dp[i][j];
            }
        }
        return result;
    }
}
