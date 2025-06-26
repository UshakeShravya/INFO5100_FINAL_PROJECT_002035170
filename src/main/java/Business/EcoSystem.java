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
import Business.Enterprise.Enterprise;
import Business.Organization.ConcessionOrganization;
import Business.Organization.Organization;
import Business.WorkRequest.FoodOrderRequest;
import Business.WorkRequest.WorkRequest;
import com.github.javafaker.Faker;




public class EcoSystem {
    private UserAccountDirectory userAccountDirectory;
    private List<MovieAcquisitionRequest> movieReqList = new ArrayList<>();
    private List<DistributionAssignmentRequest> distAssignList = new ArrayList<>();
    private List<StaffAssignmentRequest> staffReqList     = new ArrayList<>();
    private List<TicketingRequest>  ticketReqList        = new ArrayList<>();
    private List<TicketBookingRequest> ticketBookingReqs = new ArrayList<>();
    private List<FinancialUpdateRequest> financialReqs   = new ArrayList<>();
    private List<Enterprise> enterpriseList = new ArrayList<>();
    




    
    public List<Enterprise> getEnterpriseList() {
    return enterpriseList;
} 
    public EcoSystem() {
        this.userAccountDirectory = new UserAccountDirectory();
        preloadUsers(); // populate test users
        loadFakeData();
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
    
    public void loadFakeData() {
    Faker faker = new Faker();

    // Generate fake customers
    for (int i = 0; i < 5; i++) {
        String username = faker.name().username();
        String fullName = faker.name().fullName();

        userAccountDirectory.addUserAccount(new UserAccount(
            username,
            "cust@123",
            new CustomerRole(),
            "General Public",
            fullName
        ));
    }

    // Create some fake ticketing requests
    for (int i = 0; i < 10; i++) {
        TicketingRequest req = new TicketingRequest();  // ✅ You may need to ensure this constructor exists
        req.setMovieTitle(faker.book().title());
        req.setNumTickets(faker.number().numberBetween(1, 5));
        req.setStatus("Issued");
        // Optional: only if setter exists
        // req.setRequestDate(new Date());

        ticketReqList.add(req);
    }

    // Create some fake food orders
    for (int i = 0; i < 8; i++) {
        FoodOrderRequest order = new FoodOrderRequest();
        order.setStatus("Processed");
        // order.setRequestDate(new Date());  // only if setter exists

        // Random customer
        UserAccount customer = userAccountDirectory.getUserList().stream()
            .filter(u -> u.getRole() instanceof CustomerRole)
            .findAny()
            .orElse(null);

        if (customer != null) {
            order.setSender(customer);
        }

        List<CartItem> items = new ArrayList<>();
        for (int j = 0; j < faker.number().numberBetween(1, 4); j++) {
            CartItem item = new CartItem(
                faker.food().dish(),
                faker.number().numberBetween(1, 3),  // quantity
                faker.number().numberBetween(5, 20)  // price
            );
            items.add(item);
        }

        order.setCartItems(items);
        foodOrderRequests.add(order);
    }
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
    

    
    private List<FoodOrderRequest> foodOrderRequests = new ArrayList<>();

public List<FoodOrderRequest> getFoodOrderRequests() {
    return foodOrderRequests;
}

public void addFoodOrderRequest(FoodOrderRequest request) {
    this.foodOrderRequests.add(request);
}



}
