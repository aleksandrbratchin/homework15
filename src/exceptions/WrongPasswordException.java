package exceptions;

public class WrongPasswordException extends RuntimeException {

    public WrongPasswordException() {
        super("Неверный пароль");
    }

    public WrongPasswordException(String message) {
        super("Неверный пароль. " + message);
    }

}
