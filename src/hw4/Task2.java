package hw4;

import java.sql.Array;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int max = 20;
        int min = 2;
        int[] array2 = new int[20 / 2];
        //вариант 1: просто перебрать с конца в начало цифры при помощи for
        for (int i = 0; i < array2.length; i++) {
            array2[i] = max;
            max -= 2;
        }
        System.out.println(Arrays.toString(array2));
        //вариант 2: развернуть цикл
        for (int i = array2.length - 1; i > 0; i--) {
            array2[i] = min;
            min += 2;
        }
        System.out.println(Arrays.toString(array2));
    }
}
