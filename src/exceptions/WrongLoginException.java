package exceptions;

public class WrongLoginException extends RuntimeException {

    public WrongLoginException() {
        super("Неверный логин");
    }

    public WrongLoginException(String message) {
        super("Неверный логин. " + message);
    }

}
