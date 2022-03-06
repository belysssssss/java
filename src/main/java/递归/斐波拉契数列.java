package 递归;

import java.util.Scanner;

public class 斐波拉契数列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据:");
        int a = sc.nextInt();
        int b = fib(a);
        System.out.println(b);
    }

    public static int fib(int n) {

        if (n == 1)
            return 1;
        if (n == 0)
            return 0;
        return fib(n - 1) + fib(n - 2);
    }
}
