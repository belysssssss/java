package 数组leetcode.Nov.first;

import java.util.Scanner;

public class 两有序数之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入目标数据:");
        int a = sc.nextInt();
        int nums[] = {2, 3, 4};
        int c[];
        c = twoSum(nums, a);
        for (int i = 0; i < c.length; i++)
            System.out.println(c[i]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int x[] = {0, 0};
        for (int j = 0; j < numbers.length - 1; j++)
            for (int z = j + 1; z < numbers.length; z++) {
                if ((numbers[j] + numbers[z]) == target) {
                    x[0] = j + 1;
                    x[1] = z + 1;
                }
            }
        return x;
    }
}
