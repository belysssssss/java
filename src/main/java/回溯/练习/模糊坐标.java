package 回溯.练习;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*
* 我们有一些二维坐标，如"(1, 3)"或"(2, 0.5)"，
* 然后我们移除所有逗号，小数点和空格，得到一个字符串S。
* 返回所有可能的原始字符串到一个列表中。
原始的坐标表示法不会存在多余的零，
* 所以不会出现类似于"00", "0.0", "0.00", "1.0", "001", "00.01"或一些其他更小的数来表示坐标。
* 此外，一个小数点前至少存在一个数，所以也不会出现“.1”形式的数字。
最后返回的列表可以是任意顺序的。而且注意返回的两个数字中间（逗号之后）都有一个空格。
示例 1:
输入: "(123)"
输出: ["(1, 23)", "(12, 3)", "(1.2, 3)", "(1, 2.3)"]
示例 2:
输入: "(00011)"
输出: ["(0.001, 1)", "(0, 0.011)"]
解释:
0.0, 00, 0001 或 00.01 是不被允许的。
示例 3:
输入: "(0123)"
输出: ["(0, 123)", "(0, 12.3)", "(0, 1.23)", "(0.1, 23)", "(0.1, 2.3)", "(0.12, 3)"]
示例 4:
输入: "(100)"
输出: [(10, 0)]
解释:
1.0 是不被允许的。

* */
public class 模糊坐标 {
    public static void main(String[] args) {
        String str="(123)";
        List<String> list=ambiguousCoordinates(str);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static List<String> ambiguousCoordinates(String S) {
        List<String> ans = new ArrayList();
        for (int i = 2; i < S.length()-1; ++i)
            for (String left: make(S, 1, i))//对于x坐标的遍历
                for (String right: make(S, i, S.length()-1))//对于y坐标的遍历
                    ans.add("(" + left + ", " + right + ")");
        return ans;
    }

    public static List<String> make(String S, int i, int j) {
        // Make on S.substring(i, j)
        List<String> ans = new ArrayList();
        for (int d = 1; d <= j-i; ++d) {
            String left = S.substring(i, i+d);
            String right = S.substring(i+d, j);
            if ((!left.startsWith("0") || left.equals("0"))
                    && !right.endsWith("0"))
                ans.add(left + (d < j-i ? "." : "") + right);
        }
        return ans;
    }
}
/*
* 我们首先把这个二维坐标分成两部分，
* 前一部分表示 x 坐标，后一部分表示 y 坐标。
* 例如当给出的二维坐标为 (1234) 时，我们可以把它分成 1, 234，12, 34 和 123, 4 三种情况。
* 随后对于每一部分，我们再考虑是否可以添加小数点以及在哪里添加小数点。例如，对于 123，合法的坐标有 1.23，12.3 和 123。

在处理每一部分时，我们需要将出现多余 0 的不合法的坐标去除。
* 如果我们不添加小数点，那么这个坐标不能有前导 0；
* 如果我们在某个位置添加小数点，那么整数部分不能有前导 0，小数部分的末尾也不能有 0。

* */