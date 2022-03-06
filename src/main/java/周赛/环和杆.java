package 周赛;

public class 环和杆 {
    public static void main(String[] args) {
          String str="B0B6G0R6R0R6G9";
         int s= countPoints(str);
        System.out.println(s);
    }
    public static int countPoints(String rings) {
        String[] strings=new String[10];
        char[] ch=rings.toCharArray();
        int sum=0;
        for(int i=0;i< ch.length;i+=2){
            int j=Integer.parseInt(String.valueOf(ch[i+1]));
            strings[j]=strings[j]+ ch[i];
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
            if(strings[i]!="null")
            {
                String str1=strings[i];
                try {
                    sum += eq(str1);
                }catch (NullPointerException e){
                   e.printStackTrace();
                }
            }else{
                continue;
            }
        }
       return sum;
    }
    public static int eq(String s) {

        if (s.contains("R")&&s.contains("G")&&s.contains("B"))
            return 1;
        return 0;
    }
}
