package 回溯.其他问题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
* n皇后问题 研究的是如何将 n个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
给你一个整数 n ，返回所有不同的n皇后问题 的解决方案。
每一种解法包含一个不同的n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
示例 1：
输入：n = 4
输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
解释：如上图所示，4 皇后问题存在两个不同的解法。
* */
public class n皇后 {
    public static void main(String[] args) {
        int n=4;
        List<List<String>> list=solveNQueens(n);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    static List<List<String>> result=new ArrayList<>();
    public static List<List<String>> solveNQueens(int n) {
        char[][] chess=new char[n][n];
        for(char[] c:chess){
            Arrays.fill(c,'.');
        }
        backTracking(n,0,chess);
        return result;
    }

    private static void backTracking(int n, int start, char[][] chess) {
        if(start==n){
            result.add(Array2List(chess));
            return;
        }
        for(int i=0;i<n;i++){
            if(isValid(start,i,n,chess)){
                chess[start][i]='Q';
                backTracking(n,start+1,chess);
                chess[start][i]='.';
            }
        }
    }

    private static boolean isValid(int start, int row, int n,char[][] chess) {
        for(int i=0;i<start;i++){
            if(chess[i][row]=='Q'){
                return false;
            }
        }
        for(int i=start-1,j=row-1;i>=0&&j>=0;i--,j--){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        for(int i=start-1,j=row+1;i>=0&&j<=n-1;i--,j++){
            if(chess[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    private static List<String> Array2List(char[][] chess) {
        List<String> list=new ArrayList<>();
        for(char[] c:chess){
            list.add(String.copyValueOf(c));
        }
        return list;
    }
}
/*
*
* */