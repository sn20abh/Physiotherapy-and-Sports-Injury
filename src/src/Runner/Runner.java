/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runner;

import Controller.PersonController;
import Model.Booking.AppointmentBooking;
import Model.Booking.Booking;
import Model.Patient;
import Model.PersonDb;
import Model.Physician;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Runner {
    
    public static void main (String [] args){
        
        
        PersonDb pb = new PersonDb();
       // Physician physician = new Physician(1, "samuel", "hello", "test", 56458);
        Booking bookings = new Booking();
        bookings.addData();
        pb.addData();
        
       
         PersonController pc = new PersonController();
        List<Patient> patientsList= pb.getPatients();

        Map<Integer, AppointmentBooking> appointmentBookings = bookings.getTreatmentBookingAppointments();
        patientsList.get(0).setTreatmentAppointments(appointmentBookings);
        patientsList.get(0).getPhysicianByName("lola");
        patientsList.get(0).bookAppointment();
       // System.out.println(patientsList.get(0).getAppointmentBooking().getStatus());

        patientsList.get(1).setTreatmentAppointments(appointmentBookings);
        patientsList.get(1).getPhysicianByName("tomi test");
        patientsList.get(1).bookAppointment();
        System.out.println(patientsList.get(1).getAppointmentBooking().getStatus());



//        System.out.println(bc.bookAppointment(3));
        //System.out.println(bc.getPhysicianByName("tomi test"));


    }

}
