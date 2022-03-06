package 蓝桥杯.middle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 移动字母 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n=scan.nextInt();
        scan.nextLine();
       String[] arr=new String[n];
         for(int i=0;i<n;i++)
             arr[i]=scan.nextLine();
        for(int i=0;i<n;i++)
            System.out.println(dfs(arr[i]));
        scan.close();
    }

    private static int dfs(String s) {
        //记录全部交换结果（检查重复用）
        ArrayList<String> list=new ArrayList<String>();
        //队列(用来测试所有可能)
        Queue<String> queue=new LinkedList<String>();
        //定UI方向（左，上，右，下）
        int[] d={-1,-3,1,3};
        //入队
        queue.offer(s);
        list.add(s);//加入记录
        while(queue.size()>0){
            String firstStr=queue.poll();//出队
            if(firstStr.equals("ABCDE*"))
                return 1;//找到结果，退出
            //找到*号的位置
            int k=firstStr.indexOf("*");
            //左，上，右，下 四个方向都探测
            for(int i=0;i<4;i++){
                int j=k+d[i];
                //当前方向不越界
                if(j>=0&&j<=5){
                    //交换元素
                    String t=swap(firstStr,k,j);
                    //list不包括t
                    if(!list.contains(t)){
                        //入队
                        queue.offer(t);
                        //添加记录
                        list.add(t);
                    }
                }
            }
        }
        return 0;
    }
    //交换元素
    public static String swap(String s,int k,int j){
        char[] c=s.toCharArray();
        char t=c[k];
        c[k]=c[j];
        c[j]=t;
        return new String(c);
    }
}
