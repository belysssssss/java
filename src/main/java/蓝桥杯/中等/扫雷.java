package 蓝桥杯.middle;

import java.util.Scanner;
/*
*
* 在一个 nn 行 mm 列的方格图上有一些位置有地雷，另外一些位置为空。

请为每个空位置标一个整数，表示周围八个相邻的方格中有多少个地雷。

输入描述
输入的第一行包含两个整数n,m。
第 22 行到第 n + 1 行每行包含 m 个整数，
* 相邻整数之间用一个空格分隔。
* 如果对应的整数为 0，表示这一格没有地雷。
* 如果对应的整数为 1，表示这一格有地雷。
其中，1≤n,m≤100 分钟后还是在当天。
输出描述
输出 n 行，每行m个整数，相邻整数之间用空格分隔。
对于没有地雷的方格，输出这格周围的地雷数量。对于有地雷的方格，输出 9。
输入输出样例
示例 1
输入
3 4
0 1 0 0
1 0 1 0
0 0 1 0
输出
2 9 2 1
9 4 9 2
1 3 9 2
* */
public class 扫雷 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] arr=new int[n+2][m+2];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        int sum=0;
        int[][] array=new int[n+2][m+2];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(arr[i][j]==1){
                    array[i][j]=9;
                }else{
                    sum=arr[i][j]+arr[i-1][j]+arr[i-1][j-1]+arr[i][j-1]+
                            arr[i+1][j]+arr[i+1][j+1]+arr[i][j+1]+arr[i+1][j-1]+
                            arr[i-1][j+1];
                    array[i][j]=sum;
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
