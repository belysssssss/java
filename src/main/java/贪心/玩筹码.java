package 贪心;
/*
* 有n个筹码。第 i 个芯片的位置是position[i]。
我们需要把所有筹码移到同一个位置。
* 在一步中，我们可以将第 i 个芯片的位置从position[i]改变为:
position[i] + 2或position[i] - 2，此时cost = 0
position[i] + 1或position[i] - 1，此时cost = 1
返回将所有筹码移动到同一位置上所需要的 最小代价 。
示例 1：
输入：position = [1,2,3]
输出：1
解释：第一步:将位置3的芯片移动到位置1，成本为0。
第二步:将位置2的芯片移动到位置1，成本= 1。
总成本是1。
* */
public class 玩筹码 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int res=minCostToMoveChips(arr);
        System.out.println(res);
    }
    public static int minCostToMoveChips(int[] position) {
       int count0=0;
       for(int i:position){
           count0+=i&1;
       }
       int count1=position.length-count0;
       return count0>count1?count1:count0;
    }
}
