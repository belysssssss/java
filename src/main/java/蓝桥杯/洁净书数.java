package 蓝桥杯;

import java.util.Scanner;

/*
* 小明非常不喜欢数字2，包括那些数位上包含数字2的数。
* 如果一个数的数位不包含数字2，小明将它称为洁净数。
请问在整数 1 至 n 中，洁净数有多少个？
输入描述
输入的第一行包含一个整数 nn(1≤n≤106)。,
输出描述
输出一行包含一个整数，表示答案。
输入输出样例
示例
输入
30
输出
18
* */
public class 洁净书数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n=scan.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(check(i)){
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }

    private static boolean check(int num) {
        String str=""+num;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='2'){
                return false;
            }
        }
        return true;
    }
}
