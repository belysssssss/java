package 蓝桥杯.大数计算;
/*
* 到 X 星球旅行的游客都被发给一个整数，作为游客编号。
X 星的国王有个怪癖，他只喜欢数字 3,5 和 7。
国王规定，游客的编号如果只含有因子：3,5,7,就可以获得一份奖品。
我们来看前 10 个幸运数字是：
3 5 7 9 15 21 25 27 35 45
因而第 11 个幸运数字是： 49
小明领到了一个幸运数字 59084709587505，他去领奖的时候，
* 人家要求他准确地说出这是第几个幸运数字，否则领不到奖品。
请你帮小明计算一下，59084709587505 是第几个幸运数字。
* */
public class 第几个幸运数字 {
    public static void main(String[] args) {
        long sum= 59084709587505L;
        int count=-1;
        for(long i=0;Math.pow(3,i)<=sum;i++){
            for(long j=0;Math.pow(5,j)<=sum;j++){
                for(long k=0;Math.pow(7,k)<=sum;k++){
                    if(Math.pow(3,i)*Math.pow(5,j)*Math.pow(7,k)<=sum){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
