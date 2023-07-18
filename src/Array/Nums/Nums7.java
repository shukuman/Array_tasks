package Array.Nums;

import java.util.Arrays;

public class Nums7 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        // 1-способ
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveCount += 1;
            } else if (nums[i] < 0) {
                negativeCount += 1;
            }
        }
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество отрицательных элементов: " + negativeCount);

        // 2-способ
//        int positiveCount = 0;
//        int negativeCount = 0;
//        for (int num : nums) {
//            if (num > 0) {
//                positiveCount++;
//            } else {
//                negativeCount++;
//            }
//        }
//        System.out.println("Количество положительных элементов: " + positiveCount);
//        System.out.println("Количество отрицательных элементов: " + negativeCount);
    }
}