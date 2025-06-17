/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

/**
 *
 * @author ushakeshravya
 */
public class FinancialUpdateRequest {
    
     private String description;      // e.g. “Ticket Seller issued X tickets”
    private double amount;      // whatever the accountant needs to process
    private String status = "Pending";

    public FinancialUpdateRequest(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }
    
    // getters & setters
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
