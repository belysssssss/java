package 蓝桥杯.easy;

public class 猴子分香蕉 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=6;i<10000;i++){
            sum=i;
            if(i%5==1){
                sum=((i-1)/5)*4;
                if(sum%5==2){
                    sum=((sum-2)/5)*4;
                    if(sum%5==3){
                        sum=((sum-3)/5)*4;
                        if(sum%5==4){
                            sum=((sum-4)/5)*4;
                            if(sum%5==0&&sum>5){
                                System.out.println(i);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
