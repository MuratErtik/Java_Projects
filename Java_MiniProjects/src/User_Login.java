
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dmura
 */
public class User_Login {
    
    public static void main(String[] args){
        String username = "Murat";
        
        String password = "1212";
        //I created username and password values.
        int false_entry = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Welcome to Application! Please Enter your Username and Password:");
        
        while(false_entry<3){
            System.out.println("Username:");
            String L_username = scanner.next();
            System.out.println("Password:");
            String L_password = scanner.next();
            false_entry++;
            if (username.equals(L_username) && password.equals(L_password)) {
                System.out.println("Login........");
                System.out.println("You login successfully");
                break;
            }
            else if (!(username.equals(L_username))) {
                System.out.println("Login Error Please Check Your Username!");
            }
            else if (!(password.equals(L_password))) {
                System.out.println("Login Error Please Check Your Password!");
            }
             
        }   
        if (false_entry==3) {
                System.out.println("Your False login 3 times please try later!");
            }
        
    }
}
