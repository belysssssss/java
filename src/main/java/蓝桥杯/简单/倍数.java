package 蓝桥杯.easy;
/*
* 请问在 1 到 2020 中，有多少个数既是 44 的整数倍，又是 66 的整数倍。
* */
public class 倍数 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=2020;i++){
            if(i%4==0&&i%6==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
