
package Account;


public class Test {
    public static void main(String[] args) {
        Account acc1 = new Account(1273, 25000);
        acc1.setAnnualInterestRate(4.5);
        acc1.withdraw(5000);
        acc1.deposit(10000);
        System.out.println("After actions"+acc1.getBalance());
        System.out.println("Monthly Interest:"+acc1.getMonthlyInterest()+" Monthly Interest Rate is:"+acc1.getMonthlyInterestRate());
        System.out.println("Created time:"+acc1.getDateCreated());
        
    }
}
