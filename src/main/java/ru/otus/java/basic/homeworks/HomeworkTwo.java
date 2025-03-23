package ru.otus.java.basic.homeworks;

public class HomeworkTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 15, 17, 7};
        printString(5, "Hello");
        sumElementsMoreThanFive(1, 5, 8, 4, 9, 11);
        fillArray(2, arr);
        increaseEveryElement(2, arr);
        compareTwoHalfs(arr);
    }

    public static void printString (int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    public static void sumElementsMoreThanFive (int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
    public static void fillArray (int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
    }
    public static void increaseEveryElement(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
        }
    }

    public static void compareTwoHalfs(int[] arr) {
        int sum1 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        int sum2 = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }

        if (sum1 > sum2) {
            System.out.println("Cумма элементов 1й половины массива больше");
        }
        else if (sum1 < sum2) {
            System.out.println("Cумма элементов 2й половины массива больше");
        } else if (sum1 == sum2) {
            System.out.println("Cуммы элементов 1й и 2й половины равны");
        }
    }
}
