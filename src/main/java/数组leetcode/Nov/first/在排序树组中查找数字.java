package 数组leetcode.Nov.first;

import java.util.Scanner;

public class 在排序树组中查找数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int target = sc.nextInt();
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int count = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] >= target)
                right = mid;
        }
        while (left < nums.length && nums[left++] == target)
            count++;
        return count;
    }
}
