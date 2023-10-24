
package Employeers;


public class Employeers {
    private String name;
    private int id;
    private int salary;
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employeers(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    
    
    public void show_Information(){
        System.out.println("**************************************************");
        System.out.println("             EMPLOYEER INFORMATIONS            ");
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Salary:"+salary+"TL");
        System.out.println("**************************************************");
    }
    

}
