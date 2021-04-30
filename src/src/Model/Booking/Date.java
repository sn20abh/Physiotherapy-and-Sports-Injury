/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Booking;


public class Date {
    
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    
    /** reset the date - no checking
     */
    public void setDate(int dd, int mm, int yy)
    {
        day = dd;
        month = mm;
        year = yy;
    }
    
    /** return the month number
     */
    public int getMonth()
    {
        return month;
    }
       

    public String getAsString ()
    {
        return as2Digits(day) + "/" + as2Digits(month) + "/" + year;
    }
    
    /** Internal method to add a leading zero if necessary. */
    private String as2Digits (int i)
    {
        if (i <10) 
        {
            return "0" + i;
        }
        else 
        {
            return "" + i;
        }
    }
}
