/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Booking;

import Model.Physician;
import java.util.ArrayList;
import java.util.HashMap;

 
public class AppointmentBooking {
    
    //enum  attended {yes,no};
    private Room room;
    //private final attended attended;
   // attended attended; //changes to status booked,attended,changed 
    
    private String name;
    private Physician physician;
    private String date;
    Status status;

    public AppointmentBooking(Room room,String name,String date,Physician physician){
        this.room = room;
        this.name = name;
       // this.attended = attended.no;
        this.date = date;
        this.physician = physician;
        status = status;
        
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
  
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Physician getPhysician() {
        
        return physician;
    }

    public void setPhysician(Physician p) {
       this.physician = p;
    }
    
//    public String getAppointmentByExpertise(String query){
//    String s = "";
//    
//     for(Physician physicia : physician){
//         if(physicia.getExpertise().equalsIgnoreCase(query)){
//             s = s + this.toString();
//         }
//     }
//        return s;
//    }
    public String toString(){
        return (room+" "+name+" "+physician+" "+date);        
    }

    
}
