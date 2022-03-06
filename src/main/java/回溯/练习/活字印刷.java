package 回溯.练习;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 你有一套活字字模tiles，
* 其中每个字模上都刻有一个字母tiles[i]。
* 返回你可以印出的非空字母序列的数目。
注意：本题中，每个活字字模只能使用一次。
示例 1：
输入："AAB"
输出：8
解释：可能的序列为 "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA"。
示例 2：
输入："AAABBC"
输出：188

* */
public class 活字印刷 {
    public static void main(String[] args) {
        String str="AAABBC";
        int res=numTilePossibilities(str);
        System.out.println(res);
    }
    static int count=0;
    static boolean[] used;
    public static  int numTilePossibilities(String tiles) {
        used=new boolean[tiles.length()];
        char[] chars=tiles.toCharArray();
        Arrays.sort(chars);
        backTracking(chars,0,used);
        return count-1;
    }

    private static void backTracking(char[] tiles, int start,boolean[] used) {
        count++;
        for(int i=start;i<tiles.length;++i){
            if(used[i]||(i-1>=0&&tiles[i]==tiles[i-1]&&!used[i-1]))
                continue;
            used[i]=true;
            backTracking(tiles,0,used);
            used[i]=false;
        }
    }
}
