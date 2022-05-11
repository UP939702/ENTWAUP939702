/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package bus;

import ents.UserAccounts;
import java.util.Calendar;
import java.util.Random;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pers.UserAccountsFacade;

/**
 *
 * @author roryj
 */
@Stateless
public class AddUserService {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @EJB
    private UserAccountsFacade uaf;

    /**
     *
     * @param name
     * @param email
     * @param password
     * @param delivery
     * @param payment
     * @return
     */
    public String setData(String name, String email, String password, String delivery, String payment) {
        Calendar c = Calendar.getInstance();
        long generatedLong = new Random().nextLong();
        UserAccounts ua = new UserAccounts();
        ua.setName(name);
        ua.setAdmin(Boolean.FALSE);
        ua.setEmail(email);
        ua.setPassword(password);
        ua.setLastDeliveryAdress(delivery);
        ua.setLastPaymentInfo(payment);
        ua.setLastLoggedIn(c.getTime());
        ua.setId(generatedLong);
        
        uaf.create(ua);
      
        
        return "";
        
    }
    
    
  
}
