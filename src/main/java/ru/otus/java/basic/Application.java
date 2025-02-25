package ru.otus.java.basic;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        int n = 0;
//        while (n < 3) {
//            n++;
//            System.out.println("n: " + n);
//        }
//        System.out.println("END");
//        int n = 50; можем здесь, как и ниже, создать переменную n, потому что переменные живут в том кодовом блоке,
        // в котором созданы

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int n = scanner.nextInt();
//        System.out.println("Вы ввели число: " + n);

        int m = (int)(Math.random() * 10); // целое число от 0 до 9, то есть до (10-1)
        int a = (int)(Math.random() * 50); // целое число от 0 до 49, то есть до (50-1)

        // Math.random() = 0.0 - 0.999999999
        // (int) переводит (Math.random() * 10) в целое число - то есть откидывает дробную часть
        System.out.println(m);
    }

    public static void printJavaNTimes(int times) {
        int n = 0;
        while (n < times) {
            n++;
            System.out.println("Java");
        }
    }
}


//        while (true) {
//            n++;
//            System.out.println("n: " + n);
//            if (n == 50) {
//                break;
//            }
//        }
//        System.out.println("END");


//        int temperature = 10;
//
//        if (temperature >= 0) {
//            System.out.println("На улице тепло");
//        }
//        else System.out.println("На улице холодно"); // блок else не является обязательным
//
//        int n = 1;
//        int b = 2;
//        if ((n > 0 && n < 20) || b == 5){
//            System.out.println("Все ок");
//        }


//        if (temperature >= 0) {
//            System.out.println("На улице тепло");
//        }
//        if (temperature < 0) {
//            System.out.println("На улице холодно");
//        }

        //       System.out.print("Hello World!"); //без переноса на след строку
//        System.out.println(true);
//        System.out.println('?');
//        System.out.print(1);
//        System.out.print("Hello");
//
//        /** перенос на следующую строку с помощью \n */
//        System.out.println("Hello\nWorld\n12345");
//
//        /** чтобы напечатать обратный слэш с "\", нужно напечатать двойной слэш "\\" */
//        System.out.println("Hello\nWorld\n12345 \\");
//
//
//        System.out.println("Java: " + 100 + " ABCD");
//
//        int n = 500;
//        System.out.println("Java: " + n + " ABCD");
//
//        System.out.println(1 + 1 + "A" + 1 + 1);
//        //2A11 - так как джава идет слева направо и, начиная с "A", считает, что дальше все это стринги
//
//        System.out.println(1 + 1 + "A" + (1 + 1));
//        //2A2 - так как то, что в скобках, то есть (1 + 1), имеет приоритет
//
//        final int myFirstVariable = 100; //константа - т.е. с помощью слова final я запретил ищзменение переменной
//
//        /** разница между float и double */
//        float a = 1.123456789123456f;  // вывод: 1.1234568         - меньшая точность
//        double b = 1.123456789123456;  // вывод: 1.123456789123456 - большая точность
//
//        System.out.println(a);
//        System.out.println(b);
//
//        char c = '*';
//        System.out.println(c);
//
//        char d = '\u2242'; // в переменую типа char также можно положить кодировку
//        System.out.println(d);
//
//        // String - это ссылочный тип данных
//        // переменная примитивного типа - мы сразу знаем, сколько места она будет занимать
//        // переменная ссылочного типа - не знаем
//
//        int l = 9;
//
//        if (l % 2 == 0) {
//            System.out.println("Чётное");
//        }
//        else System.out.println("Нечётное");

//printSquare(1);
//printSquare(2);
//printSquare(3);
//
//        printSquare2(3, 2);
//        printSquare2(1, 0);
//    }
//    public static void printSquare(int num) { //новый метод по типу вот этого нельзя объявить в методе main (выше)
//        //объявлять методы можно и выше main, и ниже main - не важно
//        System.out.println("-----");
//        System.out.println("-   -");
//        System.out.println("- " + num + " -");
//        System.out.println("-   -");
//        System.out.println("-----");
//    }
//
//    public static void printSquare2(int a, int b) {
//        int sum = a + b;
//
//        System.out.println("-----");
//        System.out.println("-   -");
//        System.out.println("- " + sum + " -");
//        System.out.println("-   -");
//        System.out.println("-----");
//    }




