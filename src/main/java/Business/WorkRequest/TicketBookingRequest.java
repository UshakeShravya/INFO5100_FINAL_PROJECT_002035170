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
    private String seats;
    private String customer;      // username who booked
    private String customerEmail;   // ← new
    private String status = "Pending";

    public TicketBookingRequest(String showName, String seats, String username, String email) {
        this.showName = showName;
        this.seats = seats;
        this.customer = username;
       this.customerEmail = email;

        this.status = "Booked";
    }
    // Getters / setters...
    public String getShowName() { return showName; }
    public String getSeats()       { return seats; }
    public String getCustomer(){ return customer; }
    public String getStatus()  { return status; }
    public void setStatus(String status) { status = status; }
    
    public void setShowName(String showName) { this.showName = showName; }
    public void setSeats(String seats)          { this.seats    = seats;    }
    public void setCustomer(String customer) { this.customer = customer; }
    
    // ← new getter/setter for the email:
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
