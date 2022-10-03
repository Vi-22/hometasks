package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] array1 = {5, -6, 49, -5, -38, 5, -48, 44, -593};
        int negativeCount = 0;
        for (int i = 0; i< array1.length; i++) {
            if (array1[i] < 0) {
                negativeCount++;
            }
        }
        int[] array2 = new int[negativeCount];
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
