package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] array1 = {5, -6, 49, -5, -38, 5, -48, 44, -593};
        int amount = 0;
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] < 0) {
                amount++;
            }
        }
        int[] array2 = new int[amount];
        int i2 = 0;
        for (int i1 = 0; i1 < array1.length; i1++) {
            if (array1[i1] < 0) {
                array2[i2] = array1[i1];
                i2++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
