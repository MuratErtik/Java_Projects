
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dmura
 */
public class Basic_Atm_Program {
    
    
    public static void main(String[] args){
        System.out.println("**************************************************");
        System.out.println("1.)Balance Checking");
        System.out.println("2.)Deposit Money Into Account");
        System.out.println("3.)Withdraw Money From Account");
        System.out.println("4.)Please press q for log out from Application");
        System.out.println("Welcome our Bank please choose a process:");
        System.out.println("**************************************************");
        Scanner scanner = new Scanner(System.in);
        int balance=0;
        
        boolean process_continue=true;
        
        while(process_continue){
            System.out.println("Please Choose a Process:");
            int process = scanner.nextInt();
            
            switch (process) {
                case 1:
                    System.out.println("Please Waiting......");
                    System.out.println("Your Balance Information:"+balance+"TL");
                    System.out.println("You are going to Menu back.......");
                    break;
                case 2:
                    System.out.println("Please Waiting......");
                    System.out.println("Please enter money amount:");
                    int money_amount = scanner.nextInt();
                    System.out.println("Processing......");
                    System.out.println("You add: "+money_amount+"TL");
                    balance=balance+money_amount;
                    System.out.println("Your new Balance Information: "+balance+"TL");
                    System.out.println("You are going to Menu back.......");
                    break;
                case 3:
                    System.out.println("Please Waiting......");
                    System.out.println("Please enter money amount: ");
                    int withdraw_money_amount = scanner.nextInt();
                    System.out.println("Processing......");
                    if (withdraw_money_amount<=balance) {
                        System.out.println("You Withdraw: "+withdraw_money_amount+"TL");
                        balance=balance-withdraw_money_amount;
                        System.out.println("Your new Balance Information: "+balance+"TL");
                    }
                    else{
                        System.out.println("Insufficient Balance!");
                    }
                    System.out.println("You are going to Menu back.......");
                    break;
                case 4:
                    System.out.println("Please Waiting......");
                    System.out.println("Thank you! Have a god days!");
                    process_continue=false;
                    break;
                default:
                    System.out.println("invalid process");
            }
        }
    }
}
