package 回溯.练习;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
* 累加数 是一个字符串，组成它的数字可以形成累加序列。
一个有效的 累加序列 必须 至少 包含 3 个数。
* 除了最开始的两个数以外，
* 序列中的每个后续数字必须是它之前两个数字之和。
给你一个只包含数字'0'-'9'的字符串，
* 编写一个算法来判断给定输入是否是累加数。
* 如果是，返回 true ；否则，返回 false 。
说明：累加序列里的数，除数字 0 之外，不会 以 0 开头，
* 所以不会出现1, 2, 03 或者1, 02, 3的情况。
示例 1：
输入："112358"
输出：true
解释：累加序列为:
*  1, 1, 2, 3, 5, 8 。
* 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
示例2：
输入："199100199"
输出：true
解释：累加序列为: 1, 99, 100, 199。
* 1 + 99 = 100, 99 + 100 = 199

*/
public class 累加数 {
    public static void main(String[] args) {
        String str="112358";
        boolean res=isAdditiveNumber(str);
        System.out.println(res);
    }
    public static boolean isAdditiveNumber(String num) {
        return backTracking(num,0,0,0,0);
    }

    private static boolean backTracking(String num, int index, int count, long prev, long pre) {
        if(index>=num.length()){
            return count>2;
        }
        long current=0;
        for(int i=index;i<num.length();i++){
            char c=num.charAt(i);
            if(num.charAt(index)=='0'&&i>index){
                //剪枝1：不能作为前导0，但是他自己是可以单独作为0使用
                return false;
            }
            current=current*10+c-'0';
            if(count>=2){
                long sum=prev+pre;
                if(current>sum){
                    //剪枝2：如果当前数比两数和还大，说明不合适
                    return false;
                }
                if(current<sum){
                    //剪枝3：如果当前数比两数和还小，说明还不够，可以继续添加
                    continue;
                }
            }
            //当满足条件后，或者不到两个数，向下一层搜索
            if(backTracking(num,i+1,count+1,pre,current)){
                return true;
            }
        }
        return false;
    }
/*
*
* *
 */
        String num;
        int n;
        List<List<Integer>> list = new ArrayList<>();
        public boolean isAdditiveNumber1(String _num) {
            num = _num;
            n = num.length();
            return dfs(0);
        }
        boolean dfs(int u) {
            int m = list.size();
            if (u == n) return m >= 3;
            int max = num.charAt(u) == '0' ? u + 1 : n;
            List<Integer> cur = new ArrayList<>();
            for (int i = u; i < max; i++) {
                cur.add(0, num.charAt(i) - '0');
                if (m < 2 || check(list.get(m - 2), list.get(m - 1), cur)) {
                    list.add(cur);
                    if (dfs(i + 1)) return true;
                    list.remove(list.size() - 1);
                }
            }
            return false;
        }
        boolean check(List<Integer> a, List<Integer> b, List<Integer> c) {
            List<Integer> ans = new ArrayList<>();
            int t = 0;
            for (int i = 0; i < a.size() || i < b.size(); i++) {
                if (i < a.size()) t += a.get(i);
                if (i < b.size()) t += b.get(i);
                ans.add(t % 10);
                t /= 10;
            }
            if (t > 0) ans.add(t);
            boolean ok = c.size() == ans.size();
            for (int i = 0; i < c.size() && ok; i++) {
                if (c.get(i) != ans.get(i)) ok = false;
            }
            return ok;
        }

}
