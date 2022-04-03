package week7;

public class Bank {
    private User[] users;

    public void serializeUsers() {

    }
    public User[] deserializeUsers() {

        return new User[0];
    }
    public void start() {
        
        //не уверен что ты пыталась тут сделать, но тут должен вызываться метод showStartMenu класса BankMenu
        //для этого в этом классе не хватает поля BankMenu
        final var users = deserializeUsers();
      }
      public Boolean doLogin(String email, String password) {
        for (User user: users) {
            if (user.getEmail() == email && user.getPassword() == password){
                 {
                    return true;
                }
            }
        }
        return true;
      }
public void doRegister(User user) {
    }
    
    //также тут должны быть методы doLogin и doRegister
}
