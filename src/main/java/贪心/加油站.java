package 贪心;
/*
*在一条环路上有N个加油站，其中第i个加油站有汽油gas[i]升。
你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1个加油站需要消耗汽油cost[i]升。你从其中的一个加油站出发，开始时油箱为空。
如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。
说明:
如果题目有解，该答案即为唯一答案。
输入数组均为非空数组，且长度相同。
输入数组中的元素均为非负数。
示例1:
输入:
gas  = [1,2,3,4,5]
cost = [3,4,5,1,2]
输出: 3
解释:
从 3 号加油站(索引为 3 处)出发，可获得 4 升汽油。此时油箱有 = 0 + 4 = 4 升汽油
开往 4 号加油站，此时油箱有 4 - 1 + 5 = 8 升汽油
开往 0 号加油站，此时油箱有 8 - 2 + 1 = 7 升汽油
开往 1 号加油站，此时油箱有 7 - 3 + 2 = 6 升汽油
开往 2 号加油站，此时油箱有 6 - 4 + 3 = 5 升汽油
开往 3 号加油站，你需要消耗 5 升汽油，正好足够你返回到 3 号加油站。
因此，3 可为起始索引。
* */
public class 加油站 {
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        int res=canCompleteCircuit1(gas,cost);
        System.out.println(res);
    }
    //解法一
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int min=0;
        for(int i=0;i<gas.length;i++){
            sum+=(gas[i]-cost[i]);
            min=Math.min(sum,min);
        }
        if(sum<0)
            return  -1;
        if(min>=0)
            return 0;
        for(int i=gas.length-1;i>0;i--){
            min+=(gas[i]-cost[i]);
            if(min>=0)
                return i;
        }
        return -1;
    }
    //解法二
    public static int canCompleteCircuit1(int[] gas, int[] cost) {
        int curSum=0;
        int totalSum=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
            curSum+=gas[i]-cost[i];
            totalSum+=gas[i]-cost[i];
            if(curSum<0){
                index=(i+1)%gas.length;
                curSum=0;
            }
        }
        if(totalSum<0)
            return -1;
        return index;

    }
}
