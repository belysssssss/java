package 贪心;

import java.util.Arrays;
import java.util.Comparator;

/*
* 在二维空间中有许多球形的气球。对于每个气球，
* 提供的输入是水平方向上，气球直径的开始和结束坐标。
* 由于它是水平的，所以纵坐标并不重要，因此只要知道开始和结束的横坐标就足够了。
* 开始坐标总是小于结束坐标。
一支弓箭可以沿着 x 轴从不同点完全垂直地射出。
* 在坐标 x 处射出一支箭，
* 若有一个气球的直径的开始和结束坐标为 xstart，xend，
* 且满足 xstart≤ x ≤ xend，则该气球会被引爆。
* 可以射出的弓箭的数量没有限制。 弓箭一旦被射出之后，
* 可以无限地前进。我们想找到使得所有气球全部被引爆，所需的弓箭的最小数量。
给你一个数组 points ，
* 其中 points [i] = [xstart,xend]
* ，返回引爆所有气球所必须射出的最小弓箭数。
示例 1：
输入：points = [[10,16],[2,8],[1,6],[7,12]]
输出：2
解释：对于该样例，x = 6 可以射爆 [2,8],[1,6] 两个气球，以及 x = 11 射爆另外两个气球
* */
public class 用最少数量的箭引爆气球 {
    public static void main(String[] args) {
        int[][] arr={{10,16},{2,8},{1,6},{7,12}};
        int res=findMinArrowShots(arr);
        System.out.println(res);
    }
    public static int findMinArrowShots(int[][] points) {
        if(points.length==0)
            return 0;
       Arrays.sort(points,(a,b)->{
           return Integer.compare(a[0],b[0]);
       });
       int ans=1;
       int n=points.length;
       for(int i=1;i<n;i++){
           if(points[i-1][1]<points[i][0]){
               ans++;
           }else{
               points[i][1]=Math.min(points[i][1],points[i-1][1]);
           }
       }
        return ans;
    }

}
/*
* 在坐标 x 处射出一支箭，若有一个气球的直径的开始和结束坐标为 xstart，xend， 且满足 xstart ≤ x ≤ xend，则该气球会被引爆。
为达到最小化弓箭数，需要保证一弓箭尽可能多的引爆多个气球，即可以理解为：求出气球坐标的重叠数，因此我们需要对输入数组进行排序，按照气球起始位置排序或者按照气球终止位置排序皆可，本次题解采用的是前者，如果气球重叠了，重叠气球中右边边界的最小值之前的区间一定需要一个弓箭。
* */