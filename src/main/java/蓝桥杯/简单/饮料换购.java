package 蓝桥杯.easy;

import java.util.Scanner;

/*
* 乐羊羊饮料厂正在举办一次促销优惠活动。
* 乐羊羊 C 型饮料，凭 3 个瓶盖可以再换一瓶 C 型饮料，
* 并且可以一直循环下去(但不允许暂借或赊账)。
请你计算一下，如果小明不浪费瓶盖，尽量地参加活动，
* 那么，对于他初始买入的 n 瓶饮料，最后他一共能喝到多少瓶饮料。
输入描述
输入一个整数 n(0<n<1000)n(0<n<1000)，表示开始购买的饮料数量。
输出描述
输出一个整数，表示实际得到的饮料数
输入输出样例
示例
输入
100
输出
149
* */
public class 饮料换购 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n= scan.nextInt();
        int f=0;//代表瓶盖
        int count=0;
        while(n>=0){
            if(f==3){
                f=0;
                n+=1;
            }
            f++;
            n--;
            count+=1;
        }
        System.out.println(count-1);
        scan.close();

    }
}
