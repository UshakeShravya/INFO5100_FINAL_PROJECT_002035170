/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Setup;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ConcessionOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
/**
 *
 * @author ushakeshravya
 */
public class ConfigureCinemaBusiness {
     public static EcoSystem configure() {
        EcoSystem system = new EcoSystem();

       Enterprise testEnterprise = new Enterprise("Main Cinema Enterprise"); // create enterprise
ConcessionOrganization concessionOrg = new ConcessionOrganization(); // create concession org
testEnterprise.getOrganizationList().add(concessionOrg); // add to enterprise
system.getEnterpriseList().add(testEnterprise); // register in ecosystem


        return system;
    }
    
    
}
