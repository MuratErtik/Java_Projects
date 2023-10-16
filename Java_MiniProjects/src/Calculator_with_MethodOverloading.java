
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dmura
 */
public class Calculator_with_MethodOverloading {
    
    public static int Addition(int a,int b){
        return a+b;
    }
    
    public static int Addition(int a,int b,int c){
        return a+b+c;
    }
    
    public static int Subtraction(int a,int b){
        return a-b;
    }
    
    public static int Subtraction(int a,int b,int c){
        return a-b-c;
    }
    
    public static int Multiplication(int a,int b){
        return a*b;
    }
    
    public static int Multiplication(int a,int b,int c){
        return a*b*c;
    }
    
    public static int Division(int a,int b){
        return a/b;
    }
   
    
    public static void main(String[] args) {
        //this calculator provide 2 number or 3 number
        System.out.println("**************************************************");
        System.out.println("1.Addition");
        System.out.println("Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("press '5' for quit the Calculator!");
        System.out.println("User can enter 2 or 3 value to find answer(not in Division)");
        System.out.println("**************************************************");
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Please choose your action:");
            int action = scanner.nextInt();
            
            if (action==1) {
                System.out.println("How many numbers do you want to add? ");
                int action2= scanner.nextInt();
                if (action2==2) {
                    System.out.println("Please enter 2 number!");
                    System.out.println("1.Number:");
                    int number1 = scanner.nextInt();
                    System.out.println("2.Number:");
                    int number2 = scanner.nextInt();
                    System.out.println("Answer:"+Addition(number1, number2));
                    
                }
                else if (action2==3) {
                    System.out.println("Please enter 3 number!");
                    System.out.println("1.Number:");
                    int number1 = scanner.nextInt();
                    System.out.println("2.Number:");
                    int number2 = scanner.nextInt();
                    System.out.println("3.Number:");
                    int number3 = scanner.nextInt();
                    System.out.println("Answer:"+Addition(number1, number2,number3));
                }
                else{
                    System.out.println("Calculator dont have ability like this!");
                }
            }
            else if (action==2) {
                System.out.println("How many numbers do you want to add? ");
                int action2= scanner.nextInt();
                if (action2==2) {
                    System.out.println("Please enter 2 number!");
                    System.out.println("1.Number:");
                    int number1 = scanner.nextInt();
                    System.out.println("2.Number:");
                    int number2 = scanner.nextInt();
                    System.out.println("Answer:"+Subtraction(number1, number2));
                }
                else if (action2==3) {
                    System.out.println("Please enter 3 number!");
                    System.out.println("1.Number:");
                    int number1 = scanner.nextInt();
                    System.out.println("2.Number:");
                    int number2 = scanner.nextInt();
                    System.out.println("3.Number:");
                    int number3 = scanner.nextInt();
                    System.out.println("Answer:"+Subtraction(number1, number2,number3));
                }
                else{
                    System.out.println("Calculator dont have ability like this!");
                }
            }
            else if (action==3) {
                System.out.println("How many numbers do you want to add? ");
                int action2= scanner.nextInt();
                if (action2==2) {
                    System.out.println("Please enter 2 number!");
                    System.out.println("1.Number:");
                    int number1 = scanner.nextInt();
                    System.out.println("2.Number:");
                    int number2 = scanner.nextInt();
                    System.out.println("Answer:"+Multiplication(number1, number2));
                }
                else if (action2==3) {
                    System.out.println("Please enter 3 number!");
                    System.out.println("1.Number:");
                    int number1 = scanner.nextInt();
                    System.out.println("2.Number:");
                    int number2 = scanner.nextInt();
                    System.out.println("3.Number:");
                    int number3 = scanner.nextInt();
                    System.out.println("Answer:"+Multiplication(number1, number2,number3));
                }
                else{
                    System.out.println("Calculator dont have ability like this!");
                }
            }
            
            else if (action==4) {
                    System.out.println("Please enter 2 number!");
                    System.out.println("1.Number:");
                    int number1 = scanner.nextInt();
                    System.out.println("2.Number:");
                    int number2 = scanner.nextInt();
                    System.out.println("Answer:"+Division(number1, number2));
            }
            else if (action==5) {
                System.out.println("Loading.......");
                System.out.println("The application has been closed!");
                break;
            }
            else{
                System.out.println("Invalid Action!");
            }
        }
    }
}
