package 蓝桥杯.动态规划;

import java.util.Scanner;

public class 数字三角形 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int m=sc.nextInt();
                arr[i][j]=m;
            }
        }
        int[][] dp=new int[n][n];
        dp[0][0]=arr[0][0];
        for(int i=1;i<n;i++){
            dp[i][0]=dp[i-1][0]+arr[i][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                dp[i][j]=arr[i][j]+Math.max(dp[i-1][j],dp[i-1][j-1]);
            }
        }
        if(n%2!=0) {
            System.out.println(dp[n-1][n/2]);
        }else {
            System.out.println(Math.max(dp[n-1][n/2], dp[n-1][n/2-1]));
        }
    }

}
