package 数组leetcode.Nov.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 四数之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println("请输入数据:");
        int n = sc.nextInt();
        List list = fourSum(nums, n);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        return list;
    }
}
