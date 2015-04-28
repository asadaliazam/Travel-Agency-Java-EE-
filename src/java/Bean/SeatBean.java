/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.util.Random;

/**
 *
 * @author Asad
 */
public class SeatBean 
{
    int bookingNumber;
    CustomerBean obj;

    public SeatBean() {
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public CustomerBean getObj() {
        return obj;
    }

    public void setBookingNumber() {
        Random random = new Random();
        this.bookingNumber = Math.abs(random.nextInt())/555555;
    }

    public void setObj(CustomerBean obj) {
        this.obj = obj;
    }
    
}
