package 递归;

/**
 * @Author :zqh
 * @Date 2021/4/23 14:52
 */
public class 什么是递归 {
    public static void main(String[] args) {
        f(10);
        System.out.println(f1(4));
    }

    static void f(int i) {
        if (i == 0)
            return;
        f(i - 1);
    }

    //求阶乘
    /*
    1.找重复 n*n-1的阶乘，求n-1的阶乘是原问题的重复；
    2.找变化 变化的量作为参数例如n-1
    3.找边界 阶乘到最后一位只能到1

    */
    static int f1(int i) {
        if (i == 1)
            return i;
        return i * f1(i - 1);
    }

    //打印i-j
    static void f2(int i, int j) {

    }
}
