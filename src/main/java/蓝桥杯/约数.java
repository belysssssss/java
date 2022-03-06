package 蓝桥杯;

public class 约数 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<2020;i++){
            if(2020%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
