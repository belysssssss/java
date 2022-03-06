package 蓝桥杯.tanxin;

import java.util.Scanner;
/*
*你有一架天平。现在你要设计一套砝码，
* 使得利用这些砝码可以称出任意 小于等于 N的正整数重量。

那么这套砝码最少需要包含多少个砝码？

注意砝码可以放在天平两边。

输入格式
输入包含一个正整数 N。

输出格式
输出一个整数代表答案。

样例输入
7
copy
样例输出
3
* */
public class 最少砝码 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();//N就是输入的整数
        int numberOfWeight = 1, addWeight = 1, weighting = 1;
        //三个变量含义分别是用来称重的砝码个数、新增砝码重量、可称最大砝码重量
        while (weighting < N) {
            numberOfWeight++;
            addWeight *= 3;
            weighting += addWeight;
        }
        System.out.println(numberOfWeight);
        scan.close();
    }
}
