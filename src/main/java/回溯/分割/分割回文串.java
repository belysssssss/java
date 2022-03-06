package 回溯.分割;

import java.util.ArrayList;
import java.util.List;

public class 分割回文串 {
    public static void main(String[] args) {
        String str="aab";
        List<List<String>> list=partition(str);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static List<List<String>> result=new ArrayList<>();
    static List<String> path=new ArrayList<>();
    public static List<List<String>> partition(String s) {
        backTracking(s,0);
        return result;
    }

    private static void backTracking(String s, int startindex) {
        if(startindex>=s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=startindex;i<s.length();i++){
            if(isPalindrome(s,startindex,i)){
                String str=s.substring(startindex,i+1);
                path.add(str);
            }else {
                continue;
            }
            backTracking(s,i+1);
            path.remove(path.size()-1);
        }
    }

    private static boolean isPalindrome(String s, int startindex, int end) {
        for(int i=startindex,j=end;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
