package 排序;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 四数之和 {
    public static void main(String[] args) {
       int[] nums={1,0,-1,0,-2,2};
       int target=0;
       List<List<Integer>> list=fourSum(nums,target);
        System.out.println(list);
    }
    public static  List<List<Integer>> fourSum(int[] nums, int target) {
      List<List<Integer>> list=new ArrayList<>();
      if(nums==null||nums.length<4)
          return list;
        Arrays.sort(nums);
      for(int i=0;i<nums.length-3;i++){
          if(i>0&&nums[i]==nums[i-1])
              continue;
          if((long)nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)
              break;
          if((long)nums[i]+nums[nums.length-3]+nums[nums.length-2]+nums[nums.length-1]<target)
              continue;
          for(int j=i+1;j<nums.length-2;j++){
              if(j>i+1&&nums[j]==nums[j-1])
                  continue;
              if((long)nums[i]+nums[j]+nums[j+1]+nums[j+2]>target)
                  break;
              if((long)nums[i]+nums[j]+nums[nums.length-2]+nums[nums.length-1]<target)
                  continue;
              int l=j+1;
              int r=nums.length-1;
              while(l<r){
                  int sum=nums[i]+nums[j]+nums[l]+nums[r];
                  if(sum==target){
                      list.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                      while(l<r&&nums[l]==nums[l+1])
                          l++;
                      l++;
                      while(l<r&&nums[r]==nums[r-1])
                          r--;
                      r--;
                  }else if(sum>target){
                      r--;
                  }else{
                      l++;
                  }
              }
          }
      }
      return list;
}
}
