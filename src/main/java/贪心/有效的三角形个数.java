package 贪心;

import java.util.Arrays;

/*
* 给定一个包含非负整数的数组nums ，
* 返回其中可以组成三角形三条边的三元组个数。
示例 1:
输入: nums = [2,2,3,4]
输出: 3
解释:有效的组合是:
2,3,4 (使用第一个 2)
2,3,4 (使用第二个 2)
2,2,3
示例 2:
输入: nums = [4,2,3,4]
输出: 4
* */
public class 有效的三角形个数 {
    public static void main(String[] args) {

        int[] arr={2,2,3,4};
        int res=triangleNumber(arr);
        System.out.println(res);
    }
    public static int triangleNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int k=i;
            for(int j=i+1;j<nums.length;j++){
                while(k<n-1&&nums[k+1]<(nums[i]+nums[j])){
                    k++;
                }
                ans+=Math.max(k-j,0);
            }
        }
        return ans;
    }
}
