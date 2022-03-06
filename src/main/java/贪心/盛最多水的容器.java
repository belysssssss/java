package 贪心;
/*
* 给你 n 个非负整数 a1，a2，...，an，
* 每个数代表坐标中的一个点(i,ai) 。
* 在坐标内画 n 条垂直线，垂直线 i的两个端点分别为
* (i,ai) 和 (i, 0) 。
* 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
说明：你不能倾斜容器。
示例 1：
输入：[1,8,6,2,5,4,8,3,7]
输出：49
解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。
* 在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。

* */
public class 盛最多水的容器 {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int res=maxArea(arr);
        System.out.println(res);
    }
    public static  int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max1=0;
       while(left<right){
           max1=Math.max(max1,(right-left)*(Math.min(height[right],height[left])));
           if(height[left]<=height[right]){
               left++;
           }else
               right--;
       }
        return max1;
    }
}
