package 蓝桥杯;

import java.util.Scanner;

/*
* 小明发现 49 很有趣，
* 首先，它是个平方数。它可以拆分为 4 和 9 ，
* 拆分出来的部分也是平方数。169 也有这个性质，我们权且称它们为：拼接平方数。
100 可拆分 1 和 00，这有点勉强，我们规定，0，00，000 等都不算平方数。
小明想：还有哪些数字是这样的呢？
你的任务出现了：找到某个区间的所有拼接平方数。
输入描述
输入两个正整数a,b (a<b<106)。
输出描述
输出若干行，每行一个正整数。表示所有的区间 [a,b][a,b] 中的拼接平方数
输入输出样例
示例
输入
1 200
输出
49
169
* */
public class 拼接平方数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int a=scan.nextInt();
        int b=scan.nextInt();
        for(int i=(int) Math.sqrt(a);i<=(int) Math.sqrt(b);i++){
            int temp=i*i;
            for(int j=10;temp/j>0;j*=10){
                int n=temp%j;
                int m=temp/j;
                if(check(m)&&check(n))
                    System.out.println(temp);
            }
        }
        scan.close();
    }

    private static boolean check(int num) {
        int a=(int) Math.sqrt(num);
        return a*a==num && num!=0;
    }
}
