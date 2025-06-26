/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

/**
 *
 * @author ushakeshravya
 */


import java.util.ArrayList;

public class UserAccountDirectory {
    private ArrayList<UserAccount> userList;
    
    public ArrayList<UserAccount> getUserList() {
    return userList;
}


    public UserAccountDirectory() {
        userList = new ArrayList<>();
    }

    public void addUserAccount(UserAccount ua) {
        userList.add(ua);
    }
    
    public void removeUserAccount(UserAccount ua) {
    userList.remove(ua);
}

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userList) {
            if (ua.getusername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
}
