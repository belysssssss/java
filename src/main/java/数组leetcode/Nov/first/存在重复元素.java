package 数组leetcode.Nov.first;

import java.util.HashSet;

/*
* 给定一个整数数组和一个整数k，
* 判断数组中是否存在两个不同的索引i和j，
* 使得nums [i] = nums [j]，
* 并且 i和j的差的绝对值至多为 k。
* 输入: nums = [1,2,3,1], k = 3
输出: true
* */
public class 存在重复元素 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        int k = 3;
        boolean a = containsNearbyDuplicate(nums, k);
        System.out.println(a);
    }
}
