package hw1;

//Задача на арифметические операторы (оператор %)
public class Task2 {
    public static void main(String[] args) {
        int a = 45;
        int b = (a / 10) + (a % 10); //к количеству десятков добавить остаток от деления на 10 - лучше не придумала
        System.out.println(b);
        int c = 84;
        int d = (c / 10) + (c % 10);
        System.out.println(d);
    }
}
