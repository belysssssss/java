package 动态规划.子序列.编辑距离;
/*
* 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
字符串的一个子序列是原始字符串删除一些（也可以不删除）
* 字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
进阶：
如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，
* 你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
致谢：
示例 1：
输入：s = "abc", t = "ahbgdc"
输出：true
示例 2：
输入：s = "axc", t = "ahbgdc"
输出：false
* */
public class 判断子序列 {
    public static void main(String[] args) {
        String str1="abc";
        String str2="ahbqdc";
        boolean b=isSubsequence(str1,str2);
        System.out.println(b);
    }
    public static boolean isSubsequence(String s, String t) {
        int[][] dp=new int[s.length()+1][t.length()+1];
        for(int i=0;i<t.length();i++)
            dp[0][i]=0;
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=dp[i][j-1];
            }
        }
        if(dp[s.length()][t.length()]==s.length())
            return true;
        return false;
    }
}
