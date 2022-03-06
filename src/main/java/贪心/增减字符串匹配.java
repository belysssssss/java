package 贪心;
/*
* 由范围 [0,n] 内所有整数组成的 n + 1 个整数的排列序列
* 可以表示为长度为 n 的字符串 s ，其中:
如果perm[i] < perm[i + 1]，那s[i] == 'I'
如果perm[i] > perm[i + 1]，那么 s[i] == 'D'
给定一个字符串 s ，重构排列perm 并返回它。
* 如果有多个有效排列perm，则返回其中 任何一个 。
示例 1：
输入：s = "IDID"
输出：[0,4,1,3,2]
* */
public class 增减字符串匹配 {

    public static void main(String[] args) {
        String str="IDID";
        int[] arr=diStringMatch(str);
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static  int[] diStringMatch(String s) {
        int N = s.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (s.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
    }
}
/*
分析

我们首先考虑字符串中的第一个字母。如果 S[0] == 'I'，
那么我们只要令 A[0] = 0，就一定能满足 A[0] < A[1]。
如果 S[0] == 'D'，同样我们只要令 A[0] = N，就一定能满足 A[0] > A[1]。
接下来，当我们考虑 S 中剩下的 N - 1 个字母时，还剩下 N 个数可以使用，
这 N 个数为 [0 .. N - 1] 或 [1 .. N]。可以发现，由于 S[0] 的值已经确定
，那么剩下 S 中的 N - 1 个字母和 N 个可用的数变成了一个和原问题相同，但规模为 N - 1 的问题。
即如果 S[1] == 'I'，我们就令 A[1] 为剩下数中最小的那个数；如果 S[1] == 'D'，我们就令 A[1] 为剩下数中最大的那个数。
我们每次会把可以使用的数的集合中的最小值或最大值取出，并放到当前的位置，因此可以使用的数的集合总是连续的，就可以非常方便的进行维护。
算法
我们维护当前未使用的最小和最大的数，它们对应的区间为当前未使用的数的集合。
从左向右扫描字符串，如果碰到 'I'，就取出当前最小的数，否则取出当前最大的数。
class Solution {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

        ans[N] = lo;
        return ans;
    }
}

* */
