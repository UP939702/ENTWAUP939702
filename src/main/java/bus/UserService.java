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

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    
    
//    
//    public String doesUserExist (UserAccounts email) {
//        
//    }
    
    @EJB
    private UserAccountsFacade uaf;
    
    
    public String searchRecord (String email, String password) {
        String userEmail = uaf.searchDBRecord(email, password);
    
        return userEmail;
    } 
}
