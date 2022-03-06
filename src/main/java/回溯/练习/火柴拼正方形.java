package 回溯.练习;

import java.util.ArrayList;
import java.util.List;

/*
* 还记得童话《卖火柴的小女孩》吗？
* 现在，你知道小女孩有多少根火柴，
* 请找出一种能使用所有火柴拼成一个正方形的方法。
* 不能折断火柴，可以把火柴连接起来，并且每根火柴都要用到。
输入为小女孩拥有火柴的数目，
* 每根火柴用其长度表示。
* 输出即为是否能用所有的火柴拼成正方形。
示例1:
输入: [1,1,2,2,2]
输出: true
解释: 能拼成一个边长为2的正方形，每边两根火柴。
示例2:
输入: [3,3,3,3,4]
输出: false
解释: 不能用所有火柴拼成一个正方形。
给定的火柴长度和在0到10^9之间。
火柴数组的长度不超过15。

* */
public class 火柴拼正方形 {
    public static void main(String[] args) {
        int[] array={13,11,1,8,6,7,8,8,6,7,8,9,8};
        boolean res=makesquare(array);
        System.out.println(res);
    }
    public static boolean makesquare(int[] matchsticks) {
        if(matchsticks.length<4||matchsticks==null){
            return false;
        }
        int totalsum=0;
        for(int sum:matchsticks){
            totalsum+=sum;
        }
        if(totalsum%4>0){
            return false;
        }
        int len=totalsum/4;
        List<Integer> edge=new ArrayList<>();
        for(int i=0;i<matchsticks.length;i++){
            if(matchsticks[i]>len){
                return false;
            }else{
                edge.add(matchsticks[i]);
            }
        }
        edge.sort((o1, o2) -> {
            if(o1>o2){
                return -1;
            }else if(o1.equals(o2)){
                return 0;
            }else{
                return 1;
            }
        });
        int target=4;
        boolean[] judge=new boolean[edge.size()];
        for(int i=0;i<target;i++){
            boolean result=check(len,edge,0,0,judge);
            if(result==false){
                return false;
            }
        }
        return true;
    }

    private static boolean check(int len, List<Integer> edge, int start, int sum, boolean[] judge) {
        if(sum==len){
            return true;
        }
        if(sum>len){
            return false;
        }
        for(int i=start;i<edge.size();i++){
            if(judge[i]==true){
                continue;
            }
            sum+=edge.get(i);
            judge[i]=true;
            if(check(len,edge,i+1,sum,judge)){
                return true;
            }
            sum-=edge.get(i);
            judge[i]=false;
        }
        return false;
    }
    /*
        public boolean makesquare(int[] nums) {
        int total = 0;
        //统计所有火柴的长度
        for (int num : nums) {
            total += num;
        }
        //如果所有火柴的长度不是4的倍数，直接返回false
        if (total == 0 || (total & 3) != 0)
            return false;
        //回溯
        return backtrack(nums, 0, total >> 2, new int[4]);
    }

    //index表示访问到当前火柴的位置，target表示正方形的边长，size是长度为4的数组，
    //分别保存正方形4个边的长度
    private boolean backtrack(int[] nums, int index, int target, int[] size) {
        if (index == nums.length) {
            //如果火柴都访问完了，并且size的4个边的长度都相等，说明是正方形，直接返回true，
            //否则返回false
            if (size[0] == size[1] && size[1] == size[2] && size[2] == size[3])
                return true;
            return false;
        }
        //到这一步说明火柴还没访问完
        for (int i = 0; i < size.length; i++) {
            //如果把当前火柴放到size[i]这个边上，他的长度大于target，我们直接跳过
            if (size[i] + nums[index] > target)
                continue;
            //如果当前火柴放到size[i]这个边上，长度不大于target，我们就放上面
            size[i] += nums[index];
            //然后在放下一个火柴，如果最终能变成正方形，直接返回true
            if (backtrack(nums, index + 1, target, size))
                return true;
            //如果当前火柴放到size[i]这个边上，最终不能构成正方形，我们就把他从
            //size[i]这个边上给移除，然后在试其他的边
            size[i] -= nums[index];
        }
        //如果不能构成正方形，直接返回false
        return false;
    }
*/
}
