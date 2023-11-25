
package Singers;

import java.util.ArrayList;
public class Singers {
    private ArrayList<String> listofsinger = new ArrayList<String>();
    
    public void showSingers(){
        System.out.println("Your list have "+listofsinger.size()+" singer!");
        
        for (int i =0;i<listofsinger.size();i++){
            System.out.println(i+1+".)"+listofsinger.get(i));
            
        }
    }
    public void addSinger(String name){
        listofsinger.add(name);
        System.out.println("Singer List have been updating!");
    }
    public void updateSinger(String new_name,int index){
        listofsinger.set(index, new_name);
        System.out.println("Singer List have been updating!");
    }
    public void deleteSinger(int index){
        String name= listofsinger.get(index);
        listofsinger.remove(index);
        System.out.println(name+" has been removed the Singer list!");
        
    }
    public void findSinger(String name){
        int index = listofsinger.indexOf(name);
        if (index>=0) {
            System.out.println("Singer is in list");
            System.out.println("Singer in the "+index+1+". pozition");
        }
        else{
            System.out.println("singer in not in list!");
        }
    }
}
