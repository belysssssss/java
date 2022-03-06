package 蓝桥杯;

import java.util.Scanner;

public class 时间加法 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int a=scan.nextInt();
        int b=scan.nextInt();
        int t=scan.nextInt();
        a+=(t+b)/60;
        b=(t+b)%60;
        System.out.println(a);
        System.out.println(b);
        scan.close();
    }
}
