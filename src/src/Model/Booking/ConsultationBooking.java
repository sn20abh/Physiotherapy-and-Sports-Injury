/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Booking;

import Model.Physician;

public class ConsultationBooking extends AppointmentBooking{
    
    private String visitorName;
    private String note;

    public ConsultationBooking(Room room,String name,String vistorName, String date,Physician physician){
        super(room,name,date,physician);
        this.visitorName = visitorName;
    }
    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }


    
}
