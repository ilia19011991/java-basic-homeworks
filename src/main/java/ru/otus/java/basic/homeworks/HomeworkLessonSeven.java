package ru.otus.java.basic.homeworks;

public class HomeworkLessonSeven {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {8, 4, -5}, {5, 7, 4}};
        int[][] arr2 = {{1, 2, 3, 4, 7}, {1, 2, 3, 7, 2}, {1, 2, 3, 5, 9}, {1, 2, 5, 8, 8}, {1, 7, 5, 8, 8}};

        int[][] arr3 = {{1, 2, 3}};

    }

    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int size) {
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = 1;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[j][i] == 1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void zeroDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                if (j == arr[i].length - 1 - i) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int sumSecondStringElements(int[][] arr) {
        int sum = 0;
        if (arr.length < 2) {
            sum = -1;
        } else {
            for (int i = 0; i < arr[1].length; i++) {
                sum += arr[1][i];
            }
        }
        return sum;
    }
}

