package hw2;

import javax.swing.*;

public class Task4 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 700); //т.к. метод возвращает число с плав.точкой от 0 до 1 увеличиваю диапазон до 700
        System.out.println("Сгенерировано число: " + a);
        if ((a >= 10) && (a <= 500)) {
            System.out.println("Число относится к отрезку [10;500]");
            if ((a > 25) && (a < 200)) {
                System.out.println("Число содержится в интервале (25;200)");
            } else {
                System.out.println("Число не содержится в интервале (25;200)");
            }
        } else {
            System.out.println("Число не относится к отрезку [10;500]");
        }
    }
}
