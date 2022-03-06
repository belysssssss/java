package 数组leetcode.Nov.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class 三数之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List list = threeSum(nums);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int L;
        int R;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            L = i + 1;
            R = nums.length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum < 0)
                    while (L < R && nums[L] == nums[++L]) ;
                else if (sum > 0)
                    while (L < R && nums[R] == nums[--R]) ;
                else {
                    list.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[L], nums[R])));
                    while (L < R && nums[L] == nums[++L]) ;
                    while (L < R && nums[R] == nums[--R]) ;
                }
            }
        }
        return list;
    }
}
