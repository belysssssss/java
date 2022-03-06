package 蓝桥杯.规律;

import java.util.Scanner;

/*
* 如果一个分数的分子和分母的最大公约数是 1，这个分数称为既约分数。
 ， 都是既约分数。
请问，有多少个既约分数，分子和分母都是 1 到 2020 之间的整数（包括 1 和 2020）？
* */
public class 既约分数二 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int sum=0;
        for(int i=1;i<=2020;i++){
            for(int j=1;j<=2020;j++){
                if(gcd(i,j)==1){
                    sum++;
                }
            }
        }
        System.out.println(sum);
        scan.close();
    }

    private static int gcd(int i, int j) {
        return j==0? i : gcd(j,i%j);
    }
}
