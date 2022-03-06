package 蓝桥杯.tanxin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 删除字符 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String str=scan.nextLine();
        int n=scan.nextInt();
        List<Character> list=new ArrayList<>();
        for(char c:str.toCharArray()){
            list.add(c);
        }
        for(int i=1;i<=n;i++){
            if(list.get(0)>list.get(1)){
                list.remove(0);
            }else{
                list.remove(1);
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        scan.close();
    }
}
