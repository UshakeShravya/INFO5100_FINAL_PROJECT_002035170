/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Organization.Organization;
import Business.Role.Role;

/**
 *
 * @author ushakeshravya
 */


public class UserAccount {
    private String username;
    private String password;
    private Role role;
    private String organization;
    private String name;

    public UserAccount(String username, String password, Role role, String organization, String name) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.organization = organization;
        this.name = name;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public Role getRole() { return role; }
    public String getOrganization() { return organization; }
    public String getName() { return name; }
  

}


