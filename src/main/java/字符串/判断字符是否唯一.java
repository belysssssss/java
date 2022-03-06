package 字符串;

public class 判断字符是否唯一 {
    public static void main(String[] args) {
        String str="leetcode";
        boolean s=isUnique(str);
        System.out.println(s);
    }
    public static boolean isUnique(String astr) {
        int[] arr=new int[26];
        for(int i=0;i<astr.length();i++){
            arr[astr.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]>1){
                return false;
            }
        }
return  true;
    }

}
