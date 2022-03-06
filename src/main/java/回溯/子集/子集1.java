package 回溯.子集;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 子集1 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> list=subsets(nums);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static List<List<Integer>> result=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();
    public static List<List<Integer>> subsets(int[] nums) {
        if(nums.length==0){
            result.add(new ArrayList<>());
            return result;
        }
        subsetsHelper(nums,0);
        return result;
    }

    private static void subsetsHelper(int[] nums, int start) {
    result.add(new ArrayList<>(path));
    if(start>=nums.length)
        return;
    for(int i=start;i<nums.length;i++){
        path.add(nums[i]);
        subsetsHelper(nums,i+1);
        path.removeLast();
    }
    }

}
