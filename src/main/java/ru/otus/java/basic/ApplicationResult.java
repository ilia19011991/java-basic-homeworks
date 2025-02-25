package ru.otus.java.basic;

import java.util.Scanner;

public class ApplicationResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("КАЛЬКУЛЯТОР");
        while (true) {
            System.out.println("ВВЕДИТЕ ЧИСЛО");
            int a = scanner.nextInt();
            System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО");
            int b = scanner.nextInt();
            System.out.println("Введите операцию: 1 +, 2 -, 3 *, 4 /");
            int operation = scanner.nextInt();

            if (operation == 1) {
                System.out.println(a + "+" + b + "=" + (a + b));
            } else if (operation == 2) {
                System.out.println(a + "-" + b + "=" + (a - b));
            } else if (operation == 3) {
                System.out.println(a + "*" + b + "=" + (a * b));
            } else if (operation == 4) {
                System.out.println(a + "/" + b + "=" + (a / b));
            } else {
                System.out.println("ВЫ ВВЕЛИ НЕИЗВЕСТНУЮ ОПЕРАЦИЮ!");
            }
            System.out.println("Хотите ли еще что-нибудь посчитать (1 - ДА");
            int anotherTry = scanner.nextInt();
            if (anotherTry != 1) {
                break;
            }
        }
        System.out.println("Работа калькулятора завершена!!!");
    }
}





