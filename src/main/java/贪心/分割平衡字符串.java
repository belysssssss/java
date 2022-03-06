package 贪心;

public class 分割平衡字符串 {
    public static void main(String[] args) {
        String str="RLRRLLRLRL";
        int res=balancedStringSplit(str);
        System.out.println(res);
    }
    public static  int balancedStringSplit(String s) {
        int count1=0;
        int count2=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')
            count1++;
            if(s.charAt(i)=='L')
                count2++;
            if(count1==count2){
                count++;
            }
        }
        return count;
    }
}
