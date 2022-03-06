package 蓝桥杯.middle;

import java.util.Scanner;

public class 寻找2020 {
    static char[][] arr = new char[300][300];

    static int res = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 300; i++) {
            StringBuilder builder = new StringBuilder(in.next());
            for (int j = 0; j < builder.length(); j++) {
                arr[i][j] = builder.charAt(j);
            }
        }

        //行
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String s = "";
                for (int k = j; k < j+4 && k < arr[i].length; k++) {
                    s+=arr[i][k];
                }
                if(s.length() == 4 && s.equals("2020")){
                    res++;
                }
            }
        }

        //列
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                String s = "";
                for (int k = j; k < j+4  && k < arr.length; k++) {
                    s+= arr[k][i];
                }
                if(s.length() == 4 && s.equals("2020")){
                    res++;
                }
            }
        }

        //右下方向斜线

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //检查最后一个坐标是否符合
                if( i + 3 < arr.length && j + 3 < arr[i].length){
                    String s = "";
                    s+= arr[i][j];
                    s+=arr[i+1][j+1];
                    s+=arr[i+2][j+2];
                    s+=arr[i+3][j+3];
                    if(s.length() == 4 && s.equals("2020")){
                        res++;
                    }
                }
            }
        }

        System.out.println(res);
    }
}
