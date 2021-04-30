/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;


public class Physician extends Person {
    
   // private String expertise; 
    private List<String> expertise ;
    private int consulation_hours; 
    
    
    public Physician(int Id, String fullname, String address, String phone,int chours){
        
         super(Id,fullname,address,phone);
         consulation_hours = chours;
         expertise = new ArrayList<>();
    }

   
    public List<String> getExpertise() {
       return expertise;
    }

    public void addExpertise(String expertisee) {
       expertise.add(expertisee);
    }

    public int getConsulation_hours() {
        return consulation_hours;
    }

    public void setConsulation_hours(int consulation_hours) {
        this.consulation_hours = consulation_hours;
    }
    
     public String toString(){
         return (super.getFullname() +" "+super.getAddress()+" "
                 +super.getPhone()+ " "+super.getId()+" "+consulation_hours+" "+expertise);
     }
}
