package Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10]; //создание массива
        System.out.println(array[9]);
        array[0] = 25;
        System.out.println(array[0]);
        System.out.println(array[5]);

        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println(array2[0]);
        System.out.println(array2[4]);

        int[] array3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] numbers = {4, 3, 5, 2, 1}; //метод toString()
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
