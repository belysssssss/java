package 回溯.练习;
/*
* 假设有从 1 到 n 的 n 个整数。用这些整数构造一个数组 perm（下标从 1 开始），只要满足下述条件 之一 ，该数组就是一个 优美的排列 ：

perm[i] 能够被 i 整除
i 能够被 perm[i] 整除
给你一个整数 n ，返回可以构造的 优美排列 的 数量 。
示例 1：
输入：n = 2
输出：2
解释：
第 1 个优美的排列是 [1,2]：
    - perm[1] = 1 能被 i = 1 整除
    - perm[2] = 2 能被 i = 2 整除
第 2 个优美的排列是 [2,1]:
    - perm[1] = 2 能被 i = 1 整除
    - i = 2 能被 perm[2] = 1 整除
* */
public class 全排列 {
    public static void main(String[] args) {
        int n=2;
        int res=countArrangement(n);
        System.out.println(res);
    }

    public static int countArrangement(int n) {
        return backTracking(n,1,new boolean[n+1]);
    }

    private static int backTracking( int n, int start,boolean[] used) {
        if(start>n){
           return 1;
        }
        int ans=0;
        for(int num=1;num<=n;num++){
            if(!used[num]&&(num%start==0||start%num==0)){
                used[num]=true;
               ans+= backTracking(n,start+1,used);
                used[num]=false;
            }
        }
        return ans;
    }

}
