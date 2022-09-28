package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Загадайте число от 2 до 100");
        int userNumber = in.nextInt();
        for (int low = 2, high = 200, result = 0; result == 0;) {
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
    }
}
