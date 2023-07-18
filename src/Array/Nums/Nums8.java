package Array.Nums;

import java.util.Arrays;

public class Nums8 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        int maxNumber = 0;
        int minNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNumber) {
                maxNumber = nums[i];
            } else if (nums[i] < minNumber) {
                minNumber = nums[i];
            }
        }
        System.out.println("Максимальное число: " + maxNumber);
        System.out.println("Минимальное число: " + minNumber);
    }
}