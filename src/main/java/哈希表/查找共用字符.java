package 哈希表;

import java.util.ArrayList;
import java.util.List;

public class 查找共用字符 {
    public static void main(String[] args) {
   String[] str={"bella","label","roller"};
   List<String> list=commonChars(str);
        System.out.println(list);
    }
    public static List<String> commonChars(String[] words) {
        List<String> list=new ArrayList<>();
        if(words.length==0){
            return list;
        }
        int[] hash=new int[26];
        for(int i=0;i<words[0].length();i++){
            hash[words[0].charAt(i)-'a']++;
        }
        for(int i=1;i<words.length;i++){
            int[] hashstr=new int[26];
            for(int j=0;j<words[i].length();j++){
                hashstr[words[i].charAt(j)-'a']++;
            }
            for(int k=0;k<26;k++){
                hash[k]=Math.min(hash[k],hashstr[k]);
            }
        }
        for(int i=0;i<26;i++){
            while(hash[i]!=0){
                char ch=(char)(i+'a');
                list.add(String.valueOf(ch));
                hash[i]--;
            }
        }
        return list;
    }
}
