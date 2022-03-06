package 动态规划.练习;
/*
*给你一个整数数组 nums，
* 请你找出数组中乘积最大的非空连续子数
* 组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
测试用例的答案是一个32-位 整数。
子数组 是数组的连续子序列。
示例 1:
输入: nums = [2,3,-2,4]
输出: 6
解释:子数组 [2,3] 有最大乘积 6。
示例 2:
输入: nums = [-2,0,-1]
输出: 0
解释:结果不能为 2, 因为 [-2,-1] 不是子数组。
* */
public class 乘积最大子数组 {
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
        int res=maxProduct(arr);
        System.out.println(res);
    }
    public static int maxProduct(int[] nums) {
       int len=nums.length;
       int[] maxf=new int[len];
       int[] minf=new int[len];
       System.arraycopy(nums,0,maxf,0,len);
       System.arraycopy(nums,0,minf,0,len);
       for(int i=1;i<len;i++){
           maxf[i]=Math.max(maxf[i-1]*nums[i],Math.max(nums[i],minf[i-1]*nums[i]));
           minf[i]=Math.min(minf[i-1]*nums[i],Math.min(nums[i],maxf[i-1]*nums[i]));
       }
       int ans=maxf[0];
        for(int j=1;j<len;j++){
            ans=Math.max(ans,maxf[j]);
        }
        return ans;

        /*
        * int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
              int tmp = imax;
              imax = imin;
              imin = tmp;
            }
            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
        *
        * */
    }
}
