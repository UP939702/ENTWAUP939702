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
    public UserAccounts searchRecord (String email, String password) {
        UserAccounts userEmail = uaf.searchDBRecord(email, password);
    
        return userEmail;
    } 
    
    
}
