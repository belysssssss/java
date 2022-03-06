package 排序;

import java.util.Arrays;

public class 前K个高频元素 {
    public static void main(String[] args) {
int[] nums={1,1,1,2,2,3};
int k=2;
int arr[]=topKFrequent(nums,k);
       for(int i:arr){
           System.out.println(i);
       }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int[] array=new int[1000];
        for(int i=0;i<nums.length;i++){
            array[nums[i]]++;
        }
        Arrays.sort(array);
        int[] arrays=new int[2];
        for(int j=array.length-1,i=0;j>array.length-k;j--){
            arrays[i]=array[j];
            i++;
        }
        return arrays;
    }
}
