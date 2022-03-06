package 回溯.练习;

import java.util.ArrayList;
import java.util.List;

public class 括号生成 {
    public static void main(String[] args) {
        int n=3;
        List<String> list=generateParenthesis(n);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        backTracking(list,new StringBuffer(),0,0,n);
        return list;
    }

    private static void backTracking(List<String> list, StringBuffer stringBuffer,int open,int close, int n) {
        if(stringBuffer.length()==n*2){
            list.add(stringBuffer.toString());
            return;
        }
        if(open<n){
            stringBuffer.append("(");
            backTracking(list,stringBuffer,open+1,close,n);
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
        }
        if(close<open){
            stringBuffer.append(")");
            backTracking(list,stringBuffer,open,close+1,n);
            stringBuffer.deleteCharAt(stringBuffer.length()-1);
        }
    }
}
