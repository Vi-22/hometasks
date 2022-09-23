package hw1;

public class Task1 {
    public static void main(String[] args) {
        // пункт 1
        int length = 1;
        int height = 2;
        int width = 3;
        int s = 2 * (length * height + height * width + width * length);
        System.out.println(s);
        //пункт 2
        int a = 2;
        int b = a * a;
        System.out.println(b);
        //пункт 3
        double time = 1.5;
        double distance = 100.2;
        double speed = (distance / time) / 3.6;
        System.out.println(speed);


    }

}
