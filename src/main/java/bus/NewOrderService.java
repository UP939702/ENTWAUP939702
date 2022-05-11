/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package bus;

import ents.orders;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pers.ordersFacade;

/**
 *
 * @author roryj
 */
@Stateless
public class NewOrderService {

    
    @EJB
    private ordersFacade of;

    /**
     *
     * @param delivery
     * @param payment
     * @param email
     * @param total
     * @param ID
     * @param length
     */
    public void newOrder (String delivery, String payment, String email, double total, String ID, int length) {
        Calendar c = Calendar.getInstance();
        long generatedLong = new Random().nextLong();
        orders o = new orders();
        o.setDateO(c.getTime());
        o.setDelivery(delivery);
        o.setId(generatedLong);
        o.setPayment(payment);
        o.setQuantity(length);
        o.setStatus("ordered");
        o.setTotal(total);
        o.setUserEmail(email);
        
        of.create(o);
        
        
        
        
    
       
        
        
    }
}
