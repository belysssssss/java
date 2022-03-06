package 回溯.练习;

/*
*给定一个整数数组nums 和一个正整数 k，
* 找出是否有可能把这个数组分成 k 个非空子集，
* 其总和都相等。

示例 1：

输入： nums = [4, 3, 2, 3, 5, 2, 1], k = 4
输出： True
说明： 有可能将其分成 4 个子集（5），（1,4），（2,3），（2,3）
* 等于总和。
。
* */


import java.util.Arrays;

public class 划分为k个相等子集 {
    public static void main(String[] args) {
        int[] nums={1,2,3,5};
        int k=2;
        boolean res=canPartitionKSubsets(nums,k);
        System.out.println(res);
    }
    public static boolean canPartitionKSubsets(int[] nums, int k) {

        int totalsum=0;
        for(int i:nums){
            totalsum+=i;
        }
        int len=totalsum/k;
        if(k> nums.length||totalsum%k!=0){
            return false;
        }
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<j){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
        if(nums[0]>len){
            return false;
        }
       boolean[] used=new boolean[nums.length];
        return backTracking(nums,used,k,0,len);
    }

    private static boolean backTracking(int[] nums, boolean[] used, int k, int sum, int len) {
        if(k==0){
            return true;
        }
        if(sum==len){
            return backTracking(nums,used,k-1,0,len);
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]==true){
                continue;
            }
            if(nums[i]>len-sum){
                continue;
            }
            used[i]=true;
            sum+=nums[i];
            if(backTracking(nums,used,k,sum,len)){
             return true;
            }
            used[i]=false;
            sum-=nums[i];
        }
        return false;
    }
}
