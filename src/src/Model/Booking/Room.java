/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Booking;


public class Room {
    
    private String suite;
    private String roomType;

    public Room(String suite, String roomType) {
        this.suite = suite;
        this.roomType = roomType;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    
    public String toString(){
        return (suite+" "+" "+roomType);
    }
}
