/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.CartItem;
import java.util.ArrayList;
import java.util.List;


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
    private List<CartItem> cart = new ArrayList<>();

    public UserAccount(String username, String password, Role role, String organization, String name) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.organization = organization;
        this.name = name;
    }

    public String getusername() { return username; }
    public String getPassword() { return password; }
    public Role getRole() { return role; }
    public String getOrganization() { return organization; }
    public String getName() { return name; }
    public List<CartItem> getCart() {
        return cart;
    }

    public void setCart(List<CartItem> cart) {
        this.cart = cart;
    }
    
    public void setusername(String username) {
    this.username = username;
}

}


