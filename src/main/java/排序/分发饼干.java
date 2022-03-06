package 排序;

import java.util.Arrays;
import java.util.HashMap;

public class 分发饼干 {
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={3};
        int res=findContentChildren(nums1,nums2);
        System.out.println(res);
    }
    public static  int findContentChildren(int[] g, int[] s) {
     int child=0;
     int cookie=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(cookie<s.length&&child<g.length){
            if(g[child]<=s[cookie]){
                child++;
            }
            cookie++;
        }
        return child;
    }
}
