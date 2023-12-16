
package Fan;



public class Fan {
    
    private final int SLOW=1;
    private final int MEDIUM=2;
    private final int FAST=3;
    private int speed = SLOW;
    private double radius =5;
    private boolean on = false;
    private final String color = "Blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (on==true) {
            this.speed = speed;
        }
        
        
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (on==true) {
            this.radius = radius;
        }
        
    }

    public String getColor() {
        return color;
    }

    

    public Fan() {
    }
    
    public String fanInfo(){
        if (on==true) {
            return "Fan speed is:"+this.getSpeed()+"\nFan color is:"+this.getColor()+"\nFan radius is:"+this.getRadius();
        }
        else{
            return "Fan is off! Open the fan for get information!";
        }
    }
    public void openFan(){
        if (on==false) {
            on=true;
        }
        else{
            System.out.println("Fan is already open!");
        }
    }
    public void closeFan(){
        if (on==true) {
            on=false;
        }
        else{
            System.out.println("Fan is already close!");
        }
    }
    
    
}
