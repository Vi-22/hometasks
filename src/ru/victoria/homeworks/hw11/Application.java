package ru.victoria.homeworks.hw11;

public class Application {
    public static void main(String[] args) {
        Planet[] planets = {Planet.MARS, Planet.SATURN, Planet.VENERA};
        for (int i = 0; i < planets.length; i++) {
            System.out.println(planets[i]);
        }
    }
}
