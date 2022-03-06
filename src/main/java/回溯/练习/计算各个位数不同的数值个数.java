package 回溯.练习;
/*
* 给定一个非负整数 n，计算各位数字都不同的数字 x 的个数，其中 0 ≤ x < 10^n。

示例:

输入: 2
输出: 91
解释: 答案应为除去 11,22,33,44,55,66,77,88,99 外，
* 在 [0,100) 区间内的所有数字。

* */
public class 计算各个位数不同的数值个数 {
    public static void main(String[] args) {
        int n=2;
        int res=countNumbersWithUniqueDigits(n);
        System.out.println(res);
    }
    public static int countNumbersWithUniqueDigits(int n) {
        if(n==0)
            return 1;
        return dfs(Math.min(10,n),0,new boolean[10]);
    }

    private static int dfs(int min, int start, boolean[] booleans) {
        int count=0;
        if(start!=min){
            for(int i=0;i<10;i++){
                if(i==0&&min>1&&start==1)
                    continue;
                if(booleans[i]){
                    continue;
                }
                booleans[i]=true;
                count+=dfs(min,start+1,booleans)+1;
                booleans[i]=false;
            }
        }
        return count;
    }
}
