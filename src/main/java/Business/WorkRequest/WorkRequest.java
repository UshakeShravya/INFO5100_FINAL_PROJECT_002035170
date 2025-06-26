/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

import Business.UserAccount.UserAccount;
import java.util.Date;
/**
 *
 * @author ushakeshravya
 */
public class WorkRequest {

    
    private String message;
    private String status;
    private UserAccount sender;
    private String receiver;
    private Date requestDate;
    

    public WorkRequest(String message, UserAccount sender, String receiver) {
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.status = "Pending";
        this.requestDate = new Date();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() { return message; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public UserAccount getSender() { return sender; }
    public String getReceiver() { return receiver; }
    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

}
