/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author ushakeshravya
 */


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public abstract class Role {
    public abstract JPanel createWorkArea(JPanel workArea, UserAccount account, EcoSystem system);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
