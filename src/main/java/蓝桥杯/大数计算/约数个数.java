package 蓝桥杯.大数计算;

import java.util.Scanner;
/*
* 1200000 有多少个约数（只计算正约数）。
* */
public class 约数个数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int sum=0;
        for(int i=1;i<=Math.sqrt(1200000);i++){
            if(1200000%i==0)
                sum++;
        }
        System.out.println(sum);
        scan.close();
    }
}
