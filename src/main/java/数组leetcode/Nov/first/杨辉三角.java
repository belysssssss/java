package 数组leetcode.Nov.first;

import java.util.ArrayList;
import java.util.List;

/*
* 给定一个非负整数numRows，生成「杨辉三角」的前numRows行。

在「杨辉三角」中，每数是它左上方和右上方的数的和。
示例 1:
输入: numRows = 5
输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
*
*
* */
public class 杨辉三角 {
    public static void main(String[] args) {
        int num = 5;
        List<Integer> list = new ArrayList<Integer>(num);
        System.out.println(list);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }
}
/*
 *
 *
 * */