package lesson10;

import java.lang.reflect.Array;
import java.util.*;

public class FunctionsLib {

    public static void task1(String str) {
        String[] strArray = str.split("-");
        String str1 = strArray[0] + strArray[2];
        System.out.println(str1);
    }

    public static void task2(String str) {
        String[] strArray = str.split("-");
        strArray[1] = "***";
        strArray[3] = strArray[1];
        System.out.println(String.join("-", strArray));

    }

    public static void task3(String str) {
        int len = str.length();
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < len; i++) {
            if (!Character.isLetter(stringBuilder.charAt(i))) {
                stringBuilder.deleteCharAt(i);
                i--;
                len--;
            }
        }
        stringBuilder.insert(3, '/');
        stringBuilder.insert(7, '/');
        stringBuilder.insert(9, '/');
        System.out.println(stringBuilder);
    }

    public static void task4(String str) {
        int len = str.length();
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < len; i++) {
            if (!Character.isLetter(stringBuilder.charAt(i))) {
                stringBuilder.deleteCharAt(i);
                i--;
                len--;
            }
        }
        stringBuilder.insert(3, '/');
        stringBuilder.insert(7, '/');
        stringBuilder.insert(9, '/');
        System.out.println("Letters:" + stringBuilder);
    }

    public static void task5(String str) {
        System.out.println(str.contains("abc"));
    }

    public static void task6(String str) {
        System.out.println(str.startsWith("555"));
    }

    public static void task7(String str) {
        System.out.println(str.endsWith("1a2b"));
    }

    public static void task8(String str) {
        String[] strArr = str.split(" ");
        int indexMin = 0;
        int min = strArr[0].length();
        int max = min;
        int indexMax = indexMin;
        for (String arrayUnit : strArr
        ) {
            if (arrayUnit.length() >= max) {
                max = arrayUnit.length();
                indexMax = Arrays.asList(strArr).indexOf(arrayUnit);
            }
            if (arrayUnit.length() <= min) {
                min = arrayUnit.length();
                indexMin = Arrays.asList(strArr).indexOf(arrayUnit);
            }
        }
        System.out.println("Длинное слово: " + strArr[indexMax].toString());
        System.out.println("Короткое слово: " + strArr[indexMin].toString());
    }

    public static void task9(String str) {
        String[] strArr = str.split(" ");
        int minIndex = 0;
        for (int i = strArr.length - 1; i >= 0; i--) {
            int minCountUniqueLiterals = Integer.MAX_VALUE;
            Set<Character> characterSet = new HashSet<>();
            for (char literal : strArr[i].toCharArray()) {
                characterSet.add(literal);
            }
            if (characterSet.size() < minCountUniqueLiterals) {
                minCountUniqueLiterals = characterSet.size();
                minIndex = i;
            }
        }
        System.out.println(strArr[minIndex].toString());
    }

    public static Integer getNumOfWord(String[] sen) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер слова");
        Integer num = scanner.nextInt();
        if (num > sen.length) {
            System.out.println("Слов меньше. Попробуйте еще раз");
            getNumOfWord(sen);
        }
        return num;
    }

    public static Boolean task10(String word) {
        char[] arr = word.toLowerCase(Locale.ROOT).toCharArray();
        int len = arr.length;
        for (int i = 0; i < len / 2 + 1; i++) {
            boolean b = arr[i] == arr[len - i - 1];
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static void task11(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        int len = text.length();
        for (int i = 0; i < len; i++) {
            stringBuilder.append(text.charAt(i));
            stringBuilder.append(text.charAt(i));
        }
        System.out.println(stringBuilder);
    }

}
