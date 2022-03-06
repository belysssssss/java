package 蓝桥杯;

import java.util.Scanner;
/*
* 小蓝有一张黑白图像，由n×m个像素组成，
* 其中从上到下共 n 行，每行从左到右 m 列。
* 每个像素由一个 0 到 255 之间的灰度值表示。
现在，小蓝准备对图像进行模糊操作，操作的方法为：
对于每个像素，将以它为中心3×3 区域内的所有像素
* （可能是 9 个像素或少于 9个像素）求和
* 后除以这个范围内的像素个数（取下整），得到的值就是模糊后的结果。
请注意每个像素都要用原图中的灰度值计算求和。
输入描述
输入的第一行包含两个整数n,m。
第 2 行到第 n + 1 行
* 每行包含 m 个整数，表示每个像素的灰度值，相邻整数之间用一个空格分隔。
其中，1≤n,m≤100 。
输出描述
输出 n 行，每行 m 个整数，相邻整数之间用空格分隔，表示模糊后的图像。
输入输出样例
示例 1
输入
3 4
0 0 0 255
0 0 255 0
0 30 255 255
copy
输出
0 42 85 127
5 60 116 170
7 90 132 191
* */
public class 图像模糊 {
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
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){

            }
        }
        scan.close();

    }
}
