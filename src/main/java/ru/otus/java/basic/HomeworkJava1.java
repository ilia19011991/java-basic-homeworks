package ru.otus.java.basic;

import java.util.Random;
import java.util.Scanner;

public class HomeworkJava1 {
    public static void main(String[] args) {
        greetings();
        checkSign(1, 2, -4);
        setColor();
        compareNumbers();
        addOrSubtractAndPrint(5,2,false);
        methodDependsOnInput();
    }
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else System.out.println("Сумма отрицательная");
    }
    public static void setColor() {
        int data = 25;
        if (data <= 10) {
            System.out.println("Красный");
        }
        else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        else if (data > 20) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 9;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment ) {
        if (increment == true) {
            int result = initValue + delta;
            System.out.println(result);
        }
        else {
            int result = initValue - delta;
            System.out.println(result);
        }
    }

    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public static boolean randomBoolean = getRandomBoolean();

    public static void methodDependsOnInput() {
        Scanner scanner = new Scanner(System.in);
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 100);
        int c = (int)(Math.random() * 100);

        System.out.println(a + " , " + b + " , " + c + " , " + randomBoolean); //с

        System.out.println("Введите число от 1 до 5, чтобы дать задание программе:");
        int numberFromInput = scanner.nextInt();
        if (numberFromInput == 1) {
            greetings();
        }
        else if (numberFromInput == 2) {
            checkSign(a, b, c);        }
        else if (numberFromInput == 3) {
            setColor();
        }
        else if (numberFromInput == 4) {
            compareNumbers();
        }
        else if (numberFromInput == 5) {
            addOrSubtractAndPrint(a, b, randomBoolean);
        }
        else {
            System.out.println("Вы ввели неправильное число");
        }
    }
}
