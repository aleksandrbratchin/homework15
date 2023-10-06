package exceptions;

public class WrongPasswordLengthException extends WrongLoginException {
    public WrongPasswordLengthException() {
        super("Длинна пароля должна быть равна или меньше 20 символов.");
    }

    public WrongPasswordLengthException(String message) {
        super(message);
    }
}
