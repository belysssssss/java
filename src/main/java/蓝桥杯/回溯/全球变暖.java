package 蓝桥杯.huishuo;

import java.util.Scanner;

/*
* 你有一张某海域 NxNNxN 像素的照片，"."表示海洋、"#"表示陆地，如下所示：

.......

.##....

.##....

....##.

..####.

...###.

.......

其中"上下左右"四个方向上连在一起的一片陆地组成一座岛屿。例如上图就有 2 座岛屿。

由于全球变暖导致了海面上升，科学家预测未来几十年，岛屿边缘一个像素的范围会被海水淹没。具体来说如果一块陆地像素与海洋相邻(上下左右四个相邻像素中有海洋)，它就会被淹没。

例如上图中的海域未来会变成如下样子：

.......

.......

.......

.......

....#..

.......

.......

请你计算：依照科学家的预测，照片中有多少岛屿会被完全淹没。

输入描述
第一行包含一个整数 N\ (1 \leq N \leq 1000)N (1≤N≤1000)。

以下 NN 行 NN 列代表一张海域照片。

照片保证第 1 行、第 1 列、第 NN 行、第 NN 列的像素都是海洋。、

输出一个整数表示答案。
* */
public class 全球变暖 {
    static int ans=0;//答案
    static char[][] nl;//地图
    static boolean pd;//判断岛屿是否被完全沉没
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n=scan.nextInt();
        nl=new char[n][n];
        String s;
        for(int i=0;i<n;i++){
            s=scan.next();
            nl[i]=s.toCharArray();
        }
     /*   for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nl[i][j]);打印原本地图
            }
        }*/
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nl[i][j]=='#'){
                    ans++;//假设已经完全沉没
                    pd=false;
                    dfs(i,j);
                    if(pd)//如果未被完全沉没，则减回
                        ans--;
                }
            }
        }
        System.out.println(ans);
        scan.close();
    }

    private static void dfs(int i, int j) {
        nl[i][j]='1';
        if(nl[i][j-1]!='.'&&nl[i-1][j]!='.'&&nl[i][j+1]!='.'&&nl[i+1][j]!='.'){
            nl[i][j] = '0';//代表未被淹没的陆地
            pd = true;//这一块岛屿未被完全淹没。
            //不要加return！不需要，等它没有#代表的陆地时自然就会停下来。
        }
        //上下左右有未探访过的土地时才进入递归。
        if(nl[i+1][j]=='#'){
            dfs(i+1,j);
        }
        if(nl[i-1][j]=='#'){
            dfs(i-1,j);
        }
        if(nl[i][j+1]=='#'){
            dfs(i,j+1);
        }
        if(nl[i][j-1]=='#'){
            dfs(i,j-1);
        }
    }
}
