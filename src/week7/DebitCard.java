package week7;

import java.util.Date;

public class DebitCard {
     private double balance;
     
     //Если название переменной состоит из 2 или более слов то называться переменная должна camelCase'ом
     private String card_number;
     private Date date;
     private int cvv;
    public DebitCard(Double balance, Double cardNumber, String endDate, int cvv) {
    }

    public String toString() {
         return ("Current Balance: " + balance + "/m Card Number:" + card_number + "/m End Date" + date + "/m CVV" + cvv);
     }
     public double getBalance () {
         return balance;
     }
     public void setBalance (double Balance) {
         this.balance = balance;
     }
     public String getCardNumber () {
         return card_number;
     }
     public void setCardNumber (String card_number) {
         this.card_number = card_number;
     }
     public Date getDate () {
         return date;
     }
     public void setExpDate (Date date) {
         this.date = date;
     }
    private void addDebitCard() {
    }
}

