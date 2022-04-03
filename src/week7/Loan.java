package week7;

import java.util.Date;
public class Loan {
    String issueDate;
    Double sum;
    Double percent;
    Integer duration;
    Double monthlyPayment;
    public String toString() {
        return ("Issue Date: " + issueDate + "/m Sum:" + sum + "/m Percent" + percent + "/m duration" + duration +
                "/m monthlyPayment" + monthlyPayment);
    }
    public String getIssueDate () {return issueDate;
    }
    public void setIssueDate (String issueDate) {
        this.issueDate = issueDate;
    }
    public double getSum () {return sum;
    }
    public void setSum (Double sum) {
        this.sum = sum;
    }
    public Double getPercent () {
        return percent;
    }
    public void setPercent (Double percent) {
        this.percent = percent;
        }
    public Integer getDuration () {
        return duration;
    }
    public void setDuration (Integer duration) {
        this.duration = duration;
    }
    public Double getMonthlyPayment () {
        return monthlyPayment;
    }
    public void setMonthlyPayment (Double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
