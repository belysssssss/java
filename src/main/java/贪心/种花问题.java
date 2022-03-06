package 贪心;
/*
* 假设有一个很长的花坛，一部分地块种植了花，
* 另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
给你一个整数数组flowerbed 表示花坛，
* 由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数n ，
* 能否在不打破种植规则的情况下种入n朵花？能则返回 true ，不能则返回 false。
示例 1：
输入：flowerbed = [1,0,0,0,1], n = 1
输出：true
* */
public class 种花问题 {
    public static void main(String[] args) {
        int[] arr={1,0,0,0,1,0};
        int n=1;
        boolean b=canPlaceFlowers(arr,n);
        System.out.println(b);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
       if(flowerbed.length==1&&n==1&&flowerbed[0]==0)
           return true;
       if(flowerbed.length==0||flowerbed==null)
           return false;
        for(int i=0;i<flowerbed.length-1;i++){
           if(flowerbed[0]==0&&flowerbed[1]==0){
               flowerbed[0]=1;
               n--;
           }
            if(flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0){
                flowerbed[flowerbed.length-1]=1;
                n--;
            }
            if(i>1&&flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0){
                flowerbed[i]=1;
                n--;
            }
        }
        return n>0?false:true;
    }
}
