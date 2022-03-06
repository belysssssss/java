package 蓝桥杯.大数计算;

import java.math.BigInteger;
import java.util.Scanner;

public class 数列求值 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
          int a=1;
          int b=1;
          int c=1;
          int d=1;
        for(int i=3;i<=20190324;i++){
            d=(a+b+c)%10000;
            a=b;
            b=c;
            c=d;
        }
        System.out.println(d);
        scan.close();
    }
}
