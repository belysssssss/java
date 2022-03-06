package 蓝桥杯.规律;

import java.util.Scanner;
/*
每项是前一项的一半，如果一共有 20 项,求这个和是多少，结果用分数表示出来。
 ，当然，这只是加了前 2 项而已。分子分母要求互质。
* */
public class 分数 {
    public static void main(String[] args) {
        //在此输入您的代码...
        Scanner scan = new Scanner(System.in);
        int s=0;
        for(int i=0;i<20;i++)
            s=s*2+1;
        int w=(int)Math.pow(2,19);
        System.out.println(s+"/"+w);
        scan.close();
    }
}
