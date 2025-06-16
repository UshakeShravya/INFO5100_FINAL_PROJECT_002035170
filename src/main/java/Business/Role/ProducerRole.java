/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.ProducerPanel.ProducerDashboardPanel;

/**
 *
 * @author ushakeshravya
 */

public class ProducerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, EcoSystem system) {
       
        return new ProducerDashboardPanel(workArea,account,system);
       
    }
      @Override
    public String toString() {
        return "Producer";
    }


}
