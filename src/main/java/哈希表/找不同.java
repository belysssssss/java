package 哈希表;

import java.util.HashMap;
import java.util.Map;

public class 找不同 {
    public static void main(String[] args) {
        String s="";
        String t="a";
        char c=findTheDifference(s,t);
        System.out.println(c);
    }
    public static char findTheDifference(String s, String t) {
        if(s.length()<t.length()){
            findTheDifference(t,s);
        }
        if(t==" "){
            return s.charAt(0);
        }
        Map<Character,Integer> hashmap=new HashMap<>();
        for(char ch:s.toCharArray()){
            int count=hashmap.getOrDefault(ch,0)+1;
            hashmap.put(ch,count);
        }
        for(char ch:t.toCharArray()){
            int count=hashmap.getOrDefault(ch,0);
            if(count>0){
                count--;
                if(count>0){
                    hashmap.put(ch,count);
                }else {
                    hashmap.remove(ch);
                }
            }
        }
        for(char ch:s.toCharArray()){
            int count=hashmap.getOrDefault(ch,0);
            if(count>0){
                System.out.println(ch);
               return ch;
            }
        }
      return ' ';
    }

}
