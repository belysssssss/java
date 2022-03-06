package 数组leetcode.Nov.first;

public class MoveZeroesTest {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        int outdex = 1;
        int temp = 10;
        if (nums.length == 0 || nums.length == 1)
            System.out.println(nums[0]);
        for (int i = 0; outdex < nums.length; i++) {
            while (nums[index] != 0) {
                index++;
            }
            if (nums[outdex] == 0 && (outdex + 1) < nums.length)
                outdex++;
            else if (nums[outdex] > 0 && nums[index] == 0) {
                temp = nums[index];
                nums[index] = nums[outdex];
                nums[outdex] = temp;
                outdex++;
            } else
                break;
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + "\t");
        }
    }
}
