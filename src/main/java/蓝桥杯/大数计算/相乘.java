package 蓝桥杯.大数计算;

public class 相乘 {
    public static void main(String[] args) {
        long sum=0;
        for(long i=1;i<=1000000007;i++){
            sum=(i*2021)%1000000007;
            if(sum==999999999){
                System.out.println(i);
               return;
            }
        }
    }
}
