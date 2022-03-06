package 回溯.练习;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
*
*给定一个字符串数组 arr，字符串 s 是将 arr 某一子序列字符串连接所得的字符串，如果 s 中的每一个字符都只出现过一次，那么它就是一个可行解。
请返回所有可行解 s 中最长长度。
示例 1：
输入：arr = ["un","iq","ue"]
输出：4
解释：所有可能的串联组合是 "","un","iq","ue","uniq" 和 "ique"，最大长度为 4。
示例 2：
输入：arr = ["cha","r","act","ers"]
输出：6
解释：可能的解答有 "chaers" 和 "acters"。
示例 3：
输入：arr = ["abcdefghijklmnopqrstuvwxyz"]
输出：26
* */
public class 串联字符串的最大长度 {
    public static void main(String[] args) {
        String[] str = {"un", "iq", "ue"};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++)
            list.add(str[i]);
        int res = maxLength(list);
        System.out.println(res);
    }

    static int ans = 0;

    public static int maxLength(List<String> arr) {
        List<Integer> masks = new ArrayList<>();
        for (String s : arr) {
            int mask = 0;
            for (int i = 0; i < s.length(); i++) {
                int ch = s.charAt(i) - 'a';
                if (((mask >> ch) & 1) != 0) {
                    mask = 0;
                    break;
                }
                mask |= 1 << ch;
            }
            if (mask > 0) {
                masks.add(mask);
            }
        }
        backTracking(masks, 0, 0);
        return ans;
    }

    private static void backTracking(List<Integer> masks, int i, int i1) {
        if (i == masks.size()) {
            ans = Math.max(ans, Integer.bitCount(i1));
            return;
        }
        if ((i1 & masks.get(i)) == 0) {
            backTracking(masks, i + 1, i1 | masks.get(i));
        }
        backTracking(masks, i + 1, i1);
    }
    static StringBuffer sb=new StringBuffer();
    static int res1=0;
    public static int maxlenth(List<String> arr){
        dfs(arr,0);
        return res1;
    }

    private static void dfs(List<String> arr, int i) {
        char[] ch=sb.toString().toCharArray();
        Set<Character> set=new HashSet<>();
        for(char c:ch){
            if(set.contains(c)){
                return;
            }else{
                set.add(c);
            }
        }
        res1=Math.max(res1,sb.length());
        for(int j=i;j<arr.size();j++){
            sb.append(arr.get(i));
            dfs(arr,j+1);
            sb.delete(sb.length()-arr.get(i).length(),sb.length());
        }
    }
}
