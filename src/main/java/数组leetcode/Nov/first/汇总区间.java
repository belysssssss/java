package 数组leetcode.Nov.first;

import java.util.ArrayList;
import java.util.List;

/*
* 给定一个无重复元素的有序整数数组 nums 。
返回 恰好覆盖数组中所有数字的最小有序区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
列表中的每个区间范围 [a,b] 应该按如下格式输出：
"a->b" ，如果 a != b
"a" ，如果 a == b
*
* 输入：nums = [0,1,2,4,5,7]
输出：["0->2","4->5","7"]
解释：区间范围是：
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
* */
public class 汇总区间 {
    public static void main(String[] args) {
    int nums[]={0,1,2,4,5,7};
    List<String> list=summaryRanges(nums);
        System.out.println(list);
    }

    public static List<String> summaryRanges(int[] nums) {
        int n= nums.length;
        List<String> ls=new ArrayList<String>();
        int i=0;
        while(i<n){
            int low=i;
            i++;
            while(i<n&&nums[i]==(nums[low]+1)){//将数组进行到缺失的部分
                i++;
            }
            int high=i-1;//此时的nums[i]是缺失的数字部分，而需要打印的部分是前一位
            StringBuffer str=new StringBuffer(Integer.toString(nums[low]));//先往str中存储最开始的一位。
            if(low<high){
                str.append("->");
                str.append(Integer.toString(nums[high]));
            }
            ls.add(str.toString());
        }
        return ls;
    }
}
/*
* 解题思路：
* String  不可变长序列
* StringBuffer 可变长序列
*
*
*
* */
