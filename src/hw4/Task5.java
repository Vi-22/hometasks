package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int [] array1 = {5,-6, 49, -5, -38, 5, -48, 44,-593};
        int amount=0;
        for (int index= 0; index < array1.length; index++) {
            if (array1[index] < 0) {
                amount++;
            }
        }
        int[] array2 = new int[amount];
            int index2=0;
            for (int index1 = 0; index1 < array1.length;index1++) {
            if (array1[index1] < 0) {
                array2[index2] = array1[index1];
                index2++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
