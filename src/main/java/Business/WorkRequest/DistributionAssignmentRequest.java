/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

/**
 *
 * @author ushakeshravya
 */
public class DistributionAssignmentRequest {

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    private String movieTitle;
    private double budget;
    private String status  = "Pending";        // e.g. “Assigned” or “Unassigned”
    private String assignedManager;
    
    public DistributionAssignmentRequest(String movieTitle, double budget) {
        this.movieTitle = movieTitle;
        this.budget     = budget;
        this.status     = "Unassigned";
        
    }
    
       public String getMovieTitle()    { return movieTitle;    }
    public double getBudget()        { return budget;        }
    public String getStatus()        { return status;        }
    public void   setStatus(String s){ this.status = s;      }
    public String getAssignedManager()           { return assignedManager; }
    public void   setAssignedManager(String mgr) { 
        this.assignedManager = mgr; 
        this.status          = "Assigned";
    }
}
