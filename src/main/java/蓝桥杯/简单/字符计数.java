package 蓝桥杯.easy;

import java.util.Scanner;

/*
* 定一个单词，请计算这个单词中有多少个元音字母，多少个辅音字母。
元音字母包括 a, e, i, o, u，共五个，其他均为辅音字母。
输入描述
输入格式：
输入一行，包含一个单词，单词中只包含小写英文字母。单词中的字母个数不超过 100。
输出描述
输出两行，第一行包含一个整数，表示元音字母的数量。
第二行包含一个整数，表示辅音字母的数量。
输入输出样例
示例
输入
lanqiao
输出
4
3
*/
public class 字符计数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String str=scan.nextLine();
        int count1=0;
        int count2=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                count1++;
            else
                count2++;
        }
        System.out.println(count1);
        System.out.println(count2);
        scan.close();
    }
}
