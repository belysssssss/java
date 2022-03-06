package 蓝桥杯.简单;
/*
* 把 abcd...s 共19个字母组成的序列重复拼接106次，得到长度为2014 的串。
接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母。
得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请输出该字母。
* */
public class 猜字母 {
    public static void main(String[] args) {
        String s = "";
        for(int i=1;i<=106;i++) {
            s = s+ "abcdefghijklmnopqrs";
        }
        String t = "";
        while(s.length()!=1) {
            t = "";
            for(int i=1;i<s.length();i=i+2) {
                t = t + s.charAt(i);
            }
            s = t;
        }
        System.out.println(s);
    }
}
