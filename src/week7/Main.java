package week7;

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Bank m = new Bank();
    String password;
    m.start();
    System.out.println("Для того, чтобы войти - нажмите 1, для того, чтобы зарегистрироваться - нажмите 2");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number == 1) {
        System.out.println("Введите, пожалуйста, Ваш адрес электронной почты и пароль");
        User.password = "password";
        User.email = "email";
        String message;
        if (User.email == null) {
            message = "no email address set";
            return;
        }

        if (User.password == null) {
            message = "no password set";
            return;
        }

        if (!User.email.matches("\\w+@\\.\\+")) {
            message = "Invalid Email address";
            return;
        }

        if (User.password.length() < 8) {
            message = "Password must be at least 8 characters";
            return;
        }

        //
        else if (!User.password.matches("\\w*\\s+\\w*")) {
            message = "Password cannot contain space";
            return;
        }
        return;
    }

    else if (number == 2) {
            System.out.println("Введите, пожалуйста, Ваши имя, фамилию и дату рождения");
        }
        System.out.println("Show my info = 3 , Add loan = 4 , Add debit card = 5, Exit = 6");
    return;
    }
}


