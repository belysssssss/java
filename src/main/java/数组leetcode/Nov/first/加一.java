package 数组leetcode.Nov.first;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
*给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。
输入：digits = [1,2,3]
输出：[1,2,4]
解释：输入数组表示数字 123。
*
* */
public class 加一 {
    public static void main(String[] args) {
        int digits[] = {9};
        int arr[] = plusOne(digits);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] != 9) {
                ++digits[i];
                for (int j = i + 1; j < n; ++j) {
                    digits[j] = 0;
                }
                return digits;
            }
        }

        // digits 中所有的元素均为 9
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
/*
* 思路：
* 如果 digits 的末尾没有 99，例如 [1, 2, 3][1,2,3]，那么我们直接将末尾的数加一，得到 [1, 2, 4][1,2,4] 并返回；

如果 digits的末尾有若干个 99，例如 [1, 2, 3, 9, 9][1,2,3,9,9]，那么我们只需要找出从末尾开始的第一个不为 99 的元素，即 33，将该元素加一，得到 [1, 2, 4, 9, 9][1,2,4,9,9]。随后将末尾的 99 全部置零，得到 [1, 2, 4, 0, 0][1,2,4,0,0] 并返回。

如果digits的所有元素都是 99，例如 [9, 9, 9, 9, 9][9,9,9,9,9]，那么答案为 [1, 0, 0, 0, 0, 0][1,0,0,0,0,0]。我们只需要构造一个长度比 digits多 11的新数组，将首元素置为 11，其余元素置为00 即可
* */