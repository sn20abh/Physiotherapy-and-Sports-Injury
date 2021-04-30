/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Booking;

import Model.Physician;


public class TreatmentBooking extends AppointmentBooking {
    
    private String treatmentType;
     
     
    public TreatmentBooking(Room room,String name,String treatmentType,String date,Physician physician){
        super(room,name,date,physician);
        this.treatmentType = treatmentType;
        
    }
    
    public String getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(String treatmentType) {
        this.treatmentType = treatmentType;
    }
    
    
    public String toString(){
        return (super.getPhysician()+" "+super.getName()+" "+super.getStatus()
          +" "+treatmentType +super.getRoom()+super.getStatus()+""+super.getDate()+"\n");
    }
    
    
}
