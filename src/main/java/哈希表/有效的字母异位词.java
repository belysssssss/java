package 哈希表;

public class 有效的字母异位词 {
    public static void main(String[] args) {
     String s="anagram";
     String t="nagaram";
     boolean res=isAnagram(s,t);
        System.out.println(res);
    }

    public static boolean isAnagram(String s, String t) {
        int[] record=new int[26];
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        for(int i=0;i<ch1.length;i++){
            record[ch1[i]-'a']+=1;
        }
        for(int i=0;i<ch2.length;i++){
            record[ch2[i]-'a']-=1;
        }
        for(int i=0;i<record.length;i++){
            if(record[i]!=0)
                return false;
        }
        return true;
    }
}
