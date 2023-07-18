package Array.Nums;

import java.util.Arrays;

public class Nums5 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.print("Последние 3 элемента:");
        for (int i = nums.length - 3; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
