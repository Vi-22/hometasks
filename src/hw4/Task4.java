package hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
    String string =  "в предложении все слова разной длины";
    String[] stringsArray = string.split(" ");
    System.out.println("Получили массив из слов: " + Arrays.toString(stringsArray));
    int [] intsArray = new int [stringsArray.length];
    for (int index = 0; index < stringsArray.length; index++) {
        int wordLenght = stringsArray[index].length();
        intsArray[index]=wordLenght;
        }
    System.out.println("Получили массив из количества символов: " + Arrays.toString(intsArray));
    int [] intsArrayForSort = intsArray.clone();
    Arrays.sort(intsArrayForSort);
    System.out.println("Отсортировали от меньшего к большему: " + Arrays.toString(intsArrayForSort));
    int max = intsArrayForSort [intsArrayForSort.length-1];
    System.out.println("Самое длинное слово состоит из " + max + " символов");
        for (int wordIndex = 0; wordIndex < intsArray.length; wordIndex++) {
            if (max == intsArray[wordIndex]) {
                System.out.println("Это слово: " + stringsArray[wordIndex]);
                break;
            }
        }

    }
}