package ru.victoria.homeworks.hw11;

public enum Planet {
    MARS("Марс", 6.417 * Math.pow(10, 23), 3_389.5),
    VENERA("Венера", 4.868 * Math.pow(10, 24), 6_051.8),
    SATURN("Сатурн", 5.683 * Math.pow(10, 26), 58_232);
    String name;
    double weight;// кг
    double radius; // км

    Planet(String name, double weight, double radius) {
        this.name = name;
        this.weight = weight;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Значение должно быть больше 0");
        }
        this.weight = weight;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Значение должно быть больше 0");
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Планета " + name + ", вес " + weight + ", радиус " + radius;
    }
}
