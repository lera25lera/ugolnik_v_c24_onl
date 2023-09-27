package lesson_11;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    public String toString() {
        return "WrongLoginException{" + "message=" + getMessage();
    }
}
