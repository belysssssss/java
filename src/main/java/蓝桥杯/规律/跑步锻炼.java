package 蓝桥杯.规律;

import java.util.Calendar;
import java.util.Scanner;

/*
* 小蓝每天都锻炼身体。

正常情况下，小蓝每天跑 1 千米。
* 如果某天是周一或者月初（1 日），为了激励自己，小蓝要跑 2 千米
* 。如果同时是周一或月初，小蓝也是跑 2 千米。
小蓝跑步已经坚持了很长时间，
* 从 2000 年 1 月 1 日周六（含）到 2020 年 10
* 月 1 日周四（含）。请问这段时间小蓝总共跑步多少千米？
* */
public class 跑步锻炼 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        Calendar c=Calendar.getInstance();
        c.set(2000,0,1);
        int year=0;
        int month=0;
        int day=0;
        int week=0;
        int sum=0;
        while(true){
            if(year==2020&&month==10&&day==1)
                break;
            year=c.get(Calendar.YEAR);
            month=c.get(Calendar.MONTH);
            day=c.get(Calendar.DAY_OF_MONTH);
            week=c.get(Calendar.DAY_OF_WEEK);
            if(week==2||day==1){
                sum+=2;
            }else{
                sum+=1;
            }
            c.add(Calendar.DAY_OF_MONTH,1);
        }
        System.out.println(sum);
        scan.close();
    }
}
