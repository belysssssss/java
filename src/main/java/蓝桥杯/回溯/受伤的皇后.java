package 蓝桥杯.huishuo;

import java.util.Scanner;

public class 受伤的皇后 {
    static int count=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n=scan.nextInt();
        int[][] chess=new int[n][n];
        backTracking(chess,0);
        System.out.println(count);
        scan.close();
    }

    private static void backTracking(int[][] chess,int row) {
        if(row==chess.length){
            count++;
            return;
        }
       int n=chess.length;
        for(int j=0;j<n;j++){
            if(isValid(row,j,chess)){
                chess[row][j]=1;
                backTracking(chess,row+1);
                chess[row][j]=0;
            }
        }
    }

    private static boolean isValid(int start, int row, int[][] chess) {
        for(int i=0;i<start;i++){
            if(chess[i][row]==1){
                return false;
            }
        }
        for(int i=start-1,j=row-1;i>=0&&j>=0;i--,j--) {
            if (chess[i][j] == 1 && Math.abs(start - i) < 3) {
                return false;
            }
        }
        for(int i=start-1,j=row+1;i>=0&&j<=chess.length-1;i--,j++){
            if(chess[i][j]==1&&Math.abs(start-i)<3) {
            return false;
            }
        }
        return true;
    }
}
