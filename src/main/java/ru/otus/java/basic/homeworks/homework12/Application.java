package ru.otus.java.basic.homeworks.homework12;

public class Application {
    public static void main(String[] args) {
        Cat [] cats = {
                new Cat("Barsik", 11),
                new Cat("Fedor", 25),
                new Cat("Murzik", 5),
                new Cat("Petya", 17),
                new Cat("Vova", 1)
        };

        Plate plate = new Plate(17);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }
}
