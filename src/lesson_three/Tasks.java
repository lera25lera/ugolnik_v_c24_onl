package lesson_three;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        int i;
//  Пройти по массиву, вывести все элементы в прямом и в обратном порядке

        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("Элементы массива в прямом порядке");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Элементы массива в обратном порядке");
        for (i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

//        Найти минимальный-максимальный элементы и вывести в консоль.
//        Найти индексы минимального и максимального элементов и вывести в консоль

        int max = arr[0];
        int index_max = 0;
        int min = arr[0];
        int index_min = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index_max = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                index_min = i;
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Индекс максимального элемента: " + index_max);
        System.out.println("Индекс минимального элемента: " + index_min);
//        Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//        сообщение, что их нет.
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count += 1;
            }
        }
        System.out.println("Количество нулевых элементов в массиве равно: " + count);
//        Пройти по массиву и поменять местами элементы первый и последний, второй и
//        предпоследний и т.д.
        int buff;
        int len = arr.length;
        for (i = 0; i < len; i++) {
            buff = arr[i];
            arr[i] = arr[len - 1];
            arr[len - 1] = buff;
            len = len - 1;
        }
        System.out.println(Arrays.toString(arr));

//        Проверить, является ли массив возрастающей последовательностью (каждое следующее
//        число больше предыдущего)
        max = 0;
        count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count += 1;
            } else break;
        }
        if (count == arr.length) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }

    }

    public static int[] generateRandomArray() {
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
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            array[i] = Math.round((float) (Math.random() * 100));
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
