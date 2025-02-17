package ru.otus.java.basic.homeworks.hw03;

public class Homework03 {
    public static void main(String[] args) {
        printIfNegative(10);
    }

    public static void printIfNegative(int x) {
        if (x < 0) {
            System.out.println(x + " - отрицательное число");
        } else {
            System.out.println("Передано не отрицательное число");
        }
    }
}
