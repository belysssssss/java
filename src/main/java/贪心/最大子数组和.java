package 贪心;
/*
* 给你一个整数数组 nums ，
* 请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），
* 返回其最大和。
子数组 是数组中的一个连续部分。
示例 1
输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组[4,-1,2,1] 的和最大，为6 。
示例 2：
输入：nums = [1]
输出：1
* */
public class 最大子数组和 {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int res=maxSubArray(nums);
        System.out.println(res);
    }

    public static int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int count=0;
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
            sum=Math.max(sum,count);
            if(count<=0){
                count=0;
            }
        }
        return sum;
    }
}
