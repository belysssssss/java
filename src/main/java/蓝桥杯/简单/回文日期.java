package 蓝桥杯.easy;

import java.util.Scanner;

public class 回文日期 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n=scan.nextInt();
        int sum=0;
        for(int i=n+1;i<89991231;i++) {
            int a1 = i% 10;
            int a2 = i / 10 % 10;
            int a3 = i / 100 % 10;
            int a4 = i / 1000 % 10;
            int a5 = i / 10000 % 10;
            int a6 = i/ 100000 % 10;
            int a7 = i / 1000000 % 10;
            int a8 = i/ 10000000 % 10;
            if ((a1 == a8) && (a2 == a7) && (a3 == a6) && (a4 == a5)) {
                System.out.println(i);
                sum=i;
                break;
            }
        }
        for(int i=sum+1;i<89991231;i++) {
            int a1 = i% 10;
            int a2 = i / 10 % 10;
            int a3 = i / 100 % 10;
            int a4 = i / 1000 % 10;
            int a5 = i / 10000 % 10;
            int a6 = i/ 100000 % 10;
            int a7 = i / 1000000 % 10;
            int a8 = i/ 10000000 % 10;
            if ((a1==a3)&&(a3==a6)&&(a6==a8)
                    &&(a2==a4)&&(a4==a5)&&(a5==a7)) {
                System.out.println(i);
                break;
            }
        }
        scan.close();
    }
}
