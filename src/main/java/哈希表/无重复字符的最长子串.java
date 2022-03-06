package 哈希表;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  String str= sc.next();
        String str1="abcabcaa";
        int res=lengthOfLongestSubstring(str1);
        System.out.println(res);
    }
    public static int lengthOfLongestSubstring(String s) {
       HashSet<Character> hashSet=new HashSet<>();
       int rk=-1,ans=0;
       int n=s.length();
       for(int i=0;i<n;i++){
           if(i!=0){
               hashSet.remove(s.charAt(i-1));
           }
           while(rk+1<n&&!hashSet.contains(s.charAt(rk+1))){
               hashSet.add(s.charAt(rk+1));
               rk++;
           }
           ans=Math.max(ans,rk-i+1);
       }
       return ans;
    }
}
