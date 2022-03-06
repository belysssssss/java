package 蓝桥杯.规律;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/*
* 小明正在整理一批历史文献。这些历史文献中出现了很多日期。小明知道这些日期都在
*  1960 年 1 月 1 日至 2059 年 12 月 31 日。令小明头疼的是，
* 这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。
更加麻烦的是，年份也都省略了前两位，使得文献上的一个日期，存在很多可能的日期与其对应。
比如 02/03/04，可能是 2002 年 03 月 04 日、
* 2004 年 02 月 03 日或 2004 年 03 月 02 日。
给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗？
输入描述
一个日期，格式是 "AA/BB/CCAA/BB/CC"
输出描述
输出若干个不相同的日期，
* 每个日期一行，格式是 "yyyy-MM-ddyyyy−MM−dd"。多个日期按从早到晚排列。
示例
输入
02/03/04
输出
2002-03-04
2004-02-03
2004-03-02
* */
public class 日期问题 {
    static TreeSet<String> ss=new TreeSet<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] s = string.split("/");
//        System.out.println(Arrays.toString(s));
        check(s[0], s[1], s[2]);
        check(s[2], s[0], s[1]);
        check(s[2], s[1], s[0]);
//        ss.sort((o1, o2) -> {
//            int len = Math.max(o1.length(),o2.length());
//            int min = o1.length()-o2.length();
//            for (int i = 0; i < len; i++) {
//                if (o1.charAt(i)<o2.charAt(i)){
//                    return -1;
//                }else if (o1.charAt(i)>o2.charAt(i)){
//                    return 1;
//                }
//            }
//            return min;
//        });
        ss.forEach((o)->{
            System.out.println(o);
        });
    }

    static void check(String yy, String mm, String dd) {
        int[] num = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int y = Integer.parseInt(yy);
        int m = Integer.parseInt(mm);
        int d = Integer.parseInt(dd);
        if (y >= 60 && y <= 99) {
            y = 1900 + y;
        } else if (y >= 0 && y <= 59) {
            y = 2000 + y;
        }
        if (m > 0 && m < 13) {
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) num[2] += 1;
            if (d <= num[m] && d > 0) {
                ss.add(String.format("%d-%02d-%02d", y, m, d));
            }
        }
    }
}
