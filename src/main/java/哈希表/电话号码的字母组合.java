package 哈希表;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 电话号码的字母组合 {
    public static void main(String[] args) {

        String str="23";
       List<String> list= letterCombinations(str);
        System.out.println(list);
    }
    public static List<String> letterCombinations(String digits) {
        HashMap<Character,String> hashMap=new HashMap<>();
        hashMap.put('2',"abc");
        hashMap.put('3',"def");
        hashMap.put('4',"ghi");
        hashMap.put('5',"jkl");
        hashMap.put('6',"mno");
        hashMap.put('7',"pqrs");
        hashMap.put('8',"tuv");
        hashMap.put('9',"wxyz");
        List<String> list=new ArrayList<>();
        if(digits.length()==0)
            return list;
        backtarck(list,hashMap,digits,0,new StringBuffer());
        return list;
    }

    private static void backtarck(List<String> list, HashMap<Character, String> hashMap, String digits, int i, StringBuffer stringBuffer) {
    if(i==digits.length()){
        list.add(stringBuffer.toString());
    }else{
        char digit=digits.charAt(i);
        String letters=hashMap.get(digit);
        int letterCount=letters.length();
        for (int j=0;j<letterCount;j++){
            stringBuffer.append(letters.charAt(j));
            backtarck(list,hashMap,digits,i+1,stringBuffer);
            stringBuffer.deleteCharAt(i);
        }
        }
    }
}
