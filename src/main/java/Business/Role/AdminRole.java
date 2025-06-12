/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.*;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import ui.AdminPanel.AdminDashboardPanel;
/**
 *
 * @author ushakeshravya
 */
public class AdminRole extends Role {
     @Override
    public JPanel createWorkArea(JPanel workarea, UserAccount account, EcoSystem system) {
        return new AdminDashboardPanel(workarea, account, system); // match your constructor
    }
    
}
