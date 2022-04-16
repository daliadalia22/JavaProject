package week7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {
    private static File File_Name;
    private List<User> users;
    private final String File_name = "Users.data";
    BankMenu bankMenu = new BankMenu(this);
    User loggedInUser = null;
    User a = loggedInUser;

    public static void addDebitCard(DebitCard debitCard) {
    }

    public void start() {
        users = deserializeUsers();
        bankMenu.waiting();
    }

    private List<week7.User> deserializeUsers() {
        return null;
    }

    boolean doLogin(String email) {
        for (User user : users)  {
            if (Objects.equals(user.getEmail(), email) && user.getPassword() == User.password)
                System.out.println("Авторизация успешна");
            loggedInUser = user;
            bankMenu.showBankMenu();
            return true; {
          else {
                System.out.println("Неверный пароль");
            }
            bankMenu.showStartMenu();
        }
        }
            else {
            System.out.println("Неверный емейл");}

            bankMenu.showStartMenu();
         return false;
    }

    public void doRegister(String user) {
        User n;
        serializeUsers(users);
        try {
            Thread.sleep(2000);

            bankMenu.showBankMenu();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void serializeUsers(List<User> users) {
        try {
            FileOutputStream fos = new FileOutputStream(File_Name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(users);
            System.out.println("Регистрация успешна");
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }

    public List<User> deserializeUsers(List<User> user, DebitCard debitCard) {
        try {
            FileOutputStream fis = new FileOutputStream(File_Name);
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            ois.writeObject(users);
            System.out.println("Регистрация успешна");
            ois.close();
        } catch (FileNotFoundException e) {
            File f = new File(String.valueOf(File_Name));
            boolean iscreated = f.exists();
            if (!iscreated) {
                System.out.println("Файл не создан");
            }
            serializeUsers(new ArrayList<User>());
        } catch (IOException e) {
            System.out.println("Ошибка");
        } finally {
        }
        return user;

        final var debitCard1 = debitCard;
        final var debitCard11 = debitCard1;
        final var debitCard111 = debitCard11;
        {
            loggedInUser.ApproveCreditToUser(debitCard111);
        serializeUsers(users);
        }
        }
    public void addLoan(Loan loan) {
        loggedInUser.ApproveCreditToUser(loan);
        serializeUsers(users);
    }
}




