package 蓝桥杯.简单;
/*
* 两个字母之间的距离定义为它们在字母表中位置的距离。
* 例如 A 和 C 的距离为 2，L 和 Q 的距离为 5。
对于一个字符串，我们称字符串中两两字符之间的距离之和
* 为字符串的内部距离。
例如：ZOO 的内部距离为22，其中Z和O的距离为 11。
请问，LANQIAO 的内部距离是多少？
* */
public class 距离和 {
    public static void main(String[] args) {
        char[] chars=new char[]{'L','A','N','Q','I','A','O'};
        int sum=0;
        for(int i=0;i<chars.length;i++){
            for(int j=i+1;j<chars.length;j++){
                sum+=Math.abs(chars[j]-chars[i]);
            }
        }
        System.out.println(sum);
    }
}
