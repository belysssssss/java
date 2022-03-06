package 回溯.分割;

import java.util.*;

public class 复原IP地址 {
    public static void main(String[] args) {
        String str="25525511135";
        List<String> list=restoreIpAddresses(str);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
    public static List<String> restoreIpAddresses(String s) {
       List<String> result=new ArrayList<>();
       int len=s.length();
       if(s.length()>12||s.length()<4){
           return result;
       }
        Deque<String> path=new ArrayDeque<>();
       restoreIpAddressesHelper(s,len,0,4,path,result);
       return result;
    }
    private static void restoreIpAddressesHelper(String s,int len,int begin,int residue,Deque<String> path,List<String> result) {
      if(begin==len){
          if(residue==0){
              result.add(String.join(".",path));
          }
          return;
      }
      for(int i=begin;i<begin+3;i++){
          if(i>=len){
              break;
          }
          if(residue*3<len-i){
              continue;
          }
          if(isValid(s,begin,i)){
              String currentIpSegemnt=s.substring(begin,i+1);
              path.addLast(currentIpSegemnt);
              restoreIpAddressesHelper(s,len,i+1,residue-1,path,result);
              path.removeLast();
          }
      }
    }
    private static boolean isValid(String s, int start, int end) {
        int len=end-start+1;
        if(len>1&&s.charAt(start)=='0'){
            return false;
        }
        int res=0;
        while(start<=end){
            res=res*10+s.charAt(start)-'0';
            start++;
        }
        return res>=0&&res<=255;
    }
}
