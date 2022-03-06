package 回溯.组合类型;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 组合求和三 {
    public static void main(String[] args) {
        int[] array={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer> >list=combinationSum2(array,target);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static List<List<Integer>> result=new ArrayList<>();
    static List<Integer> path=new ArrayList<>();
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] flag=new boolean[candidates.length];
        combinationSum2Helper(candidates,target,flag,0,0);
        return result;
    }

    private static void combinationSum2Helper(int[] candidates, int target,boolean[] flag, int start, int sum) {
    if(sum>target){
        return;
    }
    if(sum==target){
        result.add(new ArrayList<>(path));
        return;
    }
    for(int i=start;i<candidates.length;i++){
        if(i>0&&candidates[i]==candidates[i-1]&&!flag[i-1]){
            continue;
        }
        flag[i]=true;
        path.add(candidates[i]);
        sum+=candidates[i];
        combinationSum2Helper(candidates,target,flag,i+1,sum);
        path.remove(path.size()-1);
        sum-=candidates[i];
        flag[i]=false;
    }
    }
}
