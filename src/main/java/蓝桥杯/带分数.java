package 蓝桥杯;

import java.util.Scanner;
/*
* 100 可以表示为带分数的形式：100 = 3 + 69258 / 714
还可以表示为：100 = 82 + 3546 / 197
注意特征：带分数中，数字 1~9 分别出现且只出现一次（不包含 0 ）。
类似这样的带分数，100 有 11 种表示法。
输入描述
从标准输入读入一个正整数N(N<1000×1000)。
输出描述
程序输出该数字用数码 1~9 不重复不遗漏地组成带分数表示的全部种数。
注意：不要求输出每个表示，只统计有多少表示法！
输入输出样例
示例
输入
100
输出
11
* */
public class 带分数 {
    static int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
    static int n;
    static int count=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        n=scan.nextInt();
        fullSort(0,arr.length);
        System.out.println(count);
        scan.close();
    }

    private static void fullSort(int num, int end) {
        if(num==end){
            for(int i=0;i<arr.length;i++){
                int a,b,c;
                a=get(0,i);
                if(a>n){
                    return;
                }
                for(int j=i;j<arr.length;j++){
                    b=get(i,j);
                    c=get(j,arr.length);
                    if((n-a)*c==b){
                        count++;
                    }
                }
            }
        }else{
            for(int i=num;i<end;i++){
                swap(i,num);
                fullSort(num+1,end);
                swap(i,num);
            }
        }
    }

    private static void swap(int i, int num) {
        int temp=arr[i];
        arr[i]=arr[num];
        arr[num]=temp;
    }

    private static int get(int i, int j) {
        int t=0;
        for(int k=i;k<j;k++){
            t=t*10+arr[k];
        }
        return t;
    }
}
