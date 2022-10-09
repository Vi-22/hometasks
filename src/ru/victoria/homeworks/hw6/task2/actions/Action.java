package ru.victoria.homeworks.hw6.task2.actions;

import ru.victoria.homeworks.hw6.task2.characters.Character;

public class Action {
    private boolean isCat(Character character) {
        if (character.getType().equals("Cat")) {
            return true;
        } else {
            return false;
        }
    }
    private boolean is100Mouses (Character character){
        if (character.getKilledMice()==100) {
            return true;
        } else {
            return false;
        }

    }

    public void fighting(Character characters[]) {
        for (int i = 0; i <= characters.length - 1; i++) {
            for (int j = 0; j <= characters.length - 1; j++) {
                if (is100Mouses(characters[i]) || is100Mouses(characters[j])) {
                    break;
                }
                if (isCat(characters[i]) && isCat(characters[j])) {
                    catToCatFighting(characters[i], characters[j]);
                } else if (isCat(characters[i]) || isCat(characters[j])) {
                    if (isCat(characters[i])) {
                        mouseToCatFighting(characters[i], characters[j]);
                    } else {
                        mouseToCatFighting(characters[j], characters[i]);
                    }
                } else {
                    noFighting();
                }
            }
        }
    }

    private void catToCatFighting(Character cat1, Character cat2) {
        printFighters(cat1, cat2);
        if (cat1.getWeight() == cat2.getWeight()) {
            System.out.println("Ничья");
        } else if (cat1.getWeight() > cat2.getWeight()) {
            System.out.println("Побеждает " + cat1.getName());
            catToCatRunning(cat1, cat2);
        } else {
            System.out.println("Побеждает " + cat2.getName());
            catToCatRunning(cat2, cat1);
        }
    }

    private void catToCatRunning(Character catWinner, Character catRunner) {
        if (catWinner.getSpeed() > catRunner.getSpeed()) {
            catWinner.setKilledMice(+catRunner.getKilledMice());
            System.out.println("Отобрано " + catRunner.getKilledMice() + " мышей");
        } else {
            System.out.println("Противник сбежал");
        }
    }

    private void mouseToCatFighting(Character cat, Character mouse) {
        printFighters(cat, mouse);
        if (cat.getSpeed() > mouse.getSpeed()) {
            cat.setKilledMice(+1);
            System.out.println("Мышка поймана");
        } else {
            System.out.println("Мышка сбежала");
        }
    }

    private void noFighting() {
        System.out.println("Ничего не просходит, просто мышки бегают");
    }

    public void printFighters(Character character1, Character character2) {
        System.out.println("Сражались " + character1.getName() + " и " + character2.getName() + ":");
    }
}
