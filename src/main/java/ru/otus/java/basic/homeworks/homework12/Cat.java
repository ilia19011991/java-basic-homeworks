package ru.otus.java.basic.homeworks.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.consume(appetite)) {
            satiety = true;
            System.out.println(name + " сыт");
        } else {
            satiety = false;
            System.out.println(name + " голоден");
        }
    }
}
