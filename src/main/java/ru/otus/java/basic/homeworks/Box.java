package ru.otus.java.basic.homeworks;

public class Box {
    private int length;
    private int width;
    private int height;
    private String color;
    private boolean opened;
    private boolean full;
    private String itemInTheBox;

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return length;
    }
    public int getHeight() {
        return length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Box(int length, int width, int height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.opened = true;
        this.full = false;
        this.itemInTheBox = "";
    }

    public void open() {
        if (opened) {
            System.out.println("Коробка уже открыта");
            return;
        }
        opened = true;
        System.out.println("Коробка успешно открыта");
    }
    public void close() {
        if (!opened) {
            System.out.println("Коробка уже закрыта");
            return;
        }
        opened = false;
        System.out.println("Коробка успешно закрыта");
    }

    public void info() {
        System.out.println("Размер коробки: " + length + "x" + width + "x" + height);
        System.out.println("Цвет коробки: " + color);
    }

    public void putInTheBox(String something) {
        if (!opened) {
            System.out.println("Коробка закрыта");
            return;
        }
        if (full) {
            System.out.println("В коробке нет места");
            return;
        }

        full = true;
        itemInTheBox = something;
        System.out.println(itemInTheBox + " помещен(а) в коробку");
    }

    public void throwOutOfTheBox(String something) {
        if (!opened) {
            System.out.println("Коробка закрыта");
            return;
        }

        if(itemInTheBox != something) {
            System.out.println(something + " не находится в коробке");
            return;
        }

        full = false;
        System.out.println(itemInTheBox + " вытащен(а) из коробки");
        itemInTheBox = "";
    }
}
