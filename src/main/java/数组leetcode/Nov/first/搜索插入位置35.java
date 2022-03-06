package 数组leetcode.Nov.first;

/**
 * @Author :zqh
 * @Date 2021/4/24 14:51
 */

import java.util.Scanner;

public class 搜索插入位置35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }
        int c = sc.nextInt();
        Insert(arr, c);
    }

    //暴力解法
    static void Insert(int[] arr, int n) {
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (n <= arr[i]) {
                break;
            }
        }
        System.out.println(i);
    }

    //二分法
    static void Insert1(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        int len = arr.length;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (n < arr[middle])
                right = middle - 1;
            else if (n > arr[middle])
                left = middle + 1;
            else
                System.out.println(middle);
        }
        System.out.println(right + 1);

    }
}
