package 递归;

/**
 * @Author :zqh
 * @Date 2021/4/24 13:54
 */

import java.util.Scanner;

public class 小白走楼梯 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int res = f(n);
            System.out.println(res);
        }
    }

    static int f(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return f(n - 1) + f(n - 2) + f(n - 3);

    }
}
