package 蓝桥杯.大数计算;

public class 数的分解 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<1009;i++){
            for(int j=i+1;j<2019;j++){
                int k=2019-i-j;
                if((i<j)&&(j<k))
                if(islid(i)&&islid(j)&&islid(k))
                    count++;
            }
        }
        System.out.println(count);
    }

    private static boolean islid(int i) {
        String str=""+i;
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)=='2'||str.charAt(j)=='4'){
                return false;
            }
        }
        return true;
    }
}
