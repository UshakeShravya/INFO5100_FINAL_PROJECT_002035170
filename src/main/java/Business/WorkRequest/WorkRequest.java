/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

/**
 *
 * @author ushakeshravya
 */
public class WorkRequest {
    private String message;
    private String status;
    private String sender;
    private String receiver;

    public WorkRequest(String message, String sender, String receiver) {
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.status = "Pending";
    }

    public String getMessage() { return message; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getSender() { return sender; }
    public String getReceiver() { return receiver; }
    
}
