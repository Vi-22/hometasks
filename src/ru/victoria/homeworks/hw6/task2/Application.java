package ru.victoria.homeworks.hw6.task2;

import ru.victoria.homeworks.hw6.task2.actions.Action;
import ru.victoria.homeworks.hw6.task2.characters.Character;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println("В игру вступают: ");
        Character[] characters = new Character[10];
        for (int i = 0; i <= characters.length - 1; i++) {
            characters[i] = new Character();
            characters[i].setName(characters[i].getName() + (i + 1));
            System.out.println(characters[i]);
        }
        Action action = new Action();
        action.fighting(characters);
        System.out.println("Игра окончена! Результаты такие: ");
        for (int i = 0; i <= characters.length - 1; i++) {
            System.out.println(characters[i]);
        }
    }
}

