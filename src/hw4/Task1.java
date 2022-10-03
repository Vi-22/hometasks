package hw4;
// на самом деле это hw5
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = new int[(int) (Math.random() * 20)]; //создаем случайный массив до с длинной от 1 до 20
        int sum = 0;//сразу создаем переменную для суммы элементов массива
        int max = array1[0];
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            array1[i] += (int) (Math.random() * 100);//создаем случайные значения от 1 до 100
            sum += array1[i]; // сразу считаем сумму элементов массива
            if (array1[i] > max) {
                max = array1[i];
            }
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        System.out.println("Вот такой массив: " + Arrays.toString(array1));
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое: " + (sum / array1.length));
    }
}
