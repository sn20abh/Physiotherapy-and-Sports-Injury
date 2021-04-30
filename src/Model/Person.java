/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public abstract class Person {
     private int Id;
     private String fullname;
     private String address;
     private String phone;

    public Person(int Id, String fullname, String address, String phone) {
        this.Id = Id;
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
     
     public String toString(){
         return (fullname +" "+address+" "+phone+ " "+Id);
      
     }
    
}
