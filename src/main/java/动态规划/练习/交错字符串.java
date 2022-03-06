package 动态规划.练习;
/*
* 给定三个字符串s1、s2、s3，请你帮忙验证s3是否是由s1和s2 交错 组成的。
两个字符串 s 和 t 交错 的定义与过程如下，其中每个字符串都会被分割成若干非空子字符串：
s = s1 + s2 + ... + sn
t = t1 + t2 + ... + tm
|n - m| <= 1
交错 是 s1 + t1 + s2 + t2 + s3 + t3 + ...
* 或者 t1 + s1 + t2 + s2 + t3 + s3 + ...
注意：a + b 意味着字符串 a 和 b 连接。
示例 1：
输入：s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
输出：true
示例 2：
输入：s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
输出：false
示例 3：
输入：s1 = "", s2 = "", s3 = ""
输出：true
* */
public class 交错字符串 {
    public static void main(String[] args) {
        String str1="aabcc";
        String str2="dbbca";
        String str3="aadbbbaccc";
        boolean b=isInterleave(str1,str2,str3);
        System.out.println(b);
    }
    public static boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())
            return false;
        boolean[][] dp=new boolean[s1.length()+1][s2.length()+1];
        dp[0][0]=true;
        for (int i = 0; i <= s1.length(); ++i) {
            for (int j = 0; j <= s2.length(); ++j) {
                int p = i + j - 1;
                if (i > 0) {
                    dp[i][j] = dp[i][j] || (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(p));
                }
                if (j > 0) {
                    dp[i][j] = dp[i][j] || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }
}
