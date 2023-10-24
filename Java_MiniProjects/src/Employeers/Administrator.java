
package Employeers;


public class Administrator extends Employeers {
    
    private int employeer_amonut;
    public Administrator(String name,int id,int salary,int employeer_amount){
        super(name,id,salary);
        this.employeer_amonut=employeer_amount;
    }
    
    @Override
    
    public void show_Information(){
        super.show_Information();
        System.out.println("Administrator have "+employeer_amonut+" person in this company");
        
        
    }
    public void get_Raise(int amount_of_raise){
        System.out.println("Salary is updatedingg new increase amount is "+amount_of_raise);
        
    }

    /**
     * @return the employeer_amonut
     */
    public int getEmployeer_amonut() {
        return employeer_amonut;
    }

    /**
     * @param employeer_amonut the employeer_amonut to set
     */
    public void setEmployeer_amonut(int employeer_amonut) {
        this.employeer_amonut = employeer_amonut;
    }
    
}
