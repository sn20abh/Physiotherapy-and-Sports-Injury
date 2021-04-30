/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Booking.AppointmentBooking;
import Model.Booking.Status;

import java.util.Map;

public class Patient extends Person {


    private AppointmentBooking appointmentBooking;
    private Physician searchedPhysician;
    private Map<Integer,AppointmentBooking> treatmentAppointments;

    public AppointmentBooking getAppointmentBooking() {
        return appointmentBooking;
    }

    public void setTreatmentAppointments(Map<Integer, AppointmentBooking> treatmentAppointments) {
        this.treatmentAppointments = treatmentAppointments;
    }



    public Patient(int Id, String fullname, String address, String phone) {
        super(Id, fullname, address, phone);

    }

    public String toString() {
        return (super.getFullname() + " " + super.getAddress() + " " + super.getPhone() + " " + super.getId());
    }

    public void bookAppointment() {
        if(searchedPhysician!=null) {
            appointmentBooking = searchAppointments(searchedPhysician);
            appointmentBooking.setStatus(Status.BOOKED);
            System.out.println("Appointment booked");
        }
        else {
            System.out.println("Unable to book appointment because physician does not exist");
        }
    }

    public void getPhysicianByExpertise(String expertise) {

        for (Integer p : treatmentAppointments.keySet()) {
            Physician physician = treatmentAppointments.get(p).getPhysician();
            if (physician.getExpertise().contains(expertise)) {
                physician = searchedPhysician;
            }
        }

    }

    public void getPhysicianByName(String name) {

        for (Integer p : treatmentAppointments.keySet()) {
            Physician physician = treatmentAppointments.get(p).getPhysician();
            if (physician.getFullname().equalsIgnoreCase(name)) {
                searchedPhysician = physician;
                break;
            }
        }
    }

    /**
     * This method searches for an appointment that has a particular physician
     * @param physician
     * @return
     */
    private AppointmentBooking searchAppointments (Physician physician) {
        for (Map.Entry<Integer,AppointmentBooking> appointmentBookingEntry : treatmentAppointments.entrySet()) {
            if(physician.equals(appointmentBookingEntry.getValue().getPhysician())){
                return appointmentBookingEntry.getValue();
            }
        }
        return null;
    }

}
