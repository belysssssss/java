package 贪心;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
* 给你一个整数数组 nums 和一个整数 k ，按以下方法修改该数组：

选择某个下标 i并将 nums[i] 替换为 -nums[i] 。
重复这个过程恰好 k 次。可以多次选择同一个下标 i 。
以这种方式修改数组后，返回数组 可能的最大和 。
示例 1：
输入：nums = [4,2,3], k = 1
输出：5
解释：选择下标 1 ，nums 变为 [4,-2,3] 。
* */
public class k次取反后最大化的数组和 {
    public static void main(String[] args) {
        int[] nums={4,3,2};
        int k=1;
        int res=largestSumAfterKNegations(nums,k);
        System.out.println(res);
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        //将数组按照绝对值大小从大到小排序，注意要按照绝对值的大小
        nums= IntStream.of(nums).boxed().sorted((o1, o2) -> Math.abs(o2)-Math.abs(o1)).mapToInt(Integer::intValue).toArray();
        int len=nums.length;
        for(int i=0;i<len;i++){
            //从前向后遍历，遇到负数将其变成正数，同时K--
            if(nums[i]<0&&k>0){
                nums[i]=-nums[i];
                k--;
            }
        }
        //如果k还大于零，那么反复转变数值最小的元素，将k用完
        if(k%2==1)
            nums[len-1]=-nums[len-1];
        return Arrays.stream(nums).sum();
    }
}
/*
* 本题更多地还是注意按照绝对值大小逆序排序操作，由于要考虑到数组中的负数为奇数。
* */