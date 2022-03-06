package 数组leetcode.Nov.first;

import java.util.Scanner;

/*
* 「快乐数」定义为：

对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
如果 可以变为 1，那么这个数就是快乐数。
如果 n 是快乐数就返回 true ；不是，则返回 false 。
输入：n = 19
输出：true
解释：
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
* */
public class 快乐数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=isHappy(n);
        System.out.println(res);
    }
    public static int getnext(int s){
        int tal=0;
        while(s>0){
            int d=s%10;
            s=s/10;
            tal+=d*d;
        }
        return tal;
    }
    public static boolean isHappy(int n) {
       int slow=n;
       int fast=getnext(n);
       while(fast!=1&&fast!=slow){
           slow=getnext(slow);
           fast=getnext(getnext(fast));
       }
       return fast==1;
    }
}
