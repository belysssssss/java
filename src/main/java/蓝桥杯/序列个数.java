package 蓝桥杯;

public class 序列个数 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=10;i++) {
            for(int j=i;j<=10;j++) {
                for(int l=j;l<=10;l++) {
                    for(int m=l;m<=10;m++) {
                        for(int n=m;n<=10;n++) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
