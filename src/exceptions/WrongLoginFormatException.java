package exceptions;

public class WrongLoginFormatException extends WrongLoginException {
    public WrongLoginFormatException() {
        super("Имя пользователя должно содержать в себе только латинские буквы, цифры и знак подчеркивания.");
    }

    public WrongLoginFormatException(String message) {
        super(message);
    }
}
