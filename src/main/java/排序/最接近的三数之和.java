package 排序;

import java.util.Arrays;

public class 最接近的三数之和 {
    public static void main(String[] args) {
        int[] nums={-1,2,1,-4};
        int target=1;
        int result=threeSumClosest(nums,target);
        System.out.println(result);
    }
    public static  int threeSumClosest(int[] nums, int target) {
      //排序
        Arrays.sort(nums);
        int closenum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int threesum=nums[i]+nums[l]+nums[r];
                if(Math.abs(threesum-target)<Math.abs(closenum-target)){
                    closenum=threesum;
                }
                if(threesum>target){
                    r--;
                }else if(threesum<target){
                    l++;
                }else{
                    return target;
                }
            }
        }
        return closenum;
    }

}
