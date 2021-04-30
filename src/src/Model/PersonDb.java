/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

public class PersonDb {
     private  List<Patient> patients;
     private  List<Physician> physicians;
     
     public PersonDb(){
          patients = new ArrayList<>();
          physicians = new ArrayList<>();
           this.addData();
     }
    public void addData(){
       
        //
        Patient patient = new Patient(1,"Ali","London,UK","095845235489");
        Patient patient2 = new Patient(2,"Ahmed",",London,UK","095845235489");
        Patient patient3 = new Patient(3,"david","London,UK","078325130221");
        Patient patient4 = new Patient(4,"bukayo","Hatifled,Uk","09023130221");
        Patient patient5 = new Patient(5,"lade","Liverpool,Uk","085231302548");
        
        Physician physician =  new Physician(1,"shiraz","Watford",
                                 "095845235489",2);
        //physician.setExpertise(expertisee);
        Physician physician2 =  new Physician(2,"samuel","Lutton",
                                 "095845235489",2);
        Physician physician3 =  new Physician(1,"elizabeth","Hatfield",
                                 "095845235489",2);
        Physician physician4 =  new Physician(1,"williams","england",
                                 "095845235489",2);
        Physician physician5 =  new Physician(1,"john","liverpool",
                                 "095845235489",2);
          
        patients.add(patient);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);
        patients.add(patient5);
        
        physicians.add(physician);
        physicians.add(physician2);
        physicians.add(physician3);
        physicians.add(physician4);
        physicians.add(physician5);
        
    }
    
    public List<Patient> getPatients() {
       return patients;
   } 
    public List<Physician> getPhysicians(){
        return physicians;
    }
    public String toString(){
        String s = "";
       for(Patient p : patients){
         s = s + p.toString()+"\n";
       }
       return s;
     
    }
}
