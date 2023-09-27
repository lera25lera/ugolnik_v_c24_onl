package lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //xxxx-yyy-xxxx-yyy-xyxy
        //String str = "5555-ABC-4560-RGU-5G7D";
        System.out.println("Введите номер документа в формате: '5555-ABC-4560-RGU-5G7D'");
        String str = scanner.nextLine();
        String format = "(\\d{4}-[a-zA-Z]{3}-){2}(\\d[a-zA-Z]){2}";
        if (!str.matches(format)) {
            System.out.println("Введенный номер не соотвествует маске ввода");
        } else {
            //Вывести на экран в одну строку два первых блока по 4 цифры.
            FunctionsLib.task1(str);

            //Вывести на экран номер документа, но блоки из трех букв заменить
            //на *** (каждая буква заменятся на *)
            FunctionsLib.task2(str);

            //Вывести на экран только одни буквы из номера документа в формате
            //yyy/yyy/y/y в нижнем регистре.
            FunctionsLib.task3(str.toLowerCase());

            //Вывести на экран буквы из номера документа в формате
            //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
            //класса StringBuilder).
            FunctionsLib.task4(str.toUpperCase());

            //Проверить содержит ли номер документа последовательность abc и
            //вывети сообщение содержит или нет(причем, abc и ABC считается
            //одинаковой последовательностью).
            FunctionsLib.task5(str.toLowerCase());

            //Проверить начинается ли номер документа с последовательности
            //555.
            FunctionsLib.task6(str);

            //Проверить заканчивается ли номер документа на
            //последовательность 1a2b
            FunctionsLib.task7(str);
        }

        //Дана строка произвольной длины с произвольными словами.
        //Найти самое короткое слово в строке и вывести его на экран.
        //Найти самое длинное слово в строке и вывести его на экран.
        //Если таких слов несколько, то вывести последнее из них.
        System.out.println("Введите строку произвольной длины для поиска самого длинного и самого короткого слова");
        String searchMaxMinWord = scanner.nextLine();
        FunctionsLib.task8(searchMaxMinWord);

        //Дана строка произвольной длины с произвольными словами.
        //Найти слово, в котором число различных символов минимально. Слово
        //может содержать буквы и цифры. Если таких слов несколько, найти первое
        //из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно
        //быть "fffff".
        System.out.println("Введите строку произвольной длины для поиска слова с минимальным количеством уникальных символов");
        String searchMinUniqueLiterals = scanner.nextLine();
        FunctionsLib.task9(searchMinUniqueLiterals);

        //Дана строка произвольной длины с произвольными словами.
        //Написать программу для проверки является ли любое выбранное слово в
        //строке палиндромом. Например, есть строка, вводится число 3, значит необходимо проверить
        //является ли 3-е слово в этой строке палиндромом.
        //Предусмотреть предупреждающие сообщения на случаи ошибочных
        //ситуаций: например, в строке 5 слов, а на вход программе передали число
        //500 и т. п. ситуации.
        System.out.println("Введите предложение");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        int num = 0;
        try {
            num = FunctionsLib.getNumOfWord(words);
        } catch (Exception e) {
            num = FunctionsLib.getNumOfWord(words);
        }
        System.out.println(FunctionsLib.task10(words[num - 1]) ? "полиндром" : "не полиндром");

        ////Дана произвольная строка.
        ////Вывести на консоль новую строку, которой задублирована каждая буква из
        ////начальной строки.
        ////Например, "Hello" -> "HHeelllloo".

        System.out.println("Введите что-нибудь");
        String sen = scanner.nextLine();
        FunctionsLib.task11(sen);
    }
}
