/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.DistributorPanel.DistributorDashboardPanel;

/**
 *
 * @author ushakeshravya
 */
public class DistributorRole extends Role {

      @Override
  public JPanel createWorkArea(JPanel workArea, UserAccount ua, EcoSystem system) {
    // TODO: return your distributor dashboard
    return new DistributorDashboardPanel(workArea, ua,system);
  
  }   
}
