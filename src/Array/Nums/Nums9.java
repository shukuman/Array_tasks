package Array.Nums;

import java.util.Arrays;

public class Nums9 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.print("Среднее значение элементов:");
        double result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        System.out.print(" " + result / nums.length);
    }
}