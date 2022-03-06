package 蓝桥杯.大数计算;
/*
* 小明对数位中含有 2、0、1、9 的数字很感兴趣，
* 在 1 到 40 中这样的数包括 1、2、9、10 至 32、39和 40，共 28 个，
* 他们的和是 574，平方和是 14362。
注意，平方和是指将每个数分别平方后求和。

请问，在 1 到 2019 中，所有这样的数的平方和是多少？
* */
public class 平方和 {
    public static void main(String[] args) {
        Long sum=0L;
        for(int i=1;i<=2019;i++){
            if(isvalid(i)){
                sum+=(int)Math.pow(i,2);
            }
        }
        System.out.println(sum);
    }

    private static boolean isvalid(int i) {
        String str=""+i;
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)=='2'||str.charAt(j)=='0'||str.charAt(j)=='1'||str.charAt(j)=='9')
                return true;
        }
        return false;
    }
}
