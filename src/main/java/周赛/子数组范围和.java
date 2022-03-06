package 周赛;

import java.util.*;

public class 子数组范围和 {
    // 保存结果集
   static List<List<Integer>> resultList = new ArrayList<>();
    static List<Integer> subList = new ArrayList<>();
    public static void main(String[] args) {

        // 测试数组
        int[] list = {1,2,3} ;
        // 递归调用
        subList(list, 0, resultList, subList);
        // 求数组的子集
        System.out.println("数组的所有子集合：");
        for (List<Integer> sub : resultList) {
            System.out.println(Arrays.toString(sub.toArray()));
        }
        long sum=subArrayRanges1(list);
        System.out.println(sum);
    }


    public static void subList(int[] list , int index,
                               List<List<Integer>> resultList, List<Integer> subList) {
        resultList.add(new ArrayList<>(subList));
        int size = list.length ;
        for (int i = index; i < size; ) {
            subList.add(list[i]);
            subList(list, ++i, resultList, subList);
            subList.remove(subList.size() - 1);
        }
    }
   public static long subArrayRanges(int[] nums) {
         long sum=0;
       List<List<Integer>> resultList = new ArrayList<>();
      List<Integer> subList = new ArrayList<>();
       // 递归调用
       subList(nums, 0, resultList, subList);
       for (List<Integer> sub : resultList) {
           Collections.sort(sub);
           sum+=sub.get(sub.size()-1)-sub.get(0);
       }
       System.out.println(sum);
         return sum;
    }
    public static long subArrayRanges1(int[] nums){
        long sum=0L;
        for(int i=0;i< nums.length;i++){
            int max=nums[i];
            int min=nums[i];
           for(int j=i+1;j< nums.length;j++){
               max=Math.max(max,nums[j]);
               min=Math.min(min,nums[j]);
               sum+=max-min;
           }
        }
        System.out.println(sum);
        return sum;
    }
    public static long subArrayRanges2(int[] nums){
                int n = nums.length;
                Stack<Integer> stack = new Stack();

                long ans = 0;
                for(int i=0;i<n;i++){
                    while(!stack.isEmpty()&&nums[stack.peek()]<nums[i]){
                        int idx = stack.pop();
                        int left = stack.isEmpty()?0:stack.peek()+1;
                        int right = i-1;
                        ans+=(long)nums[idx]*(long)(idx-left+1)*(long)(right-idx+1);
                    }
                    stack.push(i);
                }
                while(!stack.isEmpty()){
                    int idx = stack.pop();
                    int left = stack.isEmpty()?0:stack.peek()+1;
                    int right = n-1;
                    ans+=(long)nums[idx]*(long)(idx-left+1)*(long)(right-idx+1);
                }

                for(int i=0;i<n;i++){
                    while(!stack.isEmpty()&&nums[stack.peek()]>nums[i]){
                        int idx = stack.pop();
                        int left = stack.isEmpty()?0:stack.peek()+1;
                        int right = i-1;
                        ans-=(long)nums[idx]*(long)(idx-left+1)*(long)(right-idx+1);
                    }
                    stack.push(i);
                }
                while(!stack.isEmpty()){
                    int idx = stack.pop();
                    int left = stack.isEmpty()?0:stack.peek()+1;
                    int right = n-1;
                    ans-=(long)nums[idx]*(long)(idx-left+1)*(long)(right-idx+1);
                }
                return ans;
            }
    }

