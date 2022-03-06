package 蓝桥杯;

import java.util.Scanner;

public class 二进制表示 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String str=null;
        for(int i=1;i<=10000;i++){
            str=Integer.toBinaryString(i);
        }
        System.out.println(str.length());
        scan.close();
    }

}
