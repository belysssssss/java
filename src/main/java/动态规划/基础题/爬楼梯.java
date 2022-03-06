package 动态规划.基础题;

import java.util.Scanner;

public class 爬楼梯 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入目标数据:");
        int a = sc.nextInt();
        int c = climbStairs(a);
        System.out.println(c);
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }
}
