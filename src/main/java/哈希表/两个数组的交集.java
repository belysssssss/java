package 哈希表;

import java.util.*;

public class 两个数组的交集 {
    public static void main(String[] args) {
      int nums1[]={1,2,2,1};
      int nums2[]={2,2};
      int nums3[]=intersection(nums1,nums2);
        System.out.println(Arrays.toString(nums3));
    }
    //hashmap
    public static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
            intersection(nums2,nums1);
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int nums:nums1){
            int count=map.getOrDefault(nums,0)+1;
            map.put(nums,count);
        }
        int[] arr=new int[nums1.length];
        int index=0;
       for(int nums:nums2){
           int count=map.getOrDefault(nums,0);
           if(count>0){
               arr[index++]=nums;
               map.remove(nums);
           }
       }
       return Arrays.copyOfRange(arr,0,index);
    }
    //hashset
    public int[] insection(int[] nums1,int[] nums2){
        if(nums1==null||nums1.length==0||nums2==null||nums2.length==0){
            return new int[10];
        }
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int[] arr=new int[set2.size()];
        int index=0;
        for(int i:set2){
            arr[index++]=i;
        }
        return arr;
    }
}
