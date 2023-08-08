package lesson_two;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//            Напишите программу, которая будет принимать на вход число из консоли и на выход
//            будет выводить сообщение четное число или нет. Для определения четности числа
//            используйте операцию получения остатка от деления (операция выглядит так: '% 2').
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            String str = i % 2 == 0 ? "Вы ввели четное число" : "Вы ввели нечетное число";
            System.out.println(str);
        } else {
            System.out.println("Вы ввели не целое число");
        }

//            Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
//            Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold»
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Какая температура за бортом?");
        int t;
        if (scanner1.hasNextInt()) {
            t = scanner1.nextInt();
            String s = t > -5 ? "Warm" : t > -20 ? "Normal" : "Cold";
            System.out.println(s);
        } else {
            System.out.println("Вы ввели не целое число");
        }

//            Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        for (int a = 10; a <= 20; a++) {
            System.out.println(Math.pow(a, 2));
        }

//            Необходимо, чтоб программа выводила на экран вот такую последовательность:
//            7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
        i = 7;
        while (i < 105) {
            System.out.println(i);
            i += 7;
        }
    }
}

