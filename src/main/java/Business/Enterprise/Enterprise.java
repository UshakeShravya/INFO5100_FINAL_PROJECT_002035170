/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ushakeshravya
 */
public class Enterprise {

    private String name;
    private String type; // changed from EnterpriseType to String
    private List<Organization> organizationList;

    public Enterprise(String name) {
        this.name = name;
        this.type = type;
        this.organizationList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }

}
