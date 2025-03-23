package ru.otus.java.basic.homeworks;


import java.util.Arrays;

public class HomeworkTwoHard {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 2, 2, 8, 1, 5};
        int[] arr3 = {1, 1, 1, 1};

//        sumArrays(arr1, arr2, arr3);
//        findArrayMiddlePoint(arr);
//        arrayElementsOrderAscDesc(arr, true);
//        reverseArray(arr);

    }

    public static void sumArrays(int[] arr1, int[] arr2, int[] arr3) {
        int length = 0;

        if (length < arr1.length) {
            length = arr1.length;
        }
        if (length < arr2.length) {
            length = arr2.length;
        }
        if (length < arr3.length) {
            length = arr3.length;
        }

        int[] arrTotal = new int[length];

        for (int i = 0; i < length; i++) {
            if (arr1.length > i) {
                arrTotal[i] += arr1[i];
            }
            if (arr2.length > i) {
                arrTotal[i] += arr2[i];
            }
            if (arr3.length > i) {
                arrTotal[i] += arr3[i];
            }
        }
        System.out.println(Arrays.toString(arrTotal));
    }

    // {1, 2, 7, 6, 2} - 18
    public static void findArrayMiddlePoint(int[] arr) {
        int sumOfAllElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfAllElements += arr[i];
        }
        int sumOfLeftPart = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sumOfLeftPart += arr[i];
            if (sumOfLeftPart == sumOfAllElements - sumOfLeftPart) {
                System.out.println("В массиве есть точка, в которой сумма левой и правой части равны");
                break;
            }
        }
        if (sumOfLeftPart != sumOfAllElements - sumOfLeftPart) {
            System.out.println("В массиве нет точки, в которой сумма левой и правой части равны");
        }
    }

    /**
     * asc = true - проверка на то, что элементы в массиве идут в порядке ВОЗРАСТАНИЯ
     * asc = false - проверка на то, что элементы в массиве идут в порядке УБЫВАНИЯ
     */
    public static void arrayElementsOrderAscDesc(int[] arr, boolean asc) {
        if (asc) {
            int decision = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= arr[i - 1]) {
                    decision = 1;
                    break;
                }
            }
            if (decision == 1) {
                System.out.println("Элементы массивы НЕ идут в порядке возрастания");
            } else {
                System.out.println("Элементы массивы идут в порядке возрастания");
            }
        }
        else if (asc == false) {
            int decision = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] >= arr[i - 1]) {
                    decision = 1;
                    break;
                }
            }
            if (decision == 1) {
                System.out.println("Элементы массивы НЕ идут в порядке убывания");
            } else {
                System.out.println("Элементы массивы идут в порядке убывания");
            }
        }
    }

    public static void reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        int n = 0;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            reversedArray[n] = arr[i];
            n++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reversedArray[i];
        }
    }
}