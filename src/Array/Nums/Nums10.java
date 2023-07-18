package Array.Nums;

import java.util.Arrays;

public class Nums10 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.print("Элементы в обратном порядке:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(" " + nums[i]);
        }
    }
}
