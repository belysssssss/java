package 回溯.组合类型;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
* 给定一个仅包含数字2-9的字符串，
* 返回所有它能表示的字母组合。
* 答案可以按 任意顺序 返回。
给出数字到字母的映射如下（与电话按键相同）。
* 注意 1 不对应任何字母。
示例 1：
输入：digits = "23"
输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
*
* */
public class 电话号码的字母组合 {
    public static void main(String[] args) {
        String digits="23";
        List<String> list=letterCombinations(digits);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static List<String> letterCombinations(String digits) {
      List<String> list=new ArrayList<>();
        HashMap<Character,String> hashMap=new HashMap<>();
        hashMap.put('2',"abc");
        hashMap.put('3',"def");
        hashMap.put('4',"ghi");
        hashMap.put('5',"jkl");
        hashMap.put('6',"mno");
        hashMap.put('7',"pqrs");
        hashMap.put('8',"tuv");
        hashMap.put('9',"wxyz");
        if(digits.length()==0){
            return list;
        }
        letterCombinationHelper(hashMap,list,digits,0,new StringBuffer());
        return list;
    }

    private static void letterCombinationHelper(HashMap<Character, String> hashMap, List<String> list, String digits, int i, StringBuffer stringBuffer) {
        if(i==digits.length()){
            list.add(stringBuffer.toString());
            return;
        }else{
            char digit=digits.charAt(i);
            String letter=hashMap.get(digit);
            int len=letter.length();
            for(int j=0;j<len;j++){
                stringBuffer.append(letter.charAt(j));
                letterCombinationHelper(hashMap,list,digits,i+1,stringBuffer);
                stringBuffer.deleteCharAt(i);
            }
        }
    }

}
