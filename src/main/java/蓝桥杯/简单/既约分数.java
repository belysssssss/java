package 蓝桥杯.easy;

import java.util.Arrays;
import java.util.Scanner;

public class 既约分数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        int sum=0;
        if(d%2==1)
            sum=arr[n-1]/d+1;
        else
            sum=arr[n-1]/d;
        System.out.println(sum);
        scan.close();
    }
}
