package 排序;

import java.util.HashMap;

public class 最长和谐子序列 {
    public static void main(String[] args) {
        int[] nums={1,3,2,2,5,2,3,7};
        int res=findLHS(nums);
        System.out.println(res);
    }
    public static  int findLHS(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int num:nums){
            int count=hashMap.getOrDefault(num,0)+1;
            hashMap.put(num,count);
        }
        int res=0;
        for(int sum:hashMap.keySet()){
            if(hashMap.containsKey(sum+1)){
                res=Math.max(res,hashMap.get(sum)+hashMap.get(sum+1));
            }
        }
        return res;
    }
}
