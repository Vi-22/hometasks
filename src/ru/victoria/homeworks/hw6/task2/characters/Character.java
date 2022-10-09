package ru.victoria.homeworks.hw6.task2.characters;

public class Character {
    @Override
    public String toString() {
        if (this.type.equals("Cat")) {
            return "Игрок: " + name + ", скорость: " + speed + ", вес: " + weight + ", убито мышей: " + killedMice;
        } else {
            return "Игрок: " + name + ", скорость: " + speed;

        }
    }

    private String type;
    private String name;
    private double speed;
    private double weight;
    private int killedMice;

    public Character() {
        if (Math.random() * 2 <= Math.random() * 2) {
            this.name = "Котик";
            this.type = "Cat";
            this.weight = Math.random() * 10;
            this.killedMice = (int) (Math.random() * 100);
        } else {
            this.name = "Мышка";
            this.type = "Mouse";
        }
        this.speed = Math.random() * 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getKilledMice() {
        return killedMice;
    }

    public void setKilledMice(int killedMice) {
        this.killedMice = killedMice;
        if (killedMice>=100) {
            this.killedMice =100;
        }
    }


}

