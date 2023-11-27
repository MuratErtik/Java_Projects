
package City_Tour;

import java.util.LinkedList;

import java.util.ListIterator;
import java.util.Scanner;



public class Main {
    public static void showMenu(){
        System.out.println("0-Show Menu");
        System.out.println("1-Go to the next city");
        System.out.println("2-Go back to the previous city");
        System.out.println("3-Quit the application");
    }
    public static void cityTour(LinkedList<String> linkedlist){
        ListIterator<String> iterator = linkedlist.listIterator();
        
        int action;
        
        showMenu();
        
        Scanner scn = new Scanner(System.in);
        
        //this code means LinkedList is empty or not!
        if (!(iterator.hasNext())) {
            System.out.println("No cities there!");
        }
        boolean quit = false;
        
        boolean go = true;
        
        while (!quit) {            
            System.out.println("Choose your action:");
            action = scn.nextInt();
            if (action==0) {
                showMenu();
            }
            else if (action==1){
                if (!go) {
                    if (iterator.hasNext()) {
                        iterator.next();
                    }
                    go = true;
                }
                if (iterator.hasNext()) {
                    System.out.println("Going to city...."+iterator.next());
                }
                else{
                    System.out.println("There is a not city for goes!");
                    go = true;
                }
            }
            else if (action==2) {
                if (go) {
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    go = false;
                }
                if (iterator.hasPrevious()) {
                    System.out.println("Going to city...."+iterator.previous());
                }
                else{
                    System.out.println("City tour has been stared!");
                }
            }
            else if(action==3){
                quit = true;
                System.out.println("Application has been closing.....");
            }
            else{
                System.out.println("Invalid action!!!");
            }
        }
        
        
        
        
        
    }
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Izmir");
        
    }
}
