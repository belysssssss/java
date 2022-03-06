package 贪心;

import java.util.Arrays;

/*
* 给定一组非负整数 nums，
* 重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
示例 1：
输入：nums = [10,2]
输出："210"
示例2：
输入：nums = [3,30,34,5,9]
输出："9534330"
* */
public class 最大数 {
    public static void main(String[] args) {
        int[] arr={109,10,2};
        String str=largestNumber(arr);
        System.out.println(str);
    }
    public static  String largestNumber(int[] nums) {
      int n=nums.length;
      String[] str=new String[n];
      for(int i=0;i<n;i++){
          str[i]=""+nums[i];
      }
      Arrays.sort(str,(a,b)->{
         String sa=a+b,sb=b+a;
         return sb.compareTo(sa);
      });
      StringBuffer sb=new StringBuffer();
      for(String s:str)
          sb.append(s);
      int k=0;
      while(k<n-1&&sb.charAt(k)=='0')
          k++;
      return sb.substring(k);
    }
}
/*
* 对于 numsnums 中的任意两个值 aa 和 bb，我们无法直接从常规角度上确定其大小/先后关系。

但我们可以根据「结果」来决定 aa 和 bb 的排序关系：

如果拼接结果 abab 要比 baba 好，那么我们会认为 aa 应该放在 bb 前面。

另外，注意我们需要处理前导零（最多保留一位）。

* */