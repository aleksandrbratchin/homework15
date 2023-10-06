package exceptions;

public class WrongPasswordFormatException extends WrongLoginException {
    public WrongPasswordFormatException() {
        super("Пароль должен содержать в себе только латинские буквы, цифры и знак подчеркивания.");
    }

    public WrongPasswordFormatException(String message) {
        super(message);
    }
}
