/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.TicketSellerPanel.TicketSellerDashboardPanel;

/**
 *
 * @author ushakeshravya
 */
public class TicketSellerRole extends Role {
    @Override
  public JPanel createWorkArea(JPanel workarea, UserAccount ua, EcoSystem system) {
    // TODO: return your TicketSellerRole dashboard
    return new TicketSellerDashboardPanel(workarea, ua, system);
  }
  
   @Override
    public String toString() {
        return "Ticket Seller";
    }
    
}
