package hw4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = new int[(int) (Math.random() * 20)]; //создаем случайный массив до с длинной от 1 до 20
        int sum = 0;//сразу создаем переменную для суммы элементов массива
        for (int i = 0; i < array1.length; i++) {
            array1[i] += (int) (Math.random() * 100);//создаем случайные значения от 1 до 100
            sum += array1[i]; // сразу считаем сумму элементов массива
        }
        System.out.println("Вот такой массив: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Минимальное значение: " + array1[0]);
        System.out.println("Максимальное значение: " + array1[array1.length - 1]);
        System.out.println("Среднее арифметическое: " + (sum / array1.length));
    }
}
