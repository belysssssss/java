package 排序;

import java.util.HashMap;
import java.util.Map;

public class 找不同 {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="abcde";
        char c=findTheDifference(str1,str2);
        System.out.println(c);
    }
    public static  char findTheDifference(String s, String t) {
        if(s.length()<t.length()){
            findTheDifference(t,s);
        }
        if(t==" "){
            return s.charAt(0);
        }
        Map<Character,Integer> hashMap=new HashMap<>();
        for(char c1:s.toCharArray()){
            int count=hashMap.getOrDefault(c1,0)+1;
            hashMap.put(c1,count);
        }
        for(char c2:t.toCharArray()){
            int count=hashMap.getOrDefault(c2,0);
            if(count>0){
                count--;
                if(count>0){
                    hashMap.put(c2,count);
                }else {
                    hashMap.remove(c2);
                }
            }
        }
        for(char c2:s.toCharArray()){
            int count=hashMap.getOrDefault(c2,0);
            if(count==1){
                System.out.println(c2);
                return c2;
            }
        }
        return ' ';
    }
}
