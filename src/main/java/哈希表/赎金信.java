package 哈希表;

import java.util.HashMap;
import java.util.Map;

public class 赎金信 {
    public static void main(String[] args) {
      String str1="aab";
      String str2="baa";
      boolean b=canConstruct(str1,str2);
        System.out.println(b);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
     if(ransomNote.length()>magazine.length())
         canConstruct(magazine,ransomNote);
        Map<Character,Integer> map=new HashMap<>();
     char[] ch1=ransomNote.toCharArray();
     char[] ch2=magazine.toCharArray();
      for(char c:ch1){
          int count=map.getOrDefault(c,0)+1;
          map.put(c,count);
      }
      for(char c:ch2){
          int count=map.getOrDefault(c,0);
          if(count>0){
              count--;
              if(count>0){
                  map.put(c,count);
              }else{
                  map.remove(c);
              }
          }
      }
        for(char c:ch1){
            int count=map.getOrDefault(c,0);
            if(count>0){
                return false;
            }
        }
        return true;
    }
    public static boolean canConstruct1(String r,String m){
        if(r.length()>m.length())
            return false;
        int[] cnt=new int[26];
        for(char c:r.toCharArray()){
            cnt[c-'a']++;
        }
        for(char c:m.toCharArray()){
            cnt[c-'a']--;
            if(cnt[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}
