/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package bus;

import ents.UserAccounts;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pers.UserAccountsFacade;

/**
 *
 * @author roryj
 */
@Stateless
public class UserService {

    
    @EJB
    private UserAccountsFacade uaf;
    
    /**
     *
     * @param email
     * @param password
     * @return
     */
    public String searchRecord (String email, String password) {
        String userEmail = uaf.searchDBRecord(email, password);
    
        return userEmail;
    } 
    
    public String checkAdmin(String email) {
        System.out.println(email + "WOW this sux");
        String status = uaf.searchAdmin(email);
        return status;
    }
}
