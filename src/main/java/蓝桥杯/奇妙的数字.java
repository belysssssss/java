package 蓝桥杯;

import java.util.Arrays;

/*
* 小明发现了一个奇妙的数字。它的平方和立方正好把 0 ~ 9 的 10 个数字每个用且只用了一次。
* */
public class 奇妙的数字 {
    static int[] arr=new int[]{1,1,1,1,1,1,1,1,1,1};
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            if(check(i)){
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean check(int num) {
        String str1=num*num+""+num*num*num;
        char[] chars=str1.toCharArray();
        Arrays.sort(chars);
        str1=String.valueOf(chars);
        if(str1.equals("0123456789"))
        return true;
        return false;
    }
}
