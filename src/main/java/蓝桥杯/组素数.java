package 蓝桥杯;
/*
* 素数就是不能再进行等分的数。比如2 3 5 7 11 等。
* 9=3∗3 说明它可以3等分，因而不是素数。
我们国家在 1949 年建国。如果只给你 1\ 9\ 4\ 9 这 4个数字卡片，
* 可以随意摆放它们的先后顺序（但卡片不能倒着摆放啊，我们不是在脑筋急转弯！），
* 那么，你能组成多少个 4 位的素数呢？
比如：1949，4919 都符合要求。
请你输出能组成的 4 位素数的个数，不要罗列这些素数!!
* */
public class 组素数 {
    public static void main(String[] args) {
        int[] a = { 1949, 1994, 1499, 4199, 4919,
                4991, 9149, 9419, 9914, 9941, 9194, 9491 };
        int count=0;
        for(int i=0;i<a.length;i++){
            if(check(i)){
                count++;
            System.out.println(i);
            }
        }
        System.out.println(count);
    }

    private static boolean check(int num) {
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
