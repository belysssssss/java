package 数组leetcode.Nov.first;

import java.util.HashMap;
import java.util.Map;

/*
*给定一个非空整数数组，除了某个元素只出现一次以外，
* 其余每个元素均出现两次。找出那个只出现了一次的元素。
* 示例 1:
输入: [2,2,1]
输出: 1
*
* */
public class 只出现一次的数字 {
    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            if (count == null)
                count = 1;
            else
                count++;
            map.put(i, count);
        }
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 2, 4};
        int result = singleNumber(arr);
        System.out.println(result);
    }

}
/*
 * 解题思路：
 * 一：暴力解法：两个for循环，取出一个数，依次比对，没有相等的即答案
 * 二：快排：
 * 三：hashmap:
 * 四：异或：此题文章题干就在表明相等数只有两个，则异或是效率最好的。
 *       result=a^b;^表示异或符号
 *
 * */