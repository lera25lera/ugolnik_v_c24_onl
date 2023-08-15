package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//1.1 Создать двумерный массив, заполнить его случайными числами.
        int[][] arr = generateRandomArray();
//1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        Scanner scanner = new Scanner(System.in);
        int plus;
        System.out.println("Input int number");
        if (scanner.hasNextInt()) {
            plus = scanner.nextInt();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] += plus;
                }
            }
            System.out.println(Arrays.deepToString(arr));
        } else {
            System.out.println("Incorrect input.");
        }
//1.3 Найти сумму всех получившихся элементов и вывести в консоль
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма элементов массива равна " + sum);

//        Создать программу для раскраски шахматной доски с помощью цикла. Создать
//        двумерный массив String 8х8. С помощью циклов задать элементам массива значения
//        B(Black) или W(White)
        String[][] bw = new String[8][8];
        for (int i = 0; i < 8; i = i + 2) {
            for (int j = 0; j < 8; j = j + 2) {
                bw[i][j] = "B";
                bw[i][j + 1] = "W";
            }
        }
        for (int i = 1; i < 8; i = i + 2) {
            for (int j = 0; j < 8; j = j + 2) {
                bw[i][j] = "W";
                bw[i][j + 1] = "B";
            }
        }
        System.out.println(Arrays.deepToString(bw));
        //Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
        //Формат входных данных:
        //Программа получает на вход два числа n и m.
        //Формат выходных данных:
        //Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
        //символа.
        int n = 4;
        int m = 6;
        int[][] array_snake = new int[n][m];
        for (int k = 0; k < n * m; k++) {
            int i = k / m;
            int j = i % 2 == 0 ? k % m : m - 1 - k % m;
            array_snake[i][j] = k;
        }
        System.out.println(Arrays.deepToString(array_snake));
    }

    public static int[][] generateRandomArray() {
        Scanner scanner = new Scanner(System.in);
        int arrSize;
        System.out.println("Input array size > 0");
        if (scanner.hasNextInt()) {
            arrSize = scanner.nextInt();
        } else {
            System.out.println("Incorrect input.");
            return null;
        }
        if (arrSize <= 0) {
            System.out.println("Incorrect input.");
            return null;
        }
        int[][] array = new int[arrSize][arrSize];
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                array[i][j] = Math.round((float) (Math.random() * 100));
            }
        }
        System.out.println(Arrays.deepToString(array));
        return array;
    }
}
