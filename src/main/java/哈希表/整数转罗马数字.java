package 哈希表;

import java.util.HashMap;
import java.util.Scanner;

public class 整数转罗马数字 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res=intToRoman(n);
        System.out.println(res);
    }
    public static  String intToRoman(int num) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("I",1);
        hashMap.put("V",5);
        hashMap.put("X",10);
        hashMap.put("L",50);
        hashMap.put("C",100);
        hashMap.put("D",500);
        hashMap.put("M",1000);
       return null;
    }
}
