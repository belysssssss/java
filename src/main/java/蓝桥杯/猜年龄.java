package 蓝桥杯;

public class 猜年龄 {
    static int[] arr={1,1,1,1,1,1,1,1,1,1};
    public static void main(String[] args) {
        for(int i=11;i<50;i++){
            int sum=i*i*i;
            int sum1=sum*i;
            String str=""+sum+sum1;
            if(check(str)){
                System.out.println(i);
            }
        }
    }

    private static boolean check(String str) {
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'0']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                return false;
            }
        }
        return true;
    }
}
