package 哈希表;

import java.util.HashMap;

public class 判定是否互为字符重排 {
    public static void main(String[] args) {
     String str1="abc";
     String str2="ba";
      Boolean b=CheckPermutation(str1,str2);
        System.out.println(b);
    }
    public static boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char ch:s1.toCharArray()){
            int count=hashMap.getOrDefault(ch,0)+1;
            hashMap.put(ch,count);
        }
        for(char ch:s2.toCharArray()){
            int count=hashMap.getOrDefault(ch,0);
            if(count>0){
                count--;
                hashMap.put(ch,count);
            }
        }
        for(char c:s1.toCharArray()){
            int count=hashMap.getOrDefault(c,0);
            if(count>0){
                return false;
            }
        }
        return true;
    }
}
