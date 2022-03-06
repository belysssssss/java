package 蓝桥杯;

import java.util.Scanner;

/*
* 在数列 a_1, a_2, a_n中，定义两个元素 a_i和 a_j的距离为
* |i-j|+|a_i-a_j|，即元素下标的距离加上元素值的差的绝对值，
* 其中|x|表示x的绝对值。
给定一个数列，请问找出元素之间最大的元素距离。
输入描述
输入的第一行包含一个整数n。
第二行包含n个整数 a_1, a_2,a_n，相邻的整数间用空格分隔，表示给定的数列。
其中，2<n<1000， 0<=数列中的数<=10^4
输出描述
输出一行包含一个整数，表示答案。
输入输出样例
示例
输入
5
9 4 2 4 7
输出
9
* */
public class 最大距离 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int a=scan.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int max=Math.abs(j-i)+Math.abs(arr[j]-arr[i]);
                if(max>sum){
                    sum=max;
                }
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
