
package Singers;
import java.util.Scanner;

public class test {
    private static Singers singers = new Singers();
    //Instance of Composition   
    private static Scanner scn = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("\t 0-Show Menu");
        System.out.println("\t 1-Show Singers");
        System.out.println("\t 2-Add Singer");
        System.out.println("\t 3-Update Singer");
        System.out.println("\t 4-Delete Singer");
        System.out.println("\t 5-Find Singer");
        System.out.println("\t 6-Quit Application");
    }
    public static void addSinger(){
        System.out.println("Please enter name:");
        String name = scn.next();
        singers.addSinger(name);
    }
    public static void updateSinger(){
        System.out.println("Please enter a position in list for update a name");
        int pozition = scn.nextInt();
        System.out.println("Please enter new name:");
        String new_name = scn.next();
        singers.updateSinger(new_name, pozition-1);
    }
    public static void deleteSinger(){
        System.out.println("Please enter a position in list for update a name");
        int pozition = scn.nextInt();
       
        singers.deleteSinger(pozition-1);
    }
    public static void findSinger(){
        System.out.println("Please enter name:");
        String name = scn.next();
        singers.findSinger(name);
    }
    public static void main(String[] args) {
        System.out.println("\t Welcome to Singer Application");
        
        showMenu();
        
        boolean quit = false;
        int action;
        while (!quit) {            
            System.out.println("Choose your actions!");
            action = scn.nextInt();
            
            scn.nextLine();
            //uygulamada hata meydana gelmesin diye
            //when user enter  information twice consecutive program is not going to fail by this code
            switch(action){
                case 0:
                    showMenu();
                    break;
                case 1:
                   
                    singers.showSingers();
                    break;
                case 2:
                    addSinger();
                    break;
                case 3:      
                    updateSinger();
                    break;
                case 4:
                    deleteSinger();
                    break;
                case 5:
                    findSinger();
                    break;
                    
                case 6:
                    quit=true;
                    System.out.println("Application has been closing..");
                    break;
                default:
                    System.out.println("Invalid action!!!");
                    break;
                    
                    
            }
        }
        
    }
}
