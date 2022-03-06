package 哈希表;

import java.util.HashMap;
import java.util.Map;

public class 四数相加II {
    public static void main(String[] args) {
      int  nums1[]={1,2};
      int nums2[] = {-2,-1};
      int nums3[] ={-1,2};
      int nums4[] = {0,2};
      int s=fourSumCount(nums1,nums2,nums3,nums4);
        System.out.println(s);
    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> hashmap=new HashMap<>();
        for(int i:nums1){
            for(int j:nums2){
                int temp=i+j;
                if(hashmap.containsKey(temp)){
                    hashmap.put(temp, hashmap.get(temp)+1);
                }else{
                    hashmap.put(temp,1);
                }
            }
        }
        int res=0;
        for(int i:nums3){
            for(int j:nums4){
                int temp=i+j;
                if(hashmap.containsKey(0-(temp))){
                    res+=hashmap.get(0-temp);
                }
            }
        }
        return res;
    }
}
