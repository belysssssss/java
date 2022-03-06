package 回溯.组合类型;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 组合总和 {
    public static void main(String[] args) {
        int k=3,n=7;
        List<List<Integer>> list=combinationSum3(k,n);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static List<List<Integer>> result=new ArrayList<>();
    static LinkedList<Integer> path=new LinkedList<>();
    public static  List<List<Integer>> combinationSum3(int k, int n) {
        combainationHelper(k,n,1,0);
        return result;
    }

    private static void combainationHelper(int k, int n, int start,int sum) {

        if(path.size()==k){
            if(sum==n)
                result.add(new ArrayList<>(path));
            return;
        }
        if(sum>n)
            return;
        for(int i=start;i<=9-(k-path.size())+1;i++){
            path.add(i);
            sum+=i;
            combainationHelper(k,n,i+1,sum);
            path.removeLast();
            sum-=i;
        }
    }

}
