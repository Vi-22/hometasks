package hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество моющего средства");
        double cleanser = in.nextDouble();
        System.out.println("Введите количество тарелок");
        int plate = in.nextInt();
        while (true) {
            cleanser -= 0.5;
            plate--;
            if (plate == 0 || cleanser == 0) {
                if (plate == 0) {
                    System.out.println("Вы помыли все тарелки! Осталось моющего средства: " + cleanser);
                } else {
                    System.out.println("У вас кончилось моющее средство! Осталось грязных тарелок: " + plate);
                }
                break;
            }
        }
        in.close();
    }
}
