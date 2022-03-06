package 排序;

import java.util.Arrays;
import java.util.HashMap;

public class 错误的集合 {
    public static void main(String[] args) {
        int[] nums={1,1};
        int[] num=findErrorNums(nums);
        for(int i:num){
            System.out.println(i);
        }
    }
    public static int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i:nums){
            int count=hashMap.getOrDefault(i,0)+1;
            hashMap.put(i,count);
        }
        int[] array=new int[2];
        for(int i=0;i<= nums.length;i++){
            int count=hashMap.getOrDefault(i,0);
            if(count==2){
                array[0]=i;
        }else if(count==0){
                array[1]=i;
            }
        }
    return array;
    }
}
