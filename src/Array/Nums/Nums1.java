package Array.Nums;

import java.util.Arrays;

public class Nums1 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.print("Первые 3 элемента:");
        int count = 3;
        for (int i = 0; i < count; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
