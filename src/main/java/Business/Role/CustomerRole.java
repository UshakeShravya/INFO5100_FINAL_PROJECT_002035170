/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.CustomerPanel.CustomerDashboardPanel;

/**
 *
 * @author ushakeshravya
 */
public class CustomerRole extends Role {
    @Override
  public JPanel createWorkArea(JPanel workArea, UserAccount ua, EcoSystem system) {
    // TODO: return your CustomerRole dashboard
    return new CustomerDashboardPanel(workArea, system, ua);
  }
  
  @Override
    public String toString() {
        return "Customer";
    }
    
}
