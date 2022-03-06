package 数组leetcode.Nov.first;

import java.util.Scanner;

public class 数组异或操作1486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int sum = xorOperation(n, start);
        System.out.println(sum);

    }

    public static int xorOperation(int n, int start) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = start + 2 * i;
        int sum = start;
        for (int i = 0; i < n; i++) {
            if (i == (n - 1))
                continue;
            sum = sum ^ arr[i + 1];
        }
        return sum;
    }

}
