/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Patient;
import Model.PersonDb;
import Model.Physician;
import java.util.ArrayList;
import java.util.List;


public class PersonController {
         List <Patient> patients;
         List<Physician> physicians;
          PersonDb pb = new PersonDb();
        
        public PersonController(){

            patients = pb.getPatients();
            physicians = pb.getPhysicians();
        }
        
    public String getPatients(){
       
     String s = "";
       for(Patient patient : patients){
           s = s + patient.toString();
        }
     return s;        
        
    }
    
    public String getPhysicians(){
       
     String s = "";
       for(Physician physician : physicians){
           s = s + physician.toString();
        }
     return s;        
        
    }
}
