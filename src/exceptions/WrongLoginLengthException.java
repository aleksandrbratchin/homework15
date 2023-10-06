package exceptions;

public class WrongLoginLengthException extends WrongLoginException {
    public WrongLoginLengthException() {
        super("Имя пользователя должно быть равно или меньше 20 символов.");
    }

    public WrongLoginLengthException(String message) {
        super(message);
    }
}
