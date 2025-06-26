/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.WorkRequest.WorkRequest;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ushakeshravya
 */
public class WorkQueue {
    
     private List<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public List<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void add(WorkRequest request) {
        workRequestList.add(request);
    }

    public void remove(WorkRequest request) {
        workRequestList.remove(request);
    }

    
    
}
