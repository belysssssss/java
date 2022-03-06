package 蓝桥杯;

public class 数字9 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=2019;i++){
            if(check(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean check(int num) {
        String str=""+num;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='9'){
                return true;
            }
        }
        return false;
    }
}
