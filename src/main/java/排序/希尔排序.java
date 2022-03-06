package 排序;

/**
 * @Author :zqh
 * @Date 2021/4/24 13:09
 */
public class 希尔排序 {
    public static void main(String[] args) {

        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        shellSort(arr);
    }

    static void shellSort(int[] arr) {
        //不断缩小增量
        for (int interval = arr.length / 2; interval > 0; interval = interval / 2) {
            for (int i = interval; i < arr.length; i++) {
                int target = arr[i];
                int j = i - interval;
                while (j > -1 && target < arr[j]) {
                    arr[j + interval] = arr[j];
                    j -= interval;
                }
                arr[j + interval] = target;
            }
        }
    }
}
