package 回溯.子集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 子集2 {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        List<List<Integer>> list=subsetsWithDup(nums);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static List<List<Integer>> result=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();
    static boolean[] used;
     public static List<List<Integer>> subsetsWithDup(int[] nums) {
         if(nums.length==0){
             result.add(path);
             return result;
         }
         Arrays.sort(nums);
         used=new boolean[nums.length];
         subsetsWithDupHelper(nums,0);
         return result;
    }

    private static void subsetsWithDupHelper(int[] nums, int start) {
    result.add(new ArrayList<>(path));
    if(start>=nums.length){
        return;
    }
    for(int i=start;i<nums.length;i++){
        if(i>0&&nums[i]==nums[i-1]&&!used[i-1]){
            continue;
        }
        path.add(nums[i]);
        used[i]=true;
        subsetsWithDupHelper(nums,i+1);
        path.removeLast();
        used[i]=false;
    }
     }
}
