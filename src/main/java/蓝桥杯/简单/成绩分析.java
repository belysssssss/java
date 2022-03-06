package 蓝桥杯.简单;

import java.util.Scanner;
/*
* 小蓝给学生们组织了一场考试，
* 卷面总分为 100 分，每个学生的得分都是一个0到100的整数。
请计算这次考试的最高分、最低分和平均分。
输入描述
输入的第一行包含一个整数n(1≤n≤104)，表示考试人数。
接下来 n 行，每行包含一个 0 至 100 的整数，表示一个学生的得分。
输出描述
输出三行。
第一行包含一个整数，表示最高分。
第二行包含一个整数，表示最低分。
第三行包含一个实数，四舍五入保留正好两位小数，表示平均分。
输入输出样例
示例
输入
7
80
92
56
74
88
99
10
copy
输出
99
10
71.29
*
* */
public class 成绩分析 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n=scan.nextInt();
        double sum=0;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int s=scan.nextInt();
            if(s>max){
                max=s;
            }
            if(s<min){
                min=s;
            }
            sum+=s;
        }
        System.out.println(max);
        System.out.println(min);
        double m=sum*100/n/100;
        System.out.println(String.format("%.2f",m));
        scan.close();
    }
}
