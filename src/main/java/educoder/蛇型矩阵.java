package educoder;

/**
 * @Author :zqh
 * @Date 2021/4/24 19:53
 */

import java.util.Scanner;

public class 蛇型矩阵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = sc.nextInt();
                arr[i][j] = k;
            }
        }
        int a = 1;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {

            }
        }
        Printf(arr, n);
    }

    static void Printf(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
