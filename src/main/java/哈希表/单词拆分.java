package 哈希表;

import java.util.*;

public class 单词拆分 {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict= Arrays.asList(new String[]{"leet", "code"});
        boolean b=wordBreak(s,wordDict);
        System.out.println(b);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> word=new HashSet<>(wordDict);
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&word.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
}
