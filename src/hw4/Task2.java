package hw4;

import java.sql.Array;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int max = 20;
        int min = 2;
        int[] array2 = new int[20 / 2];
        //вариант 1: просто перебрать с конца в начало цифры при помощи for
        for (int arrayIndex = 0; arrayIndex < array2.length; arrayIndex++) {
            array2[arrayIndex] = max;
            max -= 2;
        }
        System.out.println(Arrays.toString(array2));
        //вариант 2: развернуть цикл
        for (int arrayIndex = array2.length - 1; arrayIndex > 0; arrayIndex--) {
            array2[arrayIndex] = min;
            min += 2;
        }
        System.out.println(Arrays.toString(array2));
    }
}
