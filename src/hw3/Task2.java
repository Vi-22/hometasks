package hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 9);
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число от 1 до 9");
            int userNumber = in.nextInt();
            if (userNumber == 0) {
                System.out.println("Выход из программы");
                break;
            }
            if (userNumber<1||userNumber>9) {
                System.out.println("Это число не подходит. Введите число от 1 до 9");
            } else if (number == userNumber) {
                System.out.println("Вы угадали!");
                break;
            }
            if (number < userNumber) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        in.close();
    }
}
