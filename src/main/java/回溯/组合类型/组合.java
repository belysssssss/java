package 回溯.组合类型;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 组合 {
    public static void main(String[] args) {
        int n=4;
        int k=2;
        List<List<Integer>> list=combine(n,k);
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
  static   List<List<Integer>> result=new ArrayList<>();
  static   LinkedList<Integer> path=new LinkedList<>();
    public static  List<List<Integer>> combine(int n, int k) {
        combineHelper(n,k,1);
        return result;
    }

    private static void combineHelper(int n, int k, int i) {
    //终止条件
        if(path.size()==k){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int j=i;j<=n-(k-path.size())+1;j++ ){
            path.add(j);
            combineHelper(n,k,j+1);
            path.removeLast();
        }
    }

}
