package 蓝桥杯.动态规划;

import java.util.Scanner;

/*
* 小明几乎每天早晨都会在一家包子铺吃早餐。
* 他发现这家包子铺有 N 种蒸笼，其中第 i 种蒸笼恰好能放 A_i个包子。
* 每种蒸笼都有非常多笼，可以认为是无限笼。
每当有顾客想买 X 个包子，卖包子的大叔就会迅速选出若干笼包子来，
* 使得这若干笼中恰好一共有 X 个包子。
* 比如一共有 3 种蒸笼，分别能放 3、4 和 5 个包子。
* 当顾客想买 11 个包子时，大叔就会选 2 笼 3 个的再加 1 笼 5 个的
* （也可能选出 1 笼 3 个的再加 2 笼 4 个的）。
当然有时包子大叔无论如何也凑不出顾客想买的数量。比如一共有 3 种蒸笼，
* 分别能放 4、5 和 6 个包子。而顾客想买 7 个包子时，大叔就凑不出来了。
小明想知道一共有多少种数目是包子大叔凑不出来的。
输入描述
第一行包含一个整数 N (1≤N≤100)。
以下 N 行每行包含一个整数 A_i(1≤A ≤100)。
输出描述
一个整数代表答案。如果凑不出的数目有无限多个，输出 INF。
输入输出样例
示例 1
输入
2
4
5
输出
6
样例说明
凑不出的数目包括：1, 2, 3, 6, 7, 11。
示例 2
输入
2
4
6
输出
INF
* */
public class 包子凑数 {
//什么时候认为凑不出？当凑不出的数达到一个足够大的数的时候就认为凑不出
//这个数是多少呢？   最多100种蒸笼，
// 每种蒸笼最多100种包子，100*100，保险点再扩大10倍，100000,10万
// 那么假设有5万种数目凑不出来，就认为是无限的INF
//转化为完全背包问题,顾客可能要求凑的包子数1---10万，
// dp表可以列出 每种情况凑出的最大包子数
// 如果可以凑的最大包子数等于顾客要求的包子数，那么表示可以凑出
        public static int types;
        public static int[] num = new int[110]; //用于存储每笼包子数Ai
        public static int[][] dp = new int[110][100010];//动态规划表
        public static boolean[] bl = new boolean[100010];//用于标记哪些可以凑出，哪些不可以凑出
        public static int ans =0;//标记
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //在此输入您的代码...
            types = scan.nextInt();//种类N
            //Ai
            for(int i =1;i<=types;i++){
                num[i] = scan.nextInt();
            }

            //动态规划完全背包问题打印dp表
            for(int i=1;i<100;i++){
                for(int j=1;j<100000;j++){
                    if(j>=num[i]){
                        // 如果可以放得下
                        dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-num[i]]+num[i]);
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                    if(j==dp[i][j]){
                        bl[j] = true;
                    }
                }
            }
            bl[0] = true;//标记可以凑出
            for(int j =0;j<100000;j++) {
                if(bl[j] == false) {
                    ans++;
                }
            }
            if(ans<50000) {
                System.out.println(ans);
            }else {
                System.out.println("INF");
            }

            scan.close();
    }
}
