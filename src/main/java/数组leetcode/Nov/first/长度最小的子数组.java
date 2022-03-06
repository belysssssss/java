package 数组leetcode.Nov.first;

import java.util.Scanner;

public class 长度最小的子数组 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        int length = minSubArrayLen3(target, nums);
        System.out.println(length);
    }

    //暴力法
    public static int minSubArrayLen1(int target, int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum >= target) {
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }

        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    //双指针 **最优解**
    public static int minSubArrayLen3(int target, int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
