package 数组leetcode.Nov.first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* 给定两个数组，编写一个函数来计算它们的交集
* 输入：nums1 = [1,2,2,1], nums2 = [2,2]
输出：[2,2]
* */
public class 两个数组的交集 {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        int arr[] = intersect(nums1, nums2);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
       /*
       * 由于同一个数字在两个数组中都可能出现多次，因此需要用哈希表存储每个数字出现的次数。对于一个数字，其在交集中出现的次数等于该数字在两个数组中出现次数的最小值。
首先遍历第一个数组，并在哈希表中记录第一个数组中的每个数字以及对应出现的次数，然后遍历第二个数组，对于第二个数组中的每个数字，如果在哈希表中存在这个数字，则将该数字添加到答案，并减少哈希表中该数字出现的次数。
为了降低空间复杂度，首先遍历较短的数组并在哈希表中记录每个数字以及对应出现的次数，然后遍历较长的数组得到交集。
       * */
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }

}
