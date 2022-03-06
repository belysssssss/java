package 贪心;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
736
*字符串 S 由小写字母组成。
* 我们要把这个字符串划分为尽可能多的片段
* ,同一字母最多出现在一个片段中。
* 返回一个表示每个字符串片段的长度的列表。
示例：
输入：S = "ababcbacadefegdehijhklij"
输出：[9,7,8]
解释：
划分结果为 "ababcbaca", "defegde", "hijhklij"。
每个字母最多出现在一个片段中。
像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
* */
public class 划分字母区间 {
    public static void main(String[] args) {
        String str="ababcbacadefegdehijhklij";
        List<Integer> list=partitionLabels(str);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static List<Integer> partitionLabels(String s) {
        List<Integer> list=new LinkedList<>();
        int[] edge=new int[26];
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            edge[chars[i]-'a']=i;//记录每个字母所存放的最远距离
        }
        int index=0;
        int last=-1;
        for(int i=0;i<chars.length;i++){
            index=Math.max(index,edge[chars[i]-'a']);// 更新「已扫描的字符中最远的位置」
            if(i==index){// 正好扫描到「已扫描的字符的最远位置」，到达切割点
                list.add(i-last);
                last=i;// 更新，下一个待切割的字符串的起始位置
            }
        }
        return list;
    }
}
/*
*
* 本题就是需要一开始对每个字母的最远距离算清楚
* 然后当最远距离刚好与索引相同时，便是分割的时候
* */