package lesson_11;

import java.util.Optional;
import java.util.Scanner;

public class Authorization {
    public static void checkAuth(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String format = ".*\\d+.*";
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Логин указан неверно");
        }
        if (password.length() >= 20 || !password.matches(format) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль указан неверно");
        }
    }

    public static Optional<String> scan() {
        Scanner scanner = new Scanner(System.in);
        return Optional.ofNullable(scanner.nextLine());
    }
}