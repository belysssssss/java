//对于有序数组的算法中，二分法不能少
package 数组leetcode.Nov.first;

import java.util.Scanner;

public class 缺失的数字剑指53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            nums[i] = a;
        }
        int sum = missingNumber(nums);
        System.out.println(sum);
    }

    public static int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] != mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left == nums.length - 1 && nums[left] == left ? left + 1 : left;
    }
}
