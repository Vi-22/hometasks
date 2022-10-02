package hw4;


import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] stringsArray = new String[5];
        for (int i = 0; i < stringsArray.length;) {
            //этим циклом проверяем налич.места и команду выхода
            boolean isPresent=false; //чтобы не писать лишний цикл ввела переменную
            System.out.println("Вы можете ввести " + (stringsArray.length - i) +
                    " фраз. Введите фразу");
            String newElement = in.nextLine();
            if (newElement.equals("exit")) {
                break;
            } else {
                for (String arrayElements : stringsArray) {//этим проверяем наличие аналогичного элемента в массиве
                    if (newElement.equals(arrayElements)) {
                        isPresent=true; //чтобы не сохранять этот элемент и правильно прибавить счетчик
                    }
                }
            }
            if (isPresent) {
                System.out.println("Это уже записано");
            } else {
                System.out.println("Так и запишем: " + newElement);
                stringsArray[i] = newElement;
                i++;
            }
        }
        System.out.println("Выполнение программы завершено!");
        System.out.println("Вот массив, который мне удалось записать: " + Arrays.toString(stringsArray));
    }
}
