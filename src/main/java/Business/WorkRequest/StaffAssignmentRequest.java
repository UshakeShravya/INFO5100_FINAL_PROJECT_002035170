/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

/**
 *
 * @author ushakeshravya
 */
public class StaffAssignmentRequest {
    
    private String movieTitle;
    private double budget;
    private String assignedStaff;
    private String status = "Pending";
    
      public StaffAssignmentRequest(String movieTitle, double budget, String assignedStaff) {
        this.movieTitle = movieTitle;
        this.budget = budget;
        this.assignedStaff = assignedStaff;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getAssignedStaff() {
        return assignedStaff;
    }

    public void setAssignedStaff(String assignedStaff) {
        this.assignedStaff = assignedStaff;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
