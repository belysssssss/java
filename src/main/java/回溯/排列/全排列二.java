package 回溯.排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 全排列二 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> list=permuteUnique(nums);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static List<List<Integer>> result=new ArrayList<>();
    static List<Integer> path=new ArrayList<>();
    public static List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used=new boolean[nums.length];
        Arrays.fill(used,false);
        Arrays.sort(nums);
        backTracking(nums,used);
        return result;
    }

    private static void backTracking(int[] nums, boolean[] used) {
    if(path.size()==nums.length){
        result.add(new ArrayList<>(path));
        return;
    }
    for(int i=0;i<nums.length;i++){
        if(i>0&&nums[i]==nums[i-1]&&used[i-1]==false){
            continue;
        }
        if(used[i]==false){
            used[i]=true;
            path.add(nums[i]);
            backTracking(nums,used);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
    }
}
