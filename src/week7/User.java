package week7;

import java.util.Date;

public class User implements Serializable{
    static String password;
    public static String email;
    private String First_name;
    private String Last_name;
    private Date Birthday;
    private boolean Gender;
    
    //Ссылочные типы указываются с большой буквы (List), так же как и String. С маленькой - только примитивные типы
    private list <Loan> Loan;
    private list <DebitCard> card;

        @Override
    public String toString(){
        return ("Name: " + First_name + "/mSurname: " + Last_name + "m/Birth_Date: " + Birthday + "/mGender: " + Gender + "/mE-mail: " + email
                );}
    public String getFirst () {
        return First_name;
    }
    public void setFirst (String First_name) {
        this.First_name = First_name;
    }
    public String getLast () {
        return Last_name;
    }
    public void setLast (String Last_name) {
        this.Last_name = Last_name;
    }
    public String getEmail () { return email;}
    public void getEmail (String email) { this.email = email;}
    public String getPassword () {return password;}
    public void getPassword (String password) {this.password = password;}
    private class list<T> {
    }
}
