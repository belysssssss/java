package 贪心;

import java.util.HashMap;
import java.util.Map;

/*
* 给定一个正整数n ，你可以做如下操作：
如果n是偶数，则用n / 2替n 。
如果n是奇数，则可以用n + 1或n - 1替换n 。
返回 n变为 1 所需的 最小替换次数 。
示例 1：
输入：n = 8
输出：3
解释：8 -> 4 -> 2 -> 1
示例 2：
输入：n = 7
输出：4
解释：7 -> 8 -> 4 -> 2 -> 1
或 7 -> 6 -> 3 -> 2 -> 1
* */
public class 整数替换 {
    public static void main(String[] args) {
        int n=8;
        int res=integerReplacement(n);
        System.out.println(res);
    }
    //贪心
    public static  int integerReplacement(int n) {
        int ans = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                ++ans;
                n /= 2;
            } else if (n % 4 == 1) {
                ans += 2;
                n /= 2;
            } else {
                if (n == 3) {
                    ans += 2;
                    n = 1;
                } else {
                    ans += 2;
                    n = n / 2 + 1;
                }
            }
        }
        return ans;
    }
    //记忆化搜索
   static  Map<Integer,Integer> map=new HashMap<>();
    public static  int integerReplacement1(int n) {
        if(n==1){
            return 0;
        }
        if(!map.containsKey(n)){
            if(n%2==0){
                map.put(n,1+integerReplacement1(n/2));
            }else{
                map.put(n,2+Math.min(integerReplacement1(n/2),integerReplacement1(n/2+1)));
            }
        }
        return map.get(n);
    }
}
