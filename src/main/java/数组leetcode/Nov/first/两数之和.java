package 数组leetcode.Nov.first;

import java.util.Scanner;

public class 两数之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入目标数据:");
        int a = sc.nextInt();
        int nums[] = {3, 3};

        int c[];
        c = twoSum(nums, a);
        for (int i = 0; i < c.length; i++)
            System.out.println(c[i]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int x[] = {0, 0};
        for (int j = 0; j < nums.length - 1; j++)
            for (int z = j + 1; z < nums.length; z++) {
                if ((nums[j] + nums[z]) == target) {
                    x[0] = j;
                    x[1] = z;
                }
            }
        return x;
    }
}
