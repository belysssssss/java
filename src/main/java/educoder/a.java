package educoder;

/**
 * @Author :zqh
 * @Date 2021/4/24 20:41
 */
public class a {
    public static void main(String[] args) {
        int[] s = new int[3];
        int sum = 1;
        int i = 0;
        while (true) {
            if (i == 3)
                break;
            if (i++ < 3)
                s[i++] = sum;
            sum++;

        }
        for (int j = 0; j < 3; j++) {
            System.out.println(s[j]);
        }
    }
}