/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

/**
 *
 * @author ushakeshravya
 */
public class TicketBookingRequest {
    private String showName;
    private int seats;
    private String customer;      // username who booked
    private String customerEmail;   // ← new
    private String status = "Pending";

    public TicketBookingRequest(String showName, int seats, String customer, String customerEmail) {
        this.showName = showName;
        this.seats     = seats;
        this.customer  = customer;
        this.customerEmail    = customerEmail;
        this.status   = "Pending";
    }
    // Getters / setters...
    public String getShowName() { return showName; }
    public int getSeats()       { return seats; }
    public String getCustomer(){ return customer; }
    public String getStatus()  { return status; }
    public void setStatus(String status) { status = status; }
    
    public void setShowName(String showName) { this.showName = showName; }
    public void setSeats(int seats)          { this.seats    = seats;    }
    public void setCustomer(String customer) { this.customer = customer; }
    
    // ← new getter/setter for the email:
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
