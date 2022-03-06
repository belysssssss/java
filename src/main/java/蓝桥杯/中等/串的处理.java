package 蓝桥杯.middle;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class 串的处理 {
    static List<String> sum=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String s=scan.nextLine();
        String[] str=s.split(" ");
        change(str);
        for(int i=0;i<sum.size();i++){
            if(i!=0) System.out.print(" "+sum.get(i));
            else System.out.print(sum.get(i));
        }
        scan.close();
    }

    private static void change(String[] str) {
        for(int i=0;i<str.length;i++){
            changedemo(str[i].toCharArray());
        }
    }

    private static void changedemo(char[] chars) {
       StringBuilder sb=new StringBuilder();
        if(chars.length==0)
            return;
        if(chars[0]>='a'&&chars[0]<='z')
            sb.append((""+chars[0]).toUpperCase());
        else
            sb.append(chars[0]);
        for(int i=1;i<chars.length;i++){
            if((chars[i-1]>='0'&&chars[i-1]<='9')&&(chars[i]>='0'&&chars[i]<='9'))  //该字符和前一个字符都是数字
                sb.append(chars[i]);      //不用_分割，直接放进去
            else if((chars[i-1]>='a'&&chars[i-1]<='z')&&(chars[i]>='a'&&chars[i]<='z')) //该字符和前一个字符都是字母
                sb.append(chars[i]);     //不用_分割，直接放进去
            else
                sb.append("_"+chars[i]);    //该字符和前一个字符不同，用_分割
        }
        sum.add(sb.toString());
    }
}
