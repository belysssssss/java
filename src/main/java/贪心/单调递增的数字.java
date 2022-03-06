package 贪心;
/*
* 给定一个非负整数N，找出小于或等于N的最大的整数,
* 同时这个整数需要满足其各个位数上的数字是单调递增。
（当且仅当每个相邻位数上的数字x和y满足x <= y时，我们称这个整数是单调递增的。）
示例 1:
输入: N = 10
输出: 9
示例 2:
输入: N = 1234
输出: 1234

* */
public class 单调递增的数字 {
    public static void main(String[] args) {
        int n=10;
        int res=monotoneIncreasingDigits(n);
        System.out.println(res);
    }
    public static  int monotoneIncreasingDigits(int n) {
        String[] strings=(n+"").split("");
        int start=strings.length;
        for(int i= strings.length-1;i>0;i--){
            if(Integer.parseInt(strings[i]) < Integer.parseInt(strings[i-1])){
                strings[i-1]=(Integer.parseInt(strings[i-1])-1)+"";
                start=i;
            }
        }
        for(int i=start;i<strings.length;i++){
            strings[i]="9";
        }
        return Integer.parseInt(String.join("",strings));
    }
}
