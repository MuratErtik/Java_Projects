
package Go_Abroad;

import java.util.Scanner;


public class Passenger implements IRules {
    private int departureFee;
     
    private boolean restriction;
     
    private boolean visaSituation;
    
    public Passenger(){
        Scanner scn = new Scanner(System.in);
        System.out.print("PLease enter Departure fee you paid:");
        this.departureFee = scn.nextInt();
        scn.nextLine();
        System.out.print("Do you have any restriction of political[Y/N]");
        String answer = scn.next();
        if (answer.equals("Y")){
            restriction=true;
        }
        else  {
            restriction=false;
        }
        System.out.print("Do you have a visa?[Y/N]");
        String answer2 = scn.next();
        if (answer2.equals("Y")) {
            visaSituation = true;
        }
        else{
            visaSituation=false;
        }
        
        
    }

    @Override
    public boolean departureFee() {
        if(this.departureFee<3000){
            System.out.println("Insufficient amount");
            return false;
        }
        else{
            System.out.println("Successfully ");
            return true;
        }
    }

    @Override
    public boolean restriction() {
        if (restriction==true) {
            System.out.println("You can not go to the abroad!");
            return false;
        }
        else{
            System.out.println("There is a not restriction");
            return true;
        }
    }

    @Override
    public boolean visaSituation() {
        if (this.visaSituation==true) {
            System.out.println("Visa completed");
            return true;
            
        }
        else{
            System.out.println("Visa did not complete");
            return false;
        }
    }
    
    
     
     
}
