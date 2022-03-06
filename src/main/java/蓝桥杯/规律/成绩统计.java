package 蓝桥杯.规律;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class 成绩统计 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        BigDecimal bigDecimal=new BigDecimal("0.00");
        double sum1=0;
        double sum2=0;
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int s=scan.nextInt();
            if(s>=60)
                sum1++;
            if(s>=85)
                sum2++;
        }
        System.out.println(new DecimalFormat("0%").format(sum1/n));
        System.out.println(new DecimalFormat("0%").format(sum2/n));
        scan.close();
    }
}
