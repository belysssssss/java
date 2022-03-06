package 数组leetcode.Nov.first;

import java.util.Scanner;

public class 数组中重复的数组 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[7];
        for (int i = 0; i < nums.length; i++) {
            int a = sc.nextInt();
            nums[i] = a;
        }
        int arr = findRepeatNumber(nums);
        System.out.println(arr);
    }

    public static int findRepeatNumber(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    temp = nums[i];
            }
        }
        return temp;
    }
}
