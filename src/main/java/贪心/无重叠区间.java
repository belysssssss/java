package 贪心;

import java.util.Arrays;
import java.util.Comparator;

/*
*给定一个区间的集合intervals
* 其中 intervals[i] = [starti, endi]
* 。返回 需要移除区间的最小数量，使剩余区间互不重叠。
示例 1:
输入: intervals = [[1,2],[2,3],[3,4],[1,3]]
输出: 1
解释: 移除 [1,3] 后，剩下的区间没有重叠。
示例 2:
输入: intervals = [ [1,2], [1,2], [1,2] ]
输出: 2
解释: 你需要移除两个 [1,2] 来使剩下的区间没有重叠。
* */
public class 无重叠区间 {
    public static void main(String[] args) {
        int[][] arr={{1,2},{2,3},{3,4},{1,3}};
        int res=eraseOverlapIntervals(arr);
        System.out.println(res);
    }
    public static  int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0)
            return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int ans=1;
        int right=intervals[0][1];
        int n=intervals.length;
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=right){
                ans++;
                right=intervals[i][1];
            }
        }
        return n-ans;
    }
}
/*
*
代码
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[1] - interval2[1];
            }
        });

        int n = intervals.length;
        int right = intervals[0][1];
        int ans = 1;
        for (int i = 1; i < n; ++i) {
            if (intervals[i][0] >= right) {
                ++ans;
                right = intervals[i][1];
            }
        }
        return n - ans;
    }
}
复杂度分析
时间复杂度：O(n \log n)O(nlogn)，其中 nn 是区间的数量。我们需要 O(n \log n)O(nlogn) 的时间对所有的区间按照右端点进行升序排序，并且需要 O(n)O(n) 的时间进行遍历。由于前者在渐进意义下大于后者，因此总时间复杂度为 O(n \log n)O(nlogn)。
空间复杂度：O(\log n)O(logn)，即为排序需要使用的栈空间。
* */