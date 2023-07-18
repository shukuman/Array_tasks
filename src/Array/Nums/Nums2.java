package Array.Nums;

import java.util.Arrays;

public class Nums2 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.print("Первая половина элементов:");
        for (int i = 0; i < nums.length / 2; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}