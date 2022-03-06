package 回溯.子集;

import java.util.ArrayList;
import java.util.List;

public class 递增序列 {
    public static void main(String[] args) {
        int[] nums={4,6,7,7};
        List<List<Integer>> list=findSubsequences(nums);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static List<List<Integer>> result=new ArrayList<>();
    static List<Integer> path=new ArrayList<>();
    public static List<List<Integer>> findSubsequences(int[] nums) {
        backTracking(nums,0);
        return result;
    }

    private static void backTracking(int[] nums, int start) {
        if(path.size()>1){
            result.add(new ArrayList<>(path));
        }
        int[] user=new int[201];
        for(int i=start;i< nums.length;i++){
            if(!path.isEmpty()&&nums[i]<path.get(path.size()-1)||(user[nums[i]+100]==1))
                continue;
            user[nums[i]+100]=1;
            path.add(nums[i]);
            backTracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}
