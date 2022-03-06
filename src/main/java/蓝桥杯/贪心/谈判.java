package 蓝桥杯.tanxin;

import java.util.Arrays;
import java.util.Scanner;

public class 谈判 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        int count=arr[0];
        int sum=0;
        for(int i=1;i<n;i++){
            count=count+arr[i];
            sum+=count;
        }
        System.out.println(sum);
        scan.close();
    }
}
