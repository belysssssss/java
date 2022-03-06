package 字符串;

public class URL化 {
    public static void main(String[] args) {

        String str="      ";
        int len=5;
      String s=  replaceSpaces(str,len);
        System.out.println(s);
    }
    public static String replaceSpaces(String S, int length) {
       char[] ch=S.toCharArray();
       int m=0;//有效空格数
       int j=0;//供替换时使用
       int n=length;
       for(int i=0;i<n;i++){
           if(ch[i]==' '){
               m++;
           }
       }
       //得到结果数组的有效长度
       m=m*2+n;
       char[] arr=new char[m];
       for(int i=0;i<n;i++){
           if(ch[i]==' '){
               arr[j++]='%';
               arr[j++]='2';
               arr[j++]='0';
           }else{
               arr[j++]=ch[i];
           }
       }
       return new String(arr);
    }
}
