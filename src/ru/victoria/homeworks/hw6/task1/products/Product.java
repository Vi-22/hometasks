package ru.victoria.homeworks.hw6.task1.products;

public class Product {
    @Override
    public String toString() {
        return name;
    }

    //свойства
    private String name;
    private double proteins;
    private double fats;
    private double carbohydrates;
    private double calories;

    //конструкторы
    public Product(String name) {
        if (name == null) {
            throw new IllegalArgumentException("не введено название продукта");
        }
        this.name = name;
    }

    public Product(String name, double calories) {
        if (name == null) {
            throw new IllegalArgumentException("не введено название продукта");
        }
        if (calories < 0) {
            throw new IllegalArgumentException("калорий должно быть больше нуля");
        }
        this.name = name;
        this.calories = calories;
    }

    public Product(String name, double calories, double proteins) {
        if (name == null) {
            throw new IllegalArgumentException("не введено название продукта");
        }
        if (calories <= 0) {
            throw new IllegalArgumentException("калорий не может быть меньше ноля");
        }
        if (proteins <= 0) {
            throw new IllegalArgumentException("белков не может быть меньше ноля");
        }
        this.name = name;
        this.calories = calories;
        this.proteins = proteins;
    }

    public Product(String name, double calories, double proteins, double fats, double carbohydrates) {
        if (name == null) {
            throw new IllegalArgumentException("не введено название продукта");
        }
        if (calories < 0) {
            throw new IllegalArgumentException("калорий не может быть меньше ноля");
        }
        if (proteins < 0) {
            throw new IllegalArgumentException("белков не может быть меньше ноля");
        }
        if (fats < 0) {
            throw new IllegalArgumentException("жиров не может быть меньше ноля");
        }
        if (carbohydrates < 0) {
            throw new IllegalArgumentException("углеводов не может быть меньше ноля");
        }
        this.name = name;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public void printProduct() {
        System.out.println(name);
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Название не может быть null");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getProteins() {
        return proteins;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }
}

