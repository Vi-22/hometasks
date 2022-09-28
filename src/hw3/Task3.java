package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Загадайте число от 2 до 200");
        int userNumber = in.nextInt();
        while (userNumber<2||userNumber>200) {
            System.out.println("Это число не подходит. Загадайте число от 2 до 200");
            userNumber = in.nextInt();
        }
        for (int low = 1, high = 201, result = 0; result == 0;) {
            int mid = (high + low) / 2;
            if (mid < userNumber) {
                low = mid;
            } else if (mid > userNumber) {
                high = mid;
            } else {
                result = 1;
                System.out.println("Ваше число: " + mid);
            }
        }
        in.close();
    }
}
