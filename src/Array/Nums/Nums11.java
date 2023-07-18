package Array.Nums;

import java.util.Arrays;

public class Nums11 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums));

        int[] nums2 = {5, -22, 8, 17};
        System.out.println("Второй массив: " + Arrays.toString(nums2));

        Arrays.sort(nums);
        Arrays.sort(nums2);

        int[] result = new int[nums.length + nums2.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }
        int count = 0;
        for (int i = nums.length; i < nums.length + nums2.length; i++) {
            result[i] = nums2[count];
            count ++;
        }
        System.out.println("Слияние двух отсортированных массивов: " + Arrays.toString(result));
    }
}
