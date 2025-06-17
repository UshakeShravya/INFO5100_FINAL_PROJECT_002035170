/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkRequest;

/**
 *
 * @author ushakeshravya
 */
public class MovieAcquisitionRequest {
    private String movieTitle;
    private double budget;
    private String status;
    
    public MovieAcquisitionRequest(String movieTitle, double budget) {
        this.movieTitle = movieTitle;
        this.budget     = budget;
        this.status     = "Pending";
    }

     public String getMovieTitle() { return movieTitle; }
    public void setMovieTitle(String movieTitle) { this.movieTitle = movieTitle; }

    public double getBudget() { return budget; }
    public void setBudget(double budget) { this.budget = budget; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
}

