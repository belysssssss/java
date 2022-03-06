package 字符串;

public class 反转字符串ii {
    public static void main(String[] args) {

        String str="abcdefg";
        int n=2;
        String s=reverseStr(str,n);
        System.out.println(s);
    }
    public static String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i+=2*k){
            reverse(ch,i,Math.min(i+k,n)-1);
        }
        return new String(ch);
    }
    public static void reverse(char[] arr,int left,int right){
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
