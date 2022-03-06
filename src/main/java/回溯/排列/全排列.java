package 回溯.排列;

import java.util.ArrayList;
import java.util.List;

public class 全排列 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> list=permute(nums);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static List<List<Integer>> result=new ArrayList<>();
    static List<Integer> path=new ArrayList<>();
    static boolean[] used;
    public static List<List<Integer>> permute(int[] nums) {
        if(nums.length==0){
            return result;
        }
        used=new boolean[nums.length];
        backTracking(nums);
        return result;
    }

    private static void backTracking(int[] nums) {
       if(path.size()==nums.length)
       {
           result.add(new ArrayList<>(path));
           return ;
       }
        for(int i=0;i<nums.length;i++){
           if(used[i])
               continue;
           used[i]=true;
            path.add(nums[i]);
            backTracking(nums);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}
