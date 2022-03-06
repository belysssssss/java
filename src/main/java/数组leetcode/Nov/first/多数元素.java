package 数组leetcode.Nov.first;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
* 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。

* 示例 1：

输入：[3,2,3]
输出：3
*
* */
public class 多数元素 {

    public static void main(String[] args) {
        int nums[] = {3, 2, 3};
        int res = majorityElement(nums);
        System.out.println(res);
    }

    public static int majorityElement(int[] nums) {
        int count;
        Arrays.sort(nums);
        return nums[nums[nums.length / 2]];
    }
}
