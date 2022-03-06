package 哈希表;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 单词规律 {
    public static void main(String[] args) {

        String pattern="abba";
        String str="dog cat cat dog";
        boolean b=wordPattern(pattern,str);
       System.out.println(b);
    }
    public  static boolean wordPattern(String pattern, String s) {
        String[] str1=s.split(" ");
        Map<Integer,String> map1=new HashMap<>();
       HashSet<String> set1=new HashSet<>();
       if(pattern.length()!=str1.length){
           return false;
       }
       for(int i=0;i<str1.length;i++){
           if(map1.containsKey(pattern.charAt(i)-'a')){
               if(!map1.get(pattern.charAt(i)-'a').equals(str1[i])){
                   return false;
               }
           }else {
               if(!set1.contains(str1[i])){
                   map1.put(pattern.charAt(i)-'a',str1[i]);
                   set1.add(str1[i]);
               }else{
                   return false;
               }
           }
       }
       return true;
    }
}
