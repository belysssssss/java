package 周赛;

import java.util.*;

public class 找到和最大的长度为k的子序列 {
    public static void main(String[] args) {

        int nums[]={2,1,3,3};
        int n=2;
       int arr1[]=maxSubsequence(nums,n);
        for (int i= 0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }

    public static  int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int [] nums2 = new int [n];
        System.arraycopy(nums, 0, nums2, 0, n);
        Arrays.sort(nums2);
        Map<Integer, Integer> num_freq = new HashMap<>();
        for (int i = n - 1; i > n - k - 1; i --)
        {
            num_freq.put(nums2[i], num_freq.getOrDefault(nums2[i], 0) + 1);
        }

        int [] res = new int [k];
        int ri = 0;
       for(int x:nums){
           if(num_freq.getOrDefault(x,0)>0){
               res[ri++]=x;
               num_freq.put(x,num_freq.get(x)-1);
           }
       }
       return res;
    }
}
