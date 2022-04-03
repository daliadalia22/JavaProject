package week7;

public class Bank {
    public User[] users;
    public void serializeUsers() {

    }
    public User[] deserializeUsers() {

        return new User[0];
    }
    public void start() {
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
public void doRegister() {
    }

    public void doLogin() {
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
