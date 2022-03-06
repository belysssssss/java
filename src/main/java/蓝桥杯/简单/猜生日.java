package 蓝桥杯.easy;
/*
* 今年的植树节（2012 年 3 月 12 日），
* 小明和他的叔叔还有小伙伴们一起去植树。休息的时候，
* 小明的同学问他叔叔多大年纪，他叔叔说：“我说个题目，看你们谁先猜出来！”
“把我出生的年月日连起来拼成一个8位数（月、日不足两位前补 00）
* 正好可以被今天的年、月、日整除！”
他想了想，又补充到：“再给个提示，我是 6 月出生的。”
根据这些信息，请你帮小明算一下，他叔叔的出生年月日。
格式是年月日连成的 8位数。例如，如果是 1948 年 6 月 12 日
* ，就写：19480612。
* */
public class 猜生日 {
    public static void main(String[] args) {
       String str1;
       String str2;
       String str;
       int sum=0;
        for(int i=1;i<=99;i++){
            for(int j=1;j<=30;j++){
                if(i<10)
                     str1="190"+i;
                else
                    str1="19"+i;
                if(j<10)
                    str2="0"+j;
                else
                    str2=""+j;
                str=str1+"06"+str2;
                sum=Integer.parseInt(str);
                if(sum%2012==0&&sum%3==0&&sum%12==0){
                    System.out.println(sum);
                    break;
                }
            }
        }
    }
}
