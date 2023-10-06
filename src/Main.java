import exceptions.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Проверка логина");
        try {
            authentication("HowArd_VoLoviZ_ZaBavNik", "correct_password", "correct_password");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            authentication("Wolowizard!", "correct_password", "correct_password");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Проверка пароля");
        try {
            authentication("Wolowizard", "this_is_a_long_password", "this_is_a_long_password");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            authentication("Wolowizard", "$", "$");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            authentication("Wolowizard", "correct_password", "incorrect_password");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void authentication(String login, String password, String confirmPassword) {

        String reg = "^[a-zA-Z0-9_]{1,20}$";

        if (!login.matches(reg)) {
            if (login.length() > 20) {
                throw new WrongLoginLengthException();
            }
            throw new WrongLoginFormatException();
        }

        if (!password.matches(reg)) {
            if (password.length() > 20) {
                throw new WrongPasswordLengthException();
            }
            throw new WrongPasswordFormatException();
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }

    }


}