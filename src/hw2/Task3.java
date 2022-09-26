package hw2;

public class Task3 {
    public static void main(String[] args) {
        int count = 48;
        if ((count > 100) || (count < 0)) {
            System.out.println("Это против правил!");
        } else if (count >= 90) {
            System.out.println("Отлично");
        } else if (count >= 60) {
            System.out.println("Хорошо");
        } else if (count >= 40) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Попробуйте в следующий раз");
        }
    }
}
