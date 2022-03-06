package 贪心;
/*
* 给你一个整数数组nums ，判断这个数组中是否存在长度为 3 的递增子序列。
如果存在这样的三元组下标 (i, j, k)
* 且满足 i < j < k ，
* 使得nums[i] < nums[j] < nums[k] ，返回 true ；否则，返回 false 。
示例 1：
输入：nums = [1,2,3,4,5]
输出：true
解释：任何 i < j < k 的三元组都满足题意
示例 2：
输入：nums = [5,4,3,2,1]
输出：false
解释：不存在满足题意的三元组
* */
public class 递增的三元子序列 {
    public static void main(String[] args) {
        int[] arr={20,100,10,12,5,13};
        boolean b=increasingTriplet(arr);
        System.out.println(b);
    }
    public static  boolean increasingTriplet(int[] nums) {
     if(nums.length<3)
         return false;
       int first=nums[0];
       int second=Integer.MAX_VALUE;
       for(int i=1;i<nums.length;i++){
           int num=nums[i];
           if(num>second) {
               return true;
           }else if(num>first) {
               second = num;
           } else
               first=num;
       }
       return false;
    }
}
/*
*
* */