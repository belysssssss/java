package 蓝桥杯.简单;

public class 公约数 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=2020;i++){
            if(2020%i==0&&3030%i==0){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
