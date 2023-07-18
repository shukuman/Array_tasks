package Array.Nums;

import java.util.Arrays;

public class Nums6 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.print("Вывести четные элементы по порядку (каждый второй):");
        for (int i = 1; i < nums.length; i += 2) {
            System.out.print(" " + nums[i]);
        }
    }
}