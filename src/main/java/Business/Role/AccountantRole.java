/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AccountantPanel.AccountantDashboardPanel;

/**
 *
 * @author ushakeshravya
 */
public class AccountantRole extends Role {
    @Override
  public JPanel createWorkArea(JPanel workArea, UserAccount ua, EcoSystem system) {
       return new AccountantDashboardPanel(workArea,ua, system);
  }
  
   @Override
    public String toString() {
        return "Accountant";
    }
    
}
