/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employeers;

/**
 *
 * @author dmura
 */
public class Developer extends Employeers{
    private String team;
    public Developer(String name,int id,int salary,String team){
        super(name, id, salary);
        this.team=team;
        
    }
   

  

    /**
     * @return the team
     */
    public String getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        this.team = team;
    }
    public void Format(String os){
        System.out.println(getName()+"using "+os);
        
    }
    @Override   
    public void show_Information(){
        super.show_Information();
        System.out.println("Develepor in  "+team);
    }
    
}
