package 贪心;
/*
* 给你一个仅由数字 6 和 9 组成的正整数num。
你最多只能翻转一位数字，将 6 变成9，或者把9 变成6 。
请返回你可以得到的最大数字。
示例 1：
输入：num = 9669
输出：9969
解释：
改变第一位数字可以得到 6669 。
改变第二位数字可以得到 9969 。
改变第三位数字可以得到 9699 。
改变第四位数字可以得到 9666 。
其中最大的数字是 9969 。
* */
public class 组成的最大数字 {
    public static void main(String[] args) {
        int num=9669;
        int res=maximum69Number(num);
        System.out.println(res);
    }
    public static  int maximum69Number (int num) {
        return 0;
    }
}
