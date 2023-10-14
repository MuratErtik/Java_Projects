
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dmura
 */
public class Interest_App {
    public static void main(String[] args){
        /*
        kulanıcıdan anapara değerini ve kaç yıl tutmak istediğini alın
        ver her sene sonu toplam para miktarını ekrana yazdırın.
        yıllık faiz ornı %8
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Application.Please enter your Principal:");
        System.out.println("WARNING:the interest rate is %8 per year");
        double principal=scanner.nextDouble();
        System.out.println("How many year dou you want keep your many in our bank?");
        int year = scanner.nextInt();
                
        for (int i = 0; i<year; i++) {
            principal = principal+((principal*8)/100);
            System.out.println((i+1)+". year the Principal is "+principal+"TL");
        }
        
    }
}
