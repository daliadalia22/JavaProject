package week7;

import java.util.Scanner;

public class BankMenu {
    private final Bank bank;
    private Object debitCard;
    private String user;
    private week7.Loan loan;

    public BankMenu(Bank bank) {
        this.bank = bank;
    }

    public void showBankMenu() {

    }

    public void showStartMenu() {
        System.out.println("Для того, чтобы войти - нажмите 1, для того, чтобы зарегистрироваться - нажмите 2");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 1) {
            bank.doLogin(user);

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
        } else if (number == 2)
            bank.doRegister(user);
        {
            System.out.println("Введите, пожалуйста, Ваши имя, фамилию и дату рождения");
        }
        System.out.println("Show my info = 3 , Add loan = 4 , Add debit card = 5, Exit = 6");
    }


    private void addaLoan() {

    }
    private void showLogin() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите Ваш адрес эл. почты");
    String email = sc.nextLine();
}
public void addaloan (User user) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите дату кредита");
    String date = sc.nextLine();
    System.out.println("Введите сумму кредита");
    Double sum = sc.nextDouble();
    System.out.println("Введите кредитную ставку");
    Double interestRate = sc.nextDouble();
    System.out.println("Введите период, на который берете кредит");
    int months = sc.nextInt();
    Double monthlyPayment = sc.nextDouble();
    monthlyPayment = (sum + months * interestRate) / months;
    Loan loan = new Loan(date, sum, interestRate, months, monthlyPayment);
    sc.close();
    bank.addLoan(loan);
    }
    public void AddDebitCard(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Баланс карты");
        Double balance = sc.nextDouble();
        System.out.println("Введите номер карты");
        String s = sc.nextLine();
        Double cardNumber = sc.nextDouble();
        System.out.println("Введите дату окончания действия карты");
        String endDate = sc.nextLine();
        System.out.println("Введите CVV код");
        int cvv = sc.nextInt();
        sc.close();
        DebitCard debitCard = new DebitCard(balance, cardNumber, endDate, cvv);
        Bank.addDebitCard(debitCard);

    }
    public void waiting() {
    }
}

