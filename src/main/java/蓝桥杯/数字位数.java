package 蓝桥杯;

public class 数字位数 {
    public static void main(String[] args) {
       int sum=0;
        for(int i=1;i<=2020;i++){
            if(i<10){
                sum+=1;
            }else if(i>=10&&i<100){
                sum+=2;
            }else if(i>=100&&i<1000){
                sum+=3;
            }else{
                sum+=4;
            }
        }
        System.out.println(sum);
    }
}
