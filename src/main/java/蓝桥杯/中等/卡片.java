package 蓝桥杯.middle;

import java.util.Scanner;

/*
* 小蓝有很多数字卡片，每张卡片上都是数字 0 到 9。
* 小蓝准备用这些卡片来拼一些数，他想从 1 开始拼出正整数，
* 每拼一个， 就保存起来，卡片就不能用来拼其它数了。
* 小蓝想知道自己能从 1 拼到多少。 例如，当小蓝有 30 张卡片，
* 其中 0 到 9 各 3 张，
* 则小蓝可以拼出 1 到 10， 但是拼 11 时卡片 1 已经只有一张了，
* 不够拼出 11。 现在小蓝手里有 0 到 9 的卡片各 2021 张
* ，共 20210 张，请问小蓝可以从 11 拼到多少？
* */
public class 卡片 {
    static int[] arr={2021,2021,2021,2021,2021,2021,2021,2021,2021,2021};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int i=1;
        while(sub(i++)){

        }
        System.out.println(i-1);
        scan.close();
        /*
        * // 创建一个数组，用下表代表0-9
        int[] arr = new int[10];
        // 每个元素都赋值2021，代表2021张卡片
        for (int i = 0; i < 10; i++) {
            arr[i] = 2021;
        }

        // 结果
        int result = 0;

        // 从1开始遍历，99999随便设置的
        for (result = 1; result < 999999; result ++) {

            // 将int类型转为String类型
            String iStr = String.valueOf(result);

            // 将iStr分割成数组
            String[] strArr = iStr.split("");

            // 遍历数组
            for (String s : strArr) {

                // 将每个字符串转回int类型，则会是一个0-9的数字
                int i = Integer.parseInt(s);

                // 如果arr[i]>0,将这个i对应的下标，在arr数组中减去
                if (arr[i] > 0) {
                    arr[i] -= 1;
                } else {
                    // 否则直接输出result-1，最后一次不够减需要删去,结束程序
                    System.out.println(result-1);
                    return;
                }
            }
        }
    }
        * */
    }

    private static boolean sub(int i) {
        while(i>0){
            arr[i%10]--;
            if(arr[i%10]==0)
                return false;
            i=i/10;
        }
        return true;
    }

}
