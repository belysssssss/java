package 蓝桥杯.大数计算;
/*
* 本题为填空题，只需要算出结果后，
* 在代码中使用输出语句将所填结果输出即可。
我们知道第一个质数是 22、第二个质数是 33、第三个质数是 55……
请你计算第 20192019 个质数是多少？
* */
public class 质数 {
    public static void main(String[] args) {
        int count=1;
        int i;
        for( i=3;i<=20000;i++){
           if(isvalid(i)){
               count++;
           }
           if(count==2019){
               break;
           }
        }
        System.out.println(i);
    }

    private static boolean isvalid(int i) {
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
