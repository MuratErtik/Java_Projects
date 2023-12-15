
package Account;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    //assume all accounts have same interest rate!
    private Date dateCreated;
    private static int numberOfAccount=0;
    
    
    public Account(){
        numberOfAccount++;
    }
    public Account(double balance){
        this.balance=balance;
        numberOfAccount++;
        
        
    }
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
        numberOfAccount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        Date date = new Date();
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         String createdDate = formatter.format(date);
        return createdDate;
    }

    public static int getNumberOfAccount() {
        return numberOfAccount;
    }
    
    //The method getMonthlyInterest() is to return monthly interest, not the interest rate.
    //Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. 
    //Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)
    public double getMonthlyInterest(){
        double monthlyInterestRate = annualInterestRate/12;
        
        return balance*monthlyInterestRate;
    }
    public double getMonthlyInterestRate(){
        double monthlyInterestRate = annualInterestRate/12;
        return  monthlyInterestRate;
    }
    public void withdraw(int amountOfMoney){
        if (amountOfMoney>balance) {
            System.out.println("Insufficent Balance!");
            
        }
        else{
            balance-=amountOfMoney;
        }
    }
    public void deposit(int amountOfMoney){
        balance+=amountOfMoney;
    }
    
    
    
           
}
