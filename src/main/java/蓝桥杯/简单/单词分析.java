package 蓝桥杯.easy;

import java.util.Scanner;

public class 单词分析 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String str=scan.next();
        char[] arr=str.toCharArray();
        int arr1[]=new int[1000];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]-'a']++;
        }
        int max=0;
        char c='a';
        for(int i=0;i<26;i++){
            if(max<arr1[i]){
                max=arr1[i];
                c=(char)('a'+i);
            }
        }
        System.out.println(c);
        System.out.println(max);
        scan.close();
    }
}
