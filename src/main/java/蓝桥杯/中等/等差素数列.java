package 蓝桥杯.middle;

public class 等差素数列 {
    public static void main(String[] args) {
        int len=10;
        for(int i=1;i<2000;i++){
            if(!isvalid(i)){
                continue;
            }
            for(int j=5;j<10000;j++){
                int temp=i;
                for(int k=0;k<10;k++){
                    if(k==9){
                        System.out.println(j);
                        break;
                    }
                    temp+=j;
                    if(isvalid(temp)){
                        continue;
                    }else{
                        break;
                    }
                }
            }
        }
    }
    public static boolean isvalid(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
