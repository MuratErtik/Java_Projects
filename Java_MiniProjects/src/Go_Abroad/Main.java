
package Go_Abroad;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Sabiha Gökçen International Terminal");
        String rules = "Rules for Go to the Abroad\n"
                + "If you have a any political restriction you do not go to the abroad!\n"
                + "If you dont pay the departure fee you do not go to the abroad!\n"
                + "If you dont have a visa you do not go to the abroad!";
        String message = "If there is a or any rules you can not go to the abroad!";
        
        while (true) {            
            System.out.println("***********************************************");
            System.out.println(message);
            System.out.println("***********************************************");
            System.out.println(rules);
            Passenger passenger1 = new Passenger();
            System.out.println("Departure fee is controlling....");
            Thread.sleep(3000);
            if (passenger1.departureFee()==false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Political Restriction is controlling");
            Thread.sleep(3000);
            if (passenger1.restriction()==false) {
                System.out.println(message);
                continue;
            }
            System.out.println("Visa situation is controlling...");
            Thread.sleep(3000);
            if (passenger1.visaSituation()==false) {
                System.out.println(message);
                continue;
            }
            System.out.println("You can go to he abroad!");
            break;
           
        }
                
    }
}
