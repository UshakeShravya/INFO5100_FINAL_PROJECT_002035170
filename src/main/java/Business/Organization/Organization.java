/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.Role;
import Business.WorkQueue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ushakeshravya
 */
public class Organization {
     private String name;
    private WorkQueue workQueue;

    public Organization(String name) {
        this.name = name;
        this.workQueue = new WorkQueue(); // ✅ Correct initialization
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
        public enum Type {
    Admin("Admin"),
    Concession("Concession"),
    Manager("Manager"),
    Technician("Technician"),
    TicketSeller("Ticket Seller"),
    Customer("Customer");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
    
        public List<Role> getSupportedRole() {
    return new ArrayList<>(); // default empty, override in subclasses
}

        
        @Override
public String toString() {
    return this.name; // or whatever you want to show in the dropdown
}
}

