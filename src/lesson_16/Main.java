package lesson_16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Вывести в консоль из строки которую пользователь вводит с клавиатуры все
        //аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
        //только из прописных букв, без чисел.
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String str;
        Pattern abbrev = Pattern.compile("[А-ЯA-Z]{2,6}");
        try {
            str = scanner.nextLine();
            Matcher matcher = abbrev.matcher(str);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (Exception ex) {
            System.out.println("...");
        }
        //Программа на вход получает произвольный текст. В этом тексте может быть номер
        //документа(один или несколько), емейл и номер телефона. Номер документа в формате:
        //xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
        //может содержать не всю информацию, т.е. например, может не содержать номер
        //телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
        //формате:
        //email: teachmeskills@gmail.com
        //document number: 1423-1512-51
        System.out.println("Введите строку");
        Pattern doc = Pattern.compile("[\\d]{4}[-][\\d]{4}[-][\\d]{2}");
        Pattern email = Pattern.compile("([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}");
        Pattern phone = Pattern.compile("[+(]{2}[\\d]{2}[)]{1}[\\d]{7}");
        try {
            str = scanner.nextLine();
            Matcher matcherDoc = doc.matcher(str);
            Matcher matcherEmail = email.matcher(str);
            Matcher matcherPhone = phone.matcher(str);
            while (matcherDoc.find()) {
                System.out.println("document number: "+matcherDoc.group());
            }
            while (matcherEmail.find()) {
                System.out.println("email: "+matcherEmail.group());
            }
            while (matcherPhone.find()) {
                System.out.println("phone number: "+matcherPhone.group());
            }
        } catch (Exception ex) {
            System.out.println("как будто обработали исключения");
        }
    }
}
