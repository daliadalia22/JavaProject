package week7;

import java.util.Date;

public class User {
    static String password;
    public static String email;
    private String First_name;
    private String Last_name;
    private Date Birthday;
    private boolean Gender;
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

    private class list<T> {
    }
}
