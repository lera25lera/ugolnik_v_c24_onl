package lesson_14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//      Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
//      когда пользователю исполнится 100 лет. Использовать Date/Time API.
        System.out.println("Введите дату рождения в формате dd.mm.yyyy");
        Scanner scanner = new Scanner(System.in);
        String regex = "^\\d{2}.\\d{2}.\\d{4}$";
        String dB = "";
        try {
            dB = scanner.nextLine();
            if (dB.matches(regex)) {
                LocalDate dateBirth = LocalDate.parse(dB, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                LocalDate inCentury = dateBirth.plusYears(100);
                System.out.println("Дата, когда пользователю исполнится 100 лет: " + inCentury.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            } else {
                System.out.println("Неверный формат ввода");
            }
        } catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
        ;
//      Используя Predicate среди массива чисел вывести только те, которые являются
//      положительными.
        int[] arrInt = new int[]{-10, 2, 5, 7, -1};
        for (int j : arrInt) {
            Predicate<Integer> predicate = x -> x >= 0;
            if (predicate.test(j)) {
                System.out.println(j);
            }
        }
//        Используя Function реализовать лямбду, которая будет принимать в себя строку в
//        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//        возвращать сумму, переведенную сразу в доллары.
        String sumByn = "400 BYN";
        Function<String, Double> getUsdByByn = Main::getUsd;
        if (getUsdByByn.apply(sumByn) != null) {
            System.out.println(getUsdByByn.apply(sumByn));
        } else {
            System.out.println("Была введена неверная сумма");
        }
//        Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
//        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
//        выводить сумму, переведенную сразу в доллары.
        Consumer<String> consumer = str -> {
            try {
                System.out.println(Double.parseDouble(str.substring(0, str.indexOf(' '))) / 3);
            } catch (Exception ex) {
                System.out.println("Была введена неверная сумма");
            }
        };
        String sumBynNew = "4 BYN";
        consumer.accept(sumBynNew);
//        Используя Supplier написать метод, который будет возвращать введенную с консоли
//        строку задом наперед
        Supplier<String> supplier = () -> {
            System.out.println("Введите строку");
            String userInput = scanner.nextLine();
            StringBuilder stringBuilder = new StringBuilder(userInput);
            return String.valueOf(stringBuilder.reverse());
        };
        System.out.println(supplier.get());
    }

    private static Double getUsd(String byn) {
        String sum = byn.trim().substring(0, byn.indexOf(' '));
        try {
            return Double.parseDouble(sum) / 3;
        } catch (Exception ex) {
            return null;
        }
    }
}
