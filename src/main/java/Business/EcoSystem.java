/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;


import Business.Enterprise.Enterprise;
import Business.Role.ProducerRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.List;
import Business.Role.AdminRole;
import Business.Role.ConcessionStaffRole;
import Business.Role.CustomerRole;
import Business.Role.DistributorRole;
import Business.Role.TechnicianRole;
import Business.Role.AccountantRole;
import Business.Role.ManagerRole;
import Business.Role.TicketSellerRole;
import Business.WorkRequest.DistributionAssignmentRequest;
import Business.WorkRequest.FinancialUpdateRequest;
import Business.WorkRequest.MovieAcquisitionRequest;
import Business.WorkRequest.StaffAssignmentRequest;
import Business.WorkRequest.TicketingRequest;
import Business.WorkRequest.TicketBookingRequest;
import java.util.*;



public class EcoSystem {
    private UserAccountDirectory userAccountDirectory;
    private List<MovieAcquisitionRequest> movieReqList = new ArrayList<>();
    private List<DistributionAssignmentRequest> distAssignList = new ArrayList<>();
    private List<StaffAssignmentRequest> staffReqList     = new ArrayList<>();
    private List<TicketingRequest>  ticketReqList        = new ArrayList<>();
    private List<TicketBookingRequest> ticketBookingReqs = new ArrayList<>();
    private List<FinancialUpdateRequest> financialReqs   = new ArrayList<>();
    

    public EcoSystem() {
        this.userAccountDirectory = new UserAccountDirectory();
        preloadUsers(); // populate test users
    }

    private void preloadUsers() {
        
    // Add one Admin:
    userAccountDirectory.addUserAccount(
        new UserAccount("admin",     "admin123",    new AdminRole(),    "Oversight & Finance",  "Shravya")
    );
    
    // Add one Producer:
    userAccountDirectory.addUserAccount(new UserAccount("producer1", "producer@123", new ProducerRole(),    "Content Acquisition",  "Producer One")
    );
    
    // Add one Distributor:
    userAccountDirectory.addUserAccount(new UserAccount(
            "distributor1",
            "dist@123", 
            new DistributorRole(),
            "Distribution Team",
            "Distributor One"
        )
    );
    
     // Add one ManagerRole:
    userAccountDirectory.addUserAccount(new UserAccount("manager1", "mg@123", new ManagerRole(), "Operational Management", "Manager One")
    );
    
      // Add one TechnicianRole:
    userAccountDirectory.addUserAccount(
        new UserAccount("tech1", "tech@123", new TechnicianRole(), "Facility Staff", "Technician One")
    );

    // Add one Concession Staff:
    userAccountDirectory.addUserAccount(new UserAccount("concession1", "conc@123", new ConcessionStaffRole(), "Food Services", "Concession One")
    );
    
    
    // Add one Customer:
    userAccountDirectory.addUserAccount(new UserAccount(
        "customer1", "cust@123", new CustomerRole(),
        "General Public", "Customer One"
    ));
    
    // Add one TicketSellerRole:
    userAccountDirectory.addUserAccount(new UserAccount("ticketseller1", "ts@123", new TicketSellerRole(), "Box Office", "TicketSeller One")
    );
    
    // Add one AccountantRole:
    userAccountDirectory.addUserAccount(new UserAccount("accountant1", "acc@123", new AccountantRole(), "Oversight Finance", "Accountant One")
    );
    
   
}

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public UserAccount authenticateUser(String username, String password) {
        return userAccountDirectory.authenticateUser(username, password);
    }
    
     // DistributorRole ← Add this!
    
    
    public List<MovieAcquisitionRequest> getMovieRequests() {
        return movieReqList;
    }
    public void addMovieRequest(MovieAcquisitionRequest r) {
        movieReqList.add(r);
    }
    
    // ** new for DistributionAssignmentRequests **
    public List<DistributionAssignmentRequest> getDistributionAssignments() {
        return distAssignList;
    }
    public void addDistributionAssignment(DistributionAssignmentRequest r) {
        distAssignList.add(r);
    }
    

    public List<StaffAssignmentRequest> getStaffAssignmentRequests() {
        return staffReqList;
    }
    public void addStaffAssignmentRequest(StaffAssignmentRequest r) {
        staffReqList.add(r);
    }

    public List<TicketingRequest> getTicketingRequests() {
        return ticketReqList;
    }
    public void addTicketingRequest(TicketingRequest r) {
        ticketReqList.add(r);
    }
    
    public List<TicketBookingRequest> getTicketBookingRequests() {
        return ticketBookingReqs;
    }
    public void addTicketBookingRequest(TicketBookingRequest r) {
        ticketBookingReqs.add(r);
    }

    public List<FinancialUpdateRequest> getFinancialRequests() {
        return financialReqs;
    }

    public void addFinancialRequest(FinancialUpdateRequest r) {
        financialReqs.add(r);
    }

}


