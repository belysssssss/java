package 数组leetcode.Nov.first;

/**
 * @Author :zqh
 * @Date 2021/4/24 16:54
 */

import java.util.Scanner;

public class 移除元素 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }
        int n = sc.nextInt();
        int len = Elements(arr, n);
        System.out.print(len + "，");
        Printf(arr, len);
    }

    //双指针法
    static int Elements(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (val != nums[fastIndex])
                nums[slowIndex++] = nums[fastIndex];
        }
        return slowIndex;
    }

    static void Printf(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
