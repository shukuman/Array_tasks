package Array.Nums;

import java.util.Arrays;

public class Nums4 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.print("Все элементы кроме первого и последнего:");
        for (int i = 1; i < nums.length - 1; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}