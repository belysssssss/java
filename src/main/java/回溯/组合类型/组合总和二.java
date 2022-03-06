package 回溯.组合类型;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 组合总和二 {
    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        int target=7;
        List<List<Integer>> list=combinationSum(candidates,target);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static List<List<Integer>> result=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinationSumHelper(candidates,target,0,0);
        return result;
    }

    private static void combinationSumHelper(int[] candidates, int target,int start, int sum) {
        if(sum>target)
            return;
        if(sum==target){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            path.add(candidates[i]);
            sum+=candidates[i];
            combinationSumHelper(candidates,target,i,sum);
            path.removeLast();
            sum-=candidates[i];
        }
    }
}
